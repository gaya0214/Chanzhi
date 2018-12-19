package com.webtest.demo;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class SafeSetting extends BaseTest{
	@Test
	public void safewhite() throws Exception{
		Back_Login.backLogin();
		webtest.click("xpath=//a[contains(.,'站点')]");
		webtest.click("xpath=//a[contains(.,'安全')]");
		webtest.click("xpath=//a[contains(.,'白名单管理')]");
		webtest.type("id=ip","10.9.8.65");
		webtest.type("id=account","CBING");
		webtest.type("id=password","123456");
		webtest.click("id=submit");
		}

}
