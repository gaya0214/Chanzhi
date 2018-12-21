package com.webtest.demo;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class PublishBlog extends BaseTest{
	@Test//发布博客
	public void newblog() throws Exception{
		
		webtest.click("xpath=/html/body/nav[1]/ul[1]/li[2]/a");
		webtest.click("xpath=/html/body/nav[2]/div[2]/ul[1]/li[3]/a");
		webtest.click("xpath=//a[contains(.,' 发布博客')]");
//		Thread.sleep(2000);
		webtest.click("class=chosen-choices");
		webtest.click("xpath=/html/body/div[1]/div[2]/div/div[2]/form/table/tbody[1]/tr/td[1]/div[2]/div/ul/li[1]");
		//Thread.sleep(2000);
		webtest.type("id=author","admin");
		webtest.type("id=title","admin");
		webtest.type("id=alias","admin");
		webtest.type("id=keywords","admin");
		webtest.type("id=summary","admin");
		webtest.tapClick();
		webtest.tapType("1111111111");
		webtest.type("xpath=//html[@spellcheck='false']","admin11111111111");
		webtest.click("id=submit");
		Thread.sleep(2000);
		
	}
}
