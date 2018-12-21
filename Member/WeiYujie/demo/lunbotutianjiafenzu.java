package com.webtest.demo1204;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class lunbotutianjiafenzu extends BaseTest{
	@Test
	//轮播图添加分组（设计-轮播图）
	public void jifenjiangli() throws Exception {
		webtest.open("http://localhost:8032/chanzhi/www/admin.php");
		Thread.sleep(1000);
		webtest.type("name=account","admin");
		webtest.type("name=password", "admin");
		webtest.click("xpath=//input[@type='submit']");
		Thread.sleep(1000);
		
		
		webtest.click("xpath=/html/body/nav[1]/ul[1]/li[6]/a");
		webtest.click("xpath=/html/body/nav[1]/ul[1]/li[6]/ul/li[4]/a");
		
		webtest.click("xpath=//i[@class='icon-plus-sign icon icon-3x']");
		
		webtest.type("id=name", "1");
		Thread.sleep(1000);
		webtest.click("xpath=//input[@value='添加分组']");
		
		Thread.sleep(1000);
	}
}