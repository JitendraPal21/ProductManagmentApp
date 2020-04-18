package action;

import com.opensymphony.xwork2.ActionSupport;

import dao.ProductManagmentDao;
import pojo.ProductDetails;

public class UpdateAction extends ActionSupport {

	Integer productId;
	String productName;
	String productCategory;
	String productPrice;

	@Override
	public String execute() {
		String status = "error";
		System.out.println("productId inside execute -----" + productId);
		ProductDetails details = new ProductDetails(productId, productName, productCategory, productPrice);
		int i = ProductManagmentDao.updateProduct(details);
		if (i == 1)
			status = "success";
		return status;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
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
