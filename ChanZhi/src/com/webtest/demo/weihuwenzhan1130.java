package com.webtest.demo;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class weihuwenzhan1130 extends BaseTest{
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
		webtest.click("xpath=/html/body/nav[1]/ul[1]/li[2]/a");//点击内容
		Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[1]/div[1]/div/div/div/div/a");//点击维护类目
		Thread.sleep(1000);

		webtest.click("xpath=/html/body/div[1]/div/form/div/div[1]");
		webtest.tapClick();
		webtest.tapType("水浒传");
		
		/*webtest.tapClick();
		webtest.tapType("水浒传");*/
		Thread.sleep(1000);
		webtest.click("id=children[]");
		webtest.tapClick();
		webtest.tapType("四海之内皆兄弟");
		Thread.sleep(1000);
		webtest.click("id=submit");

		
	}
}
