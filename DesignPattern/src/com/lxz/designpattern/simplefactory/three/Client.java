package com.lxz.designpattern.simplefactory.three;

/*
 * @date 2015-5-13
 */
public class Client {
	public static void main(String[] args){
		Api api = Factory.createApi();
		api.test1("哈哈，不要紧张，这只是一个测试而已！");
	}
}
