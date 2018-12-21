package com.webtest.demo1205;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class bianjiguanjianci extends BaseTest{
	@Test
	//编辑关键词(推广-关键词-编辑链接)(前提是有关键词)
	public void jifenjiangli() throws Exception {
		webtest.open("http://localhost:8032/chanzhi/www/admin.php");
		Thread.sleep(1000);
		webtest.type("name=account","admin");
		webtest.type("name=password", "admin");
		webtest.click("xpath=//input[@type='submit']");
		Thread.sleep(1000);
		
		//进入关键词页面
		webtest.click("xpath=/html/body/nav[1]/ul[1]/li[5]/a");
		webtest.click("xpath=/html/body/nav[2]/div[2]/ul[1]/li[2]/a");
		//点击编辑链接
		webtest.click("xpath=/html/body/div[1]/div/table/tbody/tr[1]/td[4]/a[1]");
		
		webtest.type("id=link", "http://www.baidu.com");
		webtest.click("xpath=//input[@value='保存']");
	}
}