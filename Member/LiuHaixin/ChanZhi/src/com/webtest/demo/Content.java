package com.webtest.demo;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class Content extends BaseTest{
	@Test
	public void content() throws Exception{
		Back_Login.backLogin();
		webtest.click("xpath=//a[contains(.,'内容')]");
		webtest.click("xpath=//a[contains(.,'手册')]");
		webtest.type("id=author","");
		webtest.type("id=title", "自动化测试");
		webtest.type("id=alias","www.hao123.com");
		webtest.type("id=keywords", "java自动化测试");
		webtest.type("id=summary","Java自动化测试需要熟练掌握Java语言用法");
		webtest.type("class=ke-edit-iframe","Java自动化测试需要熟练掌握Java语言用法");
		webtest.click("id=submit");
	}
	
}
