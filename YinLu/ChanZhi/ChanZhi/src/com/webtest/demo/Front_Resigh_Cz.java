package com.webtest.demo;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class Front_Resigh_Cz extends BaseTest{
//前台注册	
	@Test
	public void frontresighter() throws Exception {
		webtest.open("http://localhost:8033/chanzhi/www/");
		webtest.click("xpath=//a[contains(.,'注册')]");
		webtest.type("name=account", "user");
		webtest.type("name=realname", "尹璐");
		webtest.type("name=email", "1981183186@qq.com");
		webtest.type("name=password1", "123456");
		webtest.type("name=password2", "123456");

		webtest.click("xpath=//input[@type=submit]");
		Thread.sleep(3000);
	}
}
