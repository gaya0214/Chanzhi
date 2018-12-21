package com.webtest.demo;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class jianglijifen1204 extends BaseTest{
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
		webtest.click("xpath=/html/body/nav[1]/ul[1]/li[4]/a");//点击会员
		Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[1]/div/form/table/tbody/tr/td[13]/span[1]/a");//点击积分
		Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[1]/div/form/table/tbody/tr/td[13]/span[1]/ul/li[1]/a");//点击奖励积分
		Thread.sleep(1000);
		webtest.type("name=count", "10");
		Thread.sleep(1000);
		webtest.click("id=submit");
	}
}
