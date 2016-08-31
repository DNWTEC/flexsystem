package com.chochae.afes.user.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.chochae.afes.user.dao.UserDAO;
import com.chochae.afes.user.model.UserInfo;

public class UserDAOImpl implements UserDAO{
	private DataSource dataSource;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	@Override
	public boolean userExistYn(String userId) {
		String sql = "SELECT * FROM USER WHERE USER_ID = ?";

		Connection conn = null;

		boolean userExist = false;
		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, userId);
			ResultSet rs = ps.executeQuery();
			
			if (rs.next()) {
				userExist = true;
			}
			rs.close();
			ps.close();
			return userExist;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			if (conn != null) {
				try {
				conn.close();
				} catch (SQLException e) {}
			}
		}
	}

	@Override
	public boolean insertUser(UserInfo user) {
		String sql = "INSERT INTO `user`(`USER_ID`,`USER_NAME`,`PHONE_NO`,`USER_TYPE`,`ADDRESS`,`LOCALE`,`EMAIL`,`OPERATE_AMOUNT`,`ACTIVE_YN`,`PARENT_ID`,`PASSWORD`) VALUES" +
						"(?, ?, ?, ?, ?, ? , ? ,?, ? ,?, ?)";
		Connection conn = null;

		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			int i = 1;
			ps.setString(i++, user.getUserId());
			ps.setString(i++, user.getUserName());
			ps.setString(i++, user.getPhoneNo());
			ps.setString(i++, user.getUserType());
			ps.setString(i++, user.getAddress());
			ps.setInt(i++, user.getLocale());
			ps.setString(i++, user.getEmail());
			ps.setFloat(i++, user.getAmount());
			ps.setString(i++, user.isActiveYn() ? "Y" : "N");
			ps.setString(i++, user.getParentId());
			ps.setString(i++, user.getPassword());
			ps.executeUpdate();
			ps.close();

		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {}
			}
		}
		return true;
	}
}
