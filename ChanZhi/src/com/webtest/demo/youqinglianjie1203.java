package com.webtest.demo;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class youqinglianjie1203 extends BaseTest{
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
		webtest.click("xpath=/html/body/nav[2]/div[2]/ul[1]/li[3]/a");//点击友情链接
		Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[1]/div/div[2]/form/table/tbody/tr[1]/th");
		webtest.tapClick();
		webtest.tapType("www.baidu.com");
		Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[1]/div/div[2]/form/table/tbody/tr[2]/th");
		webtest.tapClick();
		webtest.tapType("www.weibo.com");
		Thread.sleep(1000);
		webtest.click("id=submit");

	}
}
