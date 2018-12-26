package com.webtest.demo;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class add_Connact extends BaseTest{
	@Test
	public void company() {
		Back_Login.backLogin();
		webtest.click("link=设置");
		webtest.click("link=公司");
		webtest.click("link=联系方式");
		webtest.pause(3000);
		webtest.type("id=contacts", "ysy");
		webtest.pause(2000);
		webtest.type("id=phone", "12345678910");
		webtest.pause(2000);
		webtest.type("id=fax", "123456");
		webtest.pause(2000);
		webtest.type("id=email", "123456@qq.com");
		webtest.pause(2000);
		webtest.type("id=qq","23456");
		webtest.pause(2000);
		webtest.type("id=address","河北师范大学");
		webtest.click("id=submit");
}
}