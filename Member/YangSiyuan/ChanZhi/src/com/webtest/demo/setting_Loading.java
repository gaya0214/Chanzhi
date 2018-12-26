package com.webtest.demo;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class setting_Loading extends BaseTest{
	@Test
	public void loading() {
		Back_Login.backLogin();
		webtest.click("link=设置");
		webtest.click("link=缓存设置");
		webtest.click("status1");
		webtest.click("cachePage2");
		webtest.typeAndClear("id=cacheExpired", "12");
		webtest.click("id=clearButton");
		webtest.click("id=submit");
	}
}
