package action;

import dao.ProductManagmentDao;

public class DeleteAction {
	Integer productId;

	public Integer getProductId() {
		return productId;
	}

	public String execute() {
		String status = "error";
		System.out.println("productId inside execute -----" + productId);
		int i = ProductManagmentDao.deleteProduct(productId);
		if (i == 1)
			status = "success";
		return status;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

}
