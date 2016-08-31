package com.chochae.afes.user.dao;

import com.chochae.afes.user.model.UserInfo;

public interface UserDAO {
	
	public boolean userExistYn(String UserId);
	
	public boolean insertUser(UserInfo user);
	
	
}
