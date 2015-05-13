package com.lxz.designpattern.simplefactory.one;

/*
 * 客户端：测试使用Api接口
 * @date 2015-5-13
 */
public class Client {
	public static void main(String[] args){
		Api api = new Impl();
		api.test1("relax yourself.");
	}
}
