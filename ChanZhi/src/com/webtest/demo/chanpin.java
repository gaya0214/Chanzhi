package com.webtest.demo;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class chanpin extends BaseTest{
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
		webtest.click("xpath=/html/body/nav[1]/ul[1]/li[3]/a");//点击商城
		webtest.click("xpath=/html/body/nav[2]/div[2]/ul[1]/li[2]/a");//点击产品
		webtest.click("xpath=/html/body/div[1]/div[2]/div/div/div/a");//点击添加产品
		webtest.click("xpath=/html/body/div[1]/div[2]/div/div[2]/form/table/tbody/tr[1]/td[1]/div[2]/ul/li/input");//点击类目
		webtest.click("xpath=/html/body/div[1]/div[2]/div/div[2]/form/table/tbody/tr[1]/td[1]/div[2]/div/ul/li");//点击玩具
		
		webtest.type("name=name", "玩具汽车");
		Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[1]/div[2]/div/div[2]/form/table/tbody/tr[2]/td/div[2]/div[2]/div/div/div/span/button");//点击颜色
		webtest.click("xpath=/html/body/div[1]/div[2]/div/div[2]/form/table/tbody/tr[2]/td/div[2]/div[2]/div/div/div/span/div/div[2]");//黑色
		Thread.sleep(1000);
		webtest.type("name=order", "1");
		Thread.sleep(1000);
		webtest.type("name=alias", "玩具汽车");
		Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[1]/div[2]/div/div[2]/form/table/tbody/tr[7]/th");
		webtest.tapClick();
		webtest.tapType("2222222222222222");
		Thread.sleep(3000);
		webtest.click("id=submit");
		
		
	}
}