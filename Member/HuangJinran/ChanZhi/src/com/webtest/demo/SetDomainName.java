package com.webtest.demo;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class SetDomainName extends BaseTest{
	@Test
	 public void setDomainname() throws InterruptedException {
		Back_Login.backLogin();
		Thread.sleep(1000);
		webtest.click("xpath=//a[contains(.,'设置')]");
		webtest.click("xpath=//a[contains(.,'域名设置')]");
		webtest.typeAndClear("id=domain", "测试1");
		webtest.typeAndClear("id=allowedDomain", "测试2");
		webtest.click("id=scheme2");
		webtest.click("id=submit");
	}
}
