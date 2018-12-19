package com.webtest.demo;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class Language extends BaseTest{
//语言设置
	@Test
	public void language() throws Exception {
//		Admin_Login_Cz.adminlogin();	
		webtest.click("xpath=//a[contains(.,'设置')]");
		webtest.click("xpath=//a[contains(.,'语言设置')]");
		webtest.click("id=enabledLangs2");
		webtest.click("id=enabledLangs3");
//		webtest.click("id=cn2tw1");
		webtest.click("id=defaultLang3");
		webtest.click("id=submit");
		Thread.sleep(5000);
	}
}
