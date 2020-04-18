package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dbutils.DBUtils;
import pojo.ProductDetails;

public class ProductManagmentDao {

	public static List<ProductDetails> getProductList() {
		List<ProductDetails> productList = new ArrayList<ProductDetails>();
		try {
			Connection con = DBUtils.getConnection();
			String query = "select * from product";
			PreparedStatement pt = con.prepareStatement(query);
			ResultSet rs = pt.executeQuery();
			while (rs.next()) {
				ProductDetails details = new ProductDetails(rs.getInt("id"), rs.getString("productName"),
						rs.getString("productPrice"), rs.getString("productCategory"));
				productList.add(details);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return productList;

	}

	public static int addProducts(ProductDetails productDetails) {
		int i = 0;
		System.out.println("inside addProducts...........");
		try {
			Connection con = DBUtils.getConnection();
			String sql = "insert into product(productName,productPrice,productCategory) values(?,?,?)";
			PreparedStatement pt1 = con.prepareStatement(sql);
			System.out.println("pt1 ---" + pt1.toString());
			pt1.setString(1, productDetails.getProductName());
			pt1.setString(2, productDetails.getProductPrice());
			pt1.setString(3, productDetails.getProductCategory());

			i = pt1.executeUpdate();
			System.out.println("i 111" + i);
			DBUtils.closeConnection(con);
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("i 22" + i);
		return i;
	}

	public static ProductDetails getProductsById(int productId) {
		ProductDetails productDetails = null;
		try {
			System.out.println("getProductsById ------------productId---------" + productId);
			Connection con = DBUtils.getConnection();
			String sql = "select * from product where id=?";
			PreparedStatement pt1 = con.prepareStatement(sql);
			pt1.setInt(1, productId);
			System.out.println("pt1 ---" + pt1.toString());
			ResultSet rs = pt1.executeQuery();
			while (rs.next()) {
				productDetails = new ProductDetails(rs.getInt("id"), rs.getString("productName"),
						rs.getString("productCategory"), rs.getString("productPrice"));
				// ProductDetails productDetails=new ProductDetails(productId, productName,
				// productCategory, productPrice);
				System.out.println("----id-" + rs.getInt("id") + "name-----" + rs.getString("productName"));
				System.out.println("category -- " + rs.getString("productCategory"));
				System.out.println("price -----" + rs.getString("productPrice"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return productDetails;
	}

	public static int updateProduct(ProductDetails details) {
		int i = 0;
		try {
			System.out.println("updateProduct ---------------------");
			System.out.println("id----" + details.getProductId());
			System.out.println("name----" + details.getProductName());
			System.out.println("price----" + details.getProductPrice());
			System.out.println("category----" + details.getProductCategory());

			Connection con = DBUtils.getConnection();
			String sql = "update product set productName=?,productPrice=?,productCategory=? where id=?";
			PreparedStatement pt1 = con.prepareStatement(sql);
			pt1.setString(1, details.getProductName());
			pt1.setString(2, details.getProductPrice());
			pt1.setString(3, details.getProductCategory());
			pt1.setInt(4, details.getProductId());
			System.out.println("pt1 ---" + pt1.toString());

			i = pt1.executeUpdate();
			System.out.println("i ------updateProduct----------" + i);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return i;
	}

	public static int deleteProduct(Integer productId) {
		int i = 0;
		try {
			Connection con = DBUtils.getConnection();
			String sql = "delete from product where id=?";
			PreparedStatement pt1 = con.prepareStatement(sql);

			pt1.setInt(1, productId);
			System.out.println("pt1 ---" + pt1.toString());
			i = pt1.executeUpdate();
		}

		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return i;

	}

}
