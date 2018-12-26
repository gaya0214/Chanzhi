package com.webtest.demo;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class add_Company extends BaseTest{
	@Test
	public void addcomoany() {
		Back_Login.backLogin();
		webtest.click("link=设置");
		webtest.click("link=公司");
		webtest.click("link=公司信息");
		webtest.pause(2000);
		webtest.type("id=name", "能力有限公司");
		webtest.pause(2000);
		webtest.type("xpath=/html/body/div/div[2]/div/div[2]/form/table/tbody/tr[2]/td/div/div[2]/iframe", "一个能力有限的公司");
		webtest.pause(3000);
		webtest.type("xpath=/html/body/div/div[2]/div/div[2]/form/table/tbody/tr[3]/td/div/div[2]/iframe", "能力有限到啥都不会的公司");
		webtest.pause(3000);
		webtest.click("id=submit");
	}
}
