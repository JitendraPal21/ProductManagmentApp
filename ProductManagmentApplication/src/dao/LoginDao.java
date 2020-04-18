package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dbutils.DBUtils;
import pojo.LoginInfo;

public class LoginDao {
	public static Boolean isUserValid(LoginInfo loginInfo) {
		boolean isValid = false;
		try {
			String userName = loginInfo.getUserName();
			String password = loginInfo.getPassword();
			String query = "select * from login_info where user_name=? and password=?";
			System.out.println("query " + query);
			Connection con = DBUtils.getConnection();

			PreparedStatement pt = con.prepareStatement(query);
			pt.setString(1, userName);
			pt.setString(2, password);
			ResultSet rs = pt.executeQuery();
			while (rs.next()) {
				isValid = true;
			}
			DBUtils.closeConnection(con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("isValid " + isValid);
		return isValid;
	}

}
