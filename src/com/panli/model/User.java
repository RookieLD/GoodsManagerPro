package com.panli.model;
/**
 * ����Աt_user���Userʵ����
 * @author Peter
 *
 */
public class User {
	private int id;//id�ֶ�
	private String userName;//userName�ֶ�
	private String password;//password�ֶ�
	
	//�̳и���Ĺ��췽��
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * ���ظ���Ĺ��췽����2������
	 * @param userName
	 * @param password
	 */
	public User(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
