package com.webtest.demo1204;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class tianjiadaohangshezhi extends BaseTest{
	@Test
	//添加导航设置（设计-导航-首页-添加）
	public void jifenjiangli() throws Exception {
		webtest.open("http://localhost:8032/chanzhi/www/admin.php");
		Thread.sleep(1000);
		webtest.type("name=account","admin");
		webtest.type("name=password", "admin");
		webtest.click("xpath=//input[@type='submit']");
		Thread.sleep(1000);
		
		
		webtest.click("xpath=/html/body/nav[1]/ul[1]/li[6]/a");
		Thread.sleep(1000);
		webtest.click("xpath=/html/body/nav[1]/ul[1]/li[6]/ul/li[3]/a");
		webtest.click("xpath=/html/body/div[1]/div[2]/div[2]/form/ul/li[1]/span[1]/span/a[2]/i");
		Thread.sleep(1000);
		//webtest.click("xpath=//*[@id=\"nav\"]");
		
		//webtest.click("xpath=/html/body/div[1]/div[2]/div[2]/form/ul/li[2]/span/select[1]/option[5]");
		webtest.click("xpath=//a[@class='btn btn-primary submit']");
		Thread.sleep(1000);
		
		
	}
}