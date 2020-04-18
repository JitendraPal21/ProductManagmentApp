package action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import dao.ProductManagmentDao;
import pojo.ProductDetails;

public class WelcomeAction extends ActionSupport {

	List<ProductDetails> products;

	public void initializeProducts() {
		products = ProductManagmentDao.getProductList();
	}

	@Override
	public String execute() {
		System.out.println("Inside execute method.....");
		initializeProducts();
		return "success";

	}

	public List<ProductDetails> getProducts() {
		return products;
	}

	public void setProducts(List<ProductDetails> products) {
		this.products = products;
	}

}
