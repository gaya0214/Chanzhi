package com.webtest.demo;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class setting_SafeBasic extends BaseTest{
	@Test
	public void basicsetting() {
		Back_Login.backLogin();
		webtest.click("link=设置");
		webtest.click("link=安全");
		webtest.click("link=基本设置");
		webtest.pause(3000);
		webtest.click("id=captcha3");
		webtest.click("id=checkEmail2");
		webtest.click("id=resetPassword1");
		webtest.click("id=filterPunction1");
		webtest.click("id=importantValidate1");
		webtest.click("id=importantValidate2");
		webtest.click("id=importantValidate3");
		webtest.click("id=front2");
		webtest.click("id=checkLocation2");
		webtest.type("id=allowedIP", "192.168.0.9,168.173.245.254");
		webtest.click("id=submit");
	}
}
