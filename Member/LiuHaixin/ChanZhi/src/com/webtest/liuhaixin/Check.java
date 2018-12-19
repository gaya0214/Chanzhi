package com.webtest.demo;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class Check extends BaseTest{
	@Test
	public void check() throws Exception{
		Back_Login.backLogin();
		webtest.click("xpath=//a[contains(.,'站点')]");
		webtest.click("xpath=//a[contains(.,'安全')]");
		webtest.click("xpath=//a[contains(.,'验证码设置')]");
		webtest.type("id=question[]","你是谁");
		webtest.type("id=answer[]","我是你");
		webtest.click("id=submit");
		
		
		}

}
