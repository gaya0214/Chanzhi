package com.webtest.demo;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class LayoutManagement extends BaseTest{
	@Test
	//论坛版块管理
	public static void layoutManagement() throws Exception{
		webtest.open("http://localhost:8032/chanzhi/www/admin.php");
		Thread.sleep(1000);
		webtest.type("name=account","admin");
		webtest.type("name=password", "admin");
		webtest.click("xpath=//input[@type='submit']");
		Thread.sleep(1000);
		
		
		
		webtest.click("xpath=/html/body/nav[1]/ul[1]/li[5]/a");
		webtest.click("xpath=/html/body/nav[2]/div[2]/ul[1]/li[3]/a");
		webtest.click("xpath=//a[contains(.,'版块管理')]");
		webtest.typeAndClear("id=children[11]", "11111");
		webtest.typeAndClear("id=alias[11]", "v22221111");
		webtest.click("id=submit");
	}
}
