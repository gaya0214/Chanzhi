package com.webtest.demo;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class AddManual extends BaseTest{
	@Test(priority = 2)
	public void addmanual() throws Exception{
		webtest.click("xpath=/html/body/nav[1]/ul[1]/li[2]/a");
		webtest.click("xpath=/html/body/nav[2]/div[2]/ul[1]/li[4]/a");
		webtest.click("xpath=//a[contains(.,' 添加手册')]");
//		Thread.sleep(2000);
		webtest.click("class=chosen-choices");
		webtest.click("xpath=/html/body/div[1]/div[2]/div/div[2]/form/table/tbody[1]/tr/td[1]/div[2]/div/ul/li[1]");
		//Thread.sleep(2000);
		webtest.type("id=author","admin");
		webtest.type("id=title","标题");
		webtest.type("id=alias","manual111");
		webtest.type("id=keywords","手册");
		webtest.type("id=summary","这是个手册");
		webtest.tapClick();
		webtest.tapType("蝉知使用介绍");
		webtest.click("id=submit");
		Thread.sleep(2000);
		
	}
}


