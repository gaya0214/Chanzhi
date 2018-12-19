package com.webtest.demo;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class BasicSettings extends BaseTest{
	@Test
	public void basicsettings()throws Exception{
		Back_Login.backLogin();
		webtest.click("xpath=//a[contains(.,'设置')]");
		webtest.click("xpath=//a[contains(.,'安全')]");
		webtest.click("xpath=//a[contains(.,'基本设置')]");
		webtest.click("id=captcha2");
		webtest.click("id=checkEmail1");
		webtest.click("id=resetPassword1");
		webtest.click("id=filterFunction1");
		webtest.click("id=importantValidate2");
		webtest.click("id=importantValidate23");
		webtest.click("id=front1");
		webtest.click("id=checkLocation1");
		webtest.click("id=useLocation");
		webtest.click("id=checkSessionIP1");
		webtest.type("id=allowedIP","172.237.9.0,123.123.1.1,127.0.0.1");
		webtest.click("id=submit");
		
		
		}
}
