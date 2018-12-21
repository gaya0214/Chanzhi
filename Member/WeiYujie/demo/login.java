package com.webtest.demo;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class login extends BaseTest{
	@BeforeSuite
	public static void login() throws Exception{
		webtest.open("http://localhost:8032/chanzhi/www/admin.php");
		Thread.sleep(1000);
		webtest.type("name=account","admin");
		webtest.type("name=password", "123456");
		webtest.click("xpath=//input[@type='submit']");
		Thread.sleep(1000);
		
		
	}
}
