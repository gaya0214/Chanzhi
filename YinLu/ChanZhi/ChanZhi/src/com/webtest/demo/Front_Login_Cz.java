package com.webtest.demo;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class Front_Login_Cz extends BaseTest{
//前台登录
	@Test
	public void frontlogin() throws Exception {

		webtest.open("http://localhost:8033/chanzhi/www/index.php/user-login.html");
		webtest.click("xpath=//a[contains(.,'登录')]");
		Thread.sleep(2000);
		webtest.type("id=account", "yinlu");
		webtest.type("name=password", "123456");
		webtest.click("xpath=//input[@type='submit']");
		System.out.println("123");
	}
}
