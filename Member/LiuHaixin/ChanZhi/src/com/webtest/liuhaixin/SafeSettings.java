package com.webtest.demo;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class SafeSettings extends BaseTest{
	@Test
	public void safeblack() throws Exception{
		Back_Login.backLogin();
		webtest.click("xpath=//a[contains(.,'站点')]");
		webtest.click("xpath=//a[contains(.,'安全')]");
		webtest.click("xpath=//a[contains(.,'黑名单管理')]");
		webtest.click("xpath=//a[contains(.,'添加黑名单')]");
		webtest.type("id=identity","敏感词");
		webtest.type("id=reason","含有敏感词");
		webtest.click("//select[@id='expired']/option[@value='0']");
		
		webtest.click("id=submit");
		
		
		
	}
}
