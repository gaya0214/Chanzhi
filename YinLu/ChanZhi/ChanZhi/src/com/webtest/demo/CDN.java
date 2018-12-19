package com.webtest.demo;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class CDN extends BaseTest{
//cdn设置
	@Test
	public void cdn() throws Exception {
//		Admin_Login_Cz.adminlogin();	
		webtest.click("xpath=//a[contains(.,'设置')]");
		webtest.click("xpath=//a[contains(.,'CDN设置')]");
		webtest.click("id=open1");
		webtest.click("id=submit");
		Thread.sleep(5000);	
	}
}
