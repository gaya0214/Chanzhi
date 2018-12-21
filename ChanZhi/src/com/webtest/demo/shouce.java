package com.webtest.demo;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class shouce extends BaseTest{
	@Test
	public void boketest() throws Exception{
		webtest.open("http://localhost:8032/chanzhi/www/admin.php");
		Thread.sleep(1000);
		webtest.type("name=account","wangderun");
		webtest.type("name=password", "123456");
		Thread.sleep(1000);
		webtest.click("xpath=//input[@type='submit']");
		Thread.sleep(1000);
		webtest.click("xpath=//a[contains('首页')]");
		webtest.click("xpath=/html/body/nav[1]/ul[1]/li[2]/a");
		webtest.click("xpath=/html/body/nav[2]/div[2]/ul[1]/li[4]/a");//点击手册
		webtest.type("name=title","hello");//标签
		Thread.sleep(1000);
		webtest.type("name=alias","helloworld");//别名
		Thread.sleep(1000);
		webtest.click("id=submit");
	}
}
