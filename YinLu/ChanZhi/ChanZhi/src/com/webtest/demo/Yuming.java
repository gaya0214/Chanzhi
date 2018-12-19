package com.webtest.demo;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class Yuming extends BaseTest{
	//域名设置
	@Test
	public void yuming() throws Exception {
		
//		Admin_Login_Cz.adminlogin();		
		webtest.click("xpath=//a[contains(.,'设置')]");
		webtest.click("xpath=//a[contains(.,'域名设置')]");
		webtest.typeAndClear("name=domain", "111");
		webtest.typeAndClear("name=allowedDomain", "111");
		
		webtest.click("id=scheme2");
		
		
		webtest.click("id=submit");
		Thread.sleep(5000);

}
}