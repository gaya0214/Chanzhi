package com.webtest.demo;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class setting_Domainname extends BaseTest{
	@Test
	public void domainname() {
		Back_Login.backLogin();
		webtest.click("link=设置");
		webtest.click("link=域名设置");
		webtest.type("id=domain","localhost:8032");
		webtest.type("id=allowedDomain", "www.baidu.com");
		webtest.click("id=scheme1");
		webtest.click("id=submit");
	}
}
