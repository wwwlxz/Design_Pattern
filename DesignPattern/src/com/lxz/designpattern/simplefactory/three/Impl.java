package com.lxz.designpattern.simplefactory.three;

/*
 * 对接口的实现
 */
public class Impl implements Api{

	@Override
	public void test1(String s) {
		System.out.println("Now In Impl. The input s==" + s);
	}
	
}
