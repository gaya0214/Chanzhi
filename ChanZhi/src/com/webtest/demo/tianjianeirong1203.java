package com.webtest.demo;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class tianjianeirong1203 extends BaseTest{
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
		webtest.click("xpath=/html/body/nav[1]/ul[1]/li[6]/ul/li[2]/a");//点击区块
		Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[1]/div[2]/div[2]/div/div[1]/div/a");//点击内容添加
		Thread.sleep(1000);
		webtest.type("name=title", "小汽车");
		Thread.sleep(1000);
		webtest.click("id=submit");
	}
}
