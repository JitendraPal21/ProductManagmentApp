package action;

import com.opensymphony.xwork2.ActionSupport;

import dao.ProductManagmentDao;
import pojo.ProductDetails;

public class UpdateDataAction extends ActionSupport {

	Integer productId;
	String productName;
	String productCategory;
	String productPrice;

	@Override
	public String execute() {
		System.out.println("execute method called........productId........" + productId);
		String status = "success";
		ProductDetails pg = ProductManagmentDao.getProductsById(productId);
		productId = pg.getProductId();
		productName = pg.getProductName();
		productPrice = pg.getProductPrice();
		productCategory = pg.getProductCategory();
		System.out.println(
				" in execute after getting data..id " + productId + "name  " + productName + "price  " + productPrice);

		System.out.println("after adding ................");
		// int i = ProductManagmentDao.addProducts(pg);
		// System.out.println("after i value ................");
		// if (i == 1)

		return status;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}

	public String getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(String productPrice) {
		this.productPrice = productPrice;
	}

}
