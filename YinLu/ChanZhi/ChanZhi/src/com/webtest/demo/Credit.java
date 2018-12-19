package com.webtest.demo;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
//积分结算     
public class Credit extends BaseTest{

	@Test
	public void credit() {
		
//		Admin_Login_Cz.adminlogin();		
		webtest.click("xpath=//a[contains(.,'站点')]");
		webtest.click("xpath=//a[contains(.,'语言设置')]");
		
		webtest.click("xpath=//a[contains(.,'积分')]");
		webtest.click("xpath=//a[contains(.,'积分结算')]");
		webtest.click("xpath=//input[@type='submit']");
		
		
		
	}
}
