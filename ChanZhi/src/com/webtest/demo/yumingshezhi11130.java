package com.webtest.demo;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class yumingshezhi11130 extends BaseTest{
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
		webtest.click("xpath=/html/body/div[1]/div[1]/div/ul/li[4]/a");//域名设置
		Thread.sleep(1000);
		webtest.type("name=domain", "www.baidu.com");
		Thread.sleep(1000);
		webtest.type("name=allowedDomain", "www.weibo.com");
		Thread.sleep(1000);
		webtest.click("id=submit");

	}
}
