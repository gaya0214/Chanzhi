package com.webtest.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class boke extends BaseTest{
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
		webtest.click("xpath=/html/body/nav[2]/div[2]/ul[1]/li[3]/a");
		webtest.click("xpat。h=/html/body/div[1]/div[2]/div/div/div/a");
		webtest.click("xpath=/html/body/div[1]/div[2]/div/div[2]/form/table/tbody[1]/tr/td[1]/div[2]/ul");
		webtest.click("xpath=/html/body/div[1]/div[2]/div/div[2]/form/table/tbody[1]/tr/td[1]/div[2]/div/ul/li");
		webtest.type("name=title", "Hello");
		webtest.type("name=summary", "HelloWorld");
		webtest.tapClick();
		webtest.tapType("2222222222222222");
		Thread.sleep(1000);
		webtest.click("id=submit");
		}
}
