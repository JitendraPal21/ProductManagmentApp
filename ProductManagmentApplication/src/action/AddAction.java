package action;

import com.opensymphony.xwork2.ActionSupport;

import dao.ProductManagmentDao;
import pojo.ProductDetails;

public class AddAction extends ActionSupport {
	String productName;
	String productCategory;
	String productPrice;

	@Override
	public String execute() {
		System.out.println("execute method called................");
		String status = "error";
		ProductDetails pg = new ProductDetails(productName, productCategory, productPrice);
		System.out.println("after adding ................");
		int i = ProductManagmentDao.addProducts(pg);
		System.out.println("after i value ................");
		if (i == 1)
			status = "success";
		return status;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(String productPrice) {
		this.productPrice = productPrice;
	}

	public String getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}
}
