package com.webtest.demo1205;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class shezhi_CDN extends BaseTest{
	@Test
	//设置CDN（设置-CDN设置）
	public void jifenjiangli() throws Exception {
		webtest.open("http://localhost:8032/chanzhi/www/admin.php");
		Thread.sleep(1000);
		webtest.type("name=account","admin");
		webtest.type("name=password", "admin");
		webtest.click("xpath=//input[@type='submit']");
		Thread.sleep(1000);
		
		//进入CDN设置
		webtest.click("xpath=/html/body/nav[1]/ul[1]/li[8]/a");
		webtest.click("xpath=/html/body/div[1]/div[1]/div/ul/li[5]/a");
		
		webtest.click("xpath=//*[@id=open1]");
		
		webtest.typeAndClear("id=site", "http://cdn.chanzhi.org/7.4.1/");
		
		webtest.click("id=submit");
		
	}
}