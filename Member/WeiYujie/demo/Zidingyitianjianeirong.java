package com.webtest.demo;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class Zidingyitianjianeirong extends BaseTest{
	@Test
	//添加熊掌号（熊掌号设置）、
	public void tianjianeirong() throws Exception {
		webtest.open("http://localhost:8032/chanzhi/www/admin.php");
		Thread.sleep(1000);
		webtest.type("name=account","admin");
		webtest.type("name=password", "admin");
		webtest.click("xpath=//input[@type='submit']");
		Thread.sleep(1000);
		
		
		webtest.click("xpath=/html/body/nav[1]/ul[1]/li[6]/a");
		webtest.click("xpath=/html/body/nav[1]/ul[1]/li[6]/ul/li[2]/a");
		
		webtest.click("xpath=/html/body/div[1]/div[2]/div[1]/div/div[1]/div/a");
		
		webtest.typeAndClear("id=title", "chanzhi");
		webtest.tapClick();
		webtest.tapClick();
		webtest.tapType("111111111111111");
		webtest.click("id=submit");
	}
}
