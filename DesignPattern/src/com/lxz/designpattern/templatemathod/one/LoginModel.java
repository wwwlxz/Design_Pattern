package com.lxz.designpattern.templatemathod.one;
/*
 * 描述登录人员登陆时填写的信息的数据模型
 */
public class LoginModel {
	private String userId,pwd;
	public String getUserId(){
		return userId;
	}
	
	public void setUserId(String UserId){
		this.userId = UserId;
	}
	
	public String getPwd(){
		return pwd;
	}
	
	public void setPwd(String pwd){
		this.pwd = pwd;
	}
}