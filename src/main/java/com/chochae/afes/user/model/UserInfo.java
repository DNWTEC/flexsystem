package com.chochae.afes.user.model;

public class UserInfo {

	private String 		userId;
	private String 		userName;
	private String 		password;
	private String		phoneNo;
	private String		userType;
	
	private String		address;
	private int			locale;
	private String 		email;
	private float		amount;
	private boolean		activeYn;
	private	String		parentId;
	
	
	public UserInfo() {
		super();
	}
	
	public UserInfo(String userId, String userName, String password, String phoneNo, String address, int locale,
			String email) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.phoneNo = phoneNo;
		this.userType = "NONE";
		this.address = address;
		this.locale = locale;
		this.email = email;
		this.amount = 0;
		this.activeYn = true;
		this.parentId = "";
	}

	public UserInfo(String userId, String userName, String password, String phoneNo, String userType, String address,
			int locale, String email, float amount, boolean activeYn, String parentId) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.phoneNo = phoneNo;
		this.userType = userType;
		this.address = address;
		this.locale = locale;
		this.email = email;
		this.amount = amount;
		this.activeYn = activeYn;
		this.parentId = parentId;
	}


	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getLocale() {
		return locale;
	}
	public void setLocale(int locale) {
		this.locale = locale;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	public boolean isActiveYn() {
		return activeYn;
	}
	public void setActiveYn(boolean activeYn) {
		this.activeYn = activeYn;
	}
	public String getParentId() {
		return parentId;
	}
	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "UserInfo [userId=" + userId + ", userName=" + userName + ",  phoneNo="
				+ phoneNo + ", userType=" + userType + ", address=" + address + ", locale=" + locale + ", email="
				+ email + ", amount=" + amount + ", activeYn=" + activeYn + ", parentId=" + parentId + "]";
	}
	
}
