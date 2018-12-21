package com.webtest.demo1204;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class piliangtijiaoziyuan extends BaseTest{
	@Test
	//批量添加资源（推广-熊掌号-批量添加）
	public void jifenjiangli() throws Exception {
		webtest.open("http://localhost:8032/chanzhi/www/admin.php");
		Thread.sleep(1000);
		webtest.type("name=account","admin");
		webtest.type("name=password", "admin");
		webtest.click("xpath=//input[@type='submit']");
		Thread.sleep(1000);
		
		
		webtest.click("xpath=/html/body/nav[1]/ul[1]/li[5]/a");
		Thread.sleep(1000);
		webtest.click("xpath=/html/body/nav[2]/div[2]/ul[1]/li[4]/a");
		webtest.click("xpath=/html/body/div[1]/div[1]/div/ul/li[2]/a");
		Thread.sleep(1000);
		webtest.click("xpath=//a[@id='execButton']");
		Thread.sleep(1000);
		
		
	}
}