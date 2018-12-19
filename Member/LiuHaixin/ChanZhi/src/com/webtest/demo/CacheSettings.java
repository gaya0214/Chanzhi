package com.webtest.demo;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class CacheSettings extends BaseTest{
	@Test
	public void cachesettings()throws Exception{
		Back_Login.backLogin();
		webtest.click("xpath=//a[contains(.,'…Ë÷√')]");
		webtest.click("xpath=//a[contains(.,'ª∫¥Ê…Ë÷√')]");
		webtest.click("id=status1");
		webtest.click("id=cachePage1");
		webtest.typeAndClear("id=cacheExpired","48");
		webtest.click("id=submit");
		
		}

}
