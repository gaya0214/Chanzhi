package com.webtest.demo;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class xinzenfenzu1130 extends BaseTest{
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
		webtest.click("xpath=/html/body/nav[1]/ul[1]/li[8]/a");//点击设置
		Thread.sleep(1000);
		webtest.click("xpath=/html/body/nav[2]/div[2]/ul[1]/li[5]/a");//点击安全
		Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[1]/div[1]/div/ul/li[9]/a");//分组权限
		Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[1]/div[2]/div/div/span/a");//新增分组
		Thread.sleep(1000);
		webtest.type("name=name", "工作");
		Thread.sleep(1000);
		webtest.type("name=desc", "周五上午");
		Thread.sleep(1000);
		webtest.click("id=submit");

	}
}
