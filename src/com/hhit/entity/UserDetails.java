package com.hhit.entity;

import java.sql.Timestamp;
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Untitled
//  @ File Name : UserDetails.java
//  @ Date : 2016/3/25
//  @ Author : 
//
//
import java.util.Set;


public class UserDetails implements java.io.Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String userName;
	private String userNum;
	private String sex;
	private String email;
	private Timestamp birthday;
	private String telphone;
	private String qqNum;
	private Integer msgCount;
	private Integer userLevel;
	private String faceIcon;
	private String weChatNum;
	private String otherInfo;
	private Timestamp loginTime;
	private Timestamp logoutTime;
	private String lastViewPage;
	
	private User user;
	private Department department;
	private Set<Role> roles;

	/**
	 * 默认构造函数,用户初始化，有重载则不可缺少
	 */
	public UserDetails(){
		
	}
	/**
	 * 构造函数，用于安装
	 */
	public UserDetails(String uname,String unum,String se,String em,
			String tel,String qq,Integer mC,Integer uL,
			Department dept){
		userName=uname;
		userNum=unum;
		sex=se;
		email=em;
		//birthday=
		telphone=tel;
		qqNum=qq;
		msgCount=mC;
		userLevel=uL;
		//user
		department=dept;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserNum() {
		return userNum;
	}

	public void setUserNum(String userNum) {
		this.userNum = userNum;
	}

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Timestamp getBirthday() {
		return birthday;
	}

	public void setBirthday(Timestamp birthday) {
		this.birthday = birthday;
	}

	public String getTelphone() {
		return telphone;
	}

	public void setTelphone(String telphone) {
		this.telphone = telphone;
	}

	public String getQqNum() {
		return qqNum;
	}

	public void setQqNum(String qqNum) {
		this.qqNum = qqNum;
	}

	public Integer getMsgCount() {
		return msgCount;
	}

	public void setMsgCount(Integer msgCount) {
		this.msgCount = msgCount;
	}

	public Integer getUserLevel() {
		return userLevel;
	}

	public void setUserLevel(Integer userLevel) {
		this.userLevel = userLevel;
	}

	public String getFaceIcon() {
		return faceIcon;
	}

	public void setFaceIcon(String faceIcon) {
		this.faceIcon = faceIcon;
	}

	public String getWeChatNum() {
		return weChatNum;
	}

	public void setWeChatNum(String weChatNum) {
		this.weChatNum = weChatNum;
	}

	public String getOtherInfo() {
		return otherInfo;
	}

	public void setOtherInfo(String otherInfo) {
		this.otherInfo = otherInfo;
	}

	public Timestamp getLoginTime() {
		return loginTime;
	}

	public void setLoginTime(Timestamp loginTime) {
		this.loginTime = loginTime;
	}

	public Timestamp getLogoutTime() {
		return logoutTime;
	}

	public void setLogoutTime(Timestamp logoutTime) {
		this.logoutTime = logoutTime;
	}

	public String getLastViewPage() {
		return lastViewPage;
	}

	public void setLastViewPage(String lastViewPage) {
		this.lastViewPage = lastViewPage;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}


}
