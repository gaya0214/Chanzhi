package com.webtest.demo;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class xiongzhanghao1203 extends BaseTest{
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
		Thread.sleep(1000);
		webtest.click("xpath=/html/body/nav[1]/ul[1]/li[5]/a");//点击推广
		Thread.sleep(1000);
		webtest.click("xpath=/html/body/nav[2]/div[2]/ul[1]/li[4]/a");//点击熊掌号
		Thread.sleep(1000);
		webtest.selectByVisibleText("id=type","个人");
		Thread.sleep(1000);
		webtest.type("name=name", "wangderun");
		Thread.sleep(1000);
		webtest.type("name=appID", "727075670");
		Thread.sleep(1000);
		webtest.type("name=token", "65482wsx");
		Thread.sleep(1000);
		webtest.click("id=autoSync1");
		Thread.sleep(1000);
		webtest.click("id=submit");

	}
}