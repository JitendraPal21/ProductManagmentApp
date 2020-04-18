package action;

import com.opensymphony.xwork2.ActionSupport;

import dao.LoginDao;
import pojo.LoginInfo;

public class LoginAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	String userName;
	String password;

	@Override
	public String execute() {

		String statusCode = "";
		System.out.println("execute method called.......");
		boolean isValidUser = LoginDao.isUserValid(new LoginInfo(userName, password));
		System.out.println("isValidUser " + isValidUser);
		if (isValidUser == true) {
			statusCode = "success";
		} else {
			statusCode = "input";
		}

		System.out.println("statusCode " + statusCode);
		return statusCode;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
