package com.webtest.demo;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class FriendlyLink extends BaseTest{
//友情链接
	@Test
	public void aclass() throws Exception {
		
//		Admin_Login_Cz.adminlogin();	
		webtest.click("xpath=//a[contains(.,'推广')]");
		webtest.click("xpath=//a[contains(.,'友情链接')]");
		webtest.click("xpath=//th[contains(.,'首页链接')]");
		webtest.tapClick();
		webtest.tapType("123");
		webtest.click("xpath=//th[contains(.,'所有链接')]");
		webtest.tapClick();
		webtest.tapType("123");
		webtest.click("xpath=//th[contains(.,'所有链接')]");
		webtest.keysDown();
		webtest.click("id=submit");
		Thread.sleep(5000);
		
}
}