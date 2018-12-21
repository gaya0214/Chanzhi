package com.webtest.demo;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class Add_Xiongzhanghao extends BaseTest{
	@Test
	//添加熊掌号（熊掌号设置）、
	public void xionghzanghao() throws Exception {
		login.login();
		
		
		webtest.click("xpath=/html/body/nav[1]/ul[1]/li[5]/a");
		webtest.click("xpath=/html/body/nav[2]/div[2]/ul[1]/li[4]/a");
		webtest.click("id=type");
		webtest.click("value=1");
		webtest.typeAndClear("id=name", "chanzhi");
		webtest.typeAndClear("id=appID", "10000");
		webtest.typeAndClear("id=token", "10000");
		webtest.click("id=submit");
	}
}
