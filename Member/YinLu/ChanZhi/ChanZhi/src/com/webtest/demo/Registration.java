package com.webtest.demo;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
//注册协议设置
public class Registration extends BaseTest{
	@Test
	public void registration() throws Exception {
//		Admin_Login_Cz.adminlogin();	
		webtest.click("xpath=//a[contains(.,'设置')]");
		webtest.click("xpath=//a[contains(.,'注册协议')]");
		webtest.click("id=agreement1");
		webtest.type("id=agreementTitle", "协议一");
		webtest.tapClick();
		webtest.tapType("协议主要内容");
		
		webtest.click("id=submit");
		Thread.sleep(5000);

	}
}
