package com.webtest.demo1205;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class shezhichucexieyi extends BaseTest{
	@Test
	//设置注册协议（设置-注册协议-开启）
	public void jifenjiangli() throws Exception {
		webtest.open("http://localhost:8032/chanzhi/www/admin.php");
		Thread.sleep(1000);
		webtest.type("name=account","admin");
		webtest.type("name=password", "admin");
		webtest.click("xpath=//input[@type='submit']");
		Thread.sleep(1000);
		
		
		webtest.click("xpath=/html/body/nav[1]/ul[1]/li[8]/a");
		webtest.click("xpath=/html/body/div[1]/div[1]/div/ul/li[10]/a");
		
		webtest.click("xpath=//*[@id=agreement1]");
		
		webtest.typeAndClear("id=agreementTitle", "100");
		Thread.sleep(1000);
		webtest.tapClick();
		webtest.tapType("这是协议内容");
		Thread.sleep(1000);
		webtest.click("id=submit");
	}
}