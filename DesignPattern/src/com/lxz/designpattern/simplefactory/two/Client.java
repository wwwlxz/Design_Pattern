package com.lxz.designpattern.simplefactory.two;

/*
 * 客户端，使用Api接口
 * $date 2015-5-13
 */
public class Client {
	public static void main(String[] args){
		//通过简单工厂来获取接口对象
		Api api = Factory.createApi(2);
		api.operation("正在使用简单工厂");
	}
}
