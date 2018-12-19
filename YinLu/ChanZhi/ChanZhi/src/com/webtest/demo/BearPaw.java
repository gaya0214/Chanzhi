package com.webtest.demo;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class BearPaw extends BaseTest{
//熊掌号设置
	@Test
	public void aclass() throws Exception {
		
//		Admin_Login_Cz.adminlogin();	
		webtest.click("xpath=//a[contains(.,'推广)]");
		webtest.click("xpath=//a[contains(.,'熊掌号')]");
		webtest.selectByValue("id=type", "3");
		webtest.typeAndClear("name=name", "熊掌号名称");
		webtest.typeAndClear("name=appID", "123");
		webtest.typeAndClear("name=token", "123");
		webtest.click("xpath=//label[contains(.,'文章')]");
		webtest.click("id=submit");
		Thread.sleep(5000);


}
}
