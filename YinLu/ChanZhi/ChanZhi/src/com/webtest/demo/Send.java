package com.webtest.demo;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class Send extends BaseTest{
//发信设置
	@Test
	public void send() throws Exception {
//		Admin_Login_Cz.adminlogin();		
		webtest.click("xpath=//a[contains(.,'站点')]");
		webtest.click("xpath=//a[contains(.,'语言设置')]");
		webtest.click("xpath=//a[contains(.,'接口')]");
		webtest.click("xpath=//a[contains(.,'发信设置')]");
		webtest.type("xpath=//input[@name='fromAddress']", "1981183186@qq.com");
		webtest.click("xpath=//input[@type='submit']");
		
		webtest.type("xpath=//input[@name='password']", "yl1998");
		
		webtest.click("xpath=//input[@type='submit']");
		Thread.sleep(4000);
		
	}
}
