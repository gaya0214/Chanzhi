package com.webtest.demo;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class DNSSettings extends BaseTest{
	@Test
	public void cachesettings()throws Exception{
		Back_Login.backLogin();
		webtest.click("xpath=//a[contains(.,'…Ë÷√')]");
		webtest.click("xpath=//a[contains(.,'”Ú√˚…Ë÷√')]");
		webtest.typeAndClear("id=domain","www.baidu.com");
		webtest.typeAndClear("id=allowedDomain","www.taobao.com");
		webtest.click("id=scheme1");
		webtest.click("id=submit");
		}
}
