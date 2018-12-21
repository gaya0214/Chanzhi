package com.webtest.demo;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class lunbotu1204 extends BaseTest{
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
		webtest.click("xpath=/html/body/nav[1]/ul[1]/li[6]/a");//点击设计
		Thread.sleep(1000);
		webtest.click("xpath=/html/body/nav[1]/ul[1]/li[6]/ul/li[4]/a");//点击组件
		Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[1]/div[3]/div/div[2]/section/div/a/div/div/i");//轮播图
		Thread.sleep(1000);
		webtest.type("name=name","玩具");
		Thread.sleep(3000);
		webtest.tapClick();
		webtest.enterclick();
		
	}
}
