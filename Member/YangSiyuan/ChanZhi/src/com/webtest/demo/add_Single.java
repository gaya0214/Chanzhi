package com.webtest.demo;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class add_Single extends BaseTest{
	@Test
	
	public void single() {
		Back_Login.backLogin();
		webtest.click("link=单页");
		webtest.click("link=添加单页");
		webtest.pause(5000);
		webtest.type("id=title", "第一个单页");
		webtest.type("id=alias","第一个");
		webtest.type("id=keywords","第一个，单页");
		webtest.type("xpath=/html/body/div[1]/div/div[2]/form/table/tbody[3]/tr[1]/td/div[2]/div[2]/iframe","这是第一个测试单页");
		webtest.pause(5000);
		webtest.click("id=submit");
	}
}
