package com.webtest.demo;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class setting_AddressType extends BaseTest{
	@Test
	public void addresstype() {
		Back_Login.backLogin();
		webtest.click("link=设置");
		webtest.pause(1000);
		webtest.click("link=地址类型");
		webtest.click("id=requestType1");
		webtest.click("id=requestType2");
		//webtest.click("id=requestType3");
		webtest.click("id=submit");
	}
}
