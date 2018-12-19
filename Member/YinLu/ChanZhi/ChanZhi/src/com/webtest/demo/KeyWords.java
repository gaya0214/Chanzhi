package com.webtest.demo;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class KeyWords extends BaseTest{
//关键词设置
	@Test
	public void keywords() throws Exception {
//		Admin_Login_Cz.adminlogin();	
		webtest.click("xpath=//a[contains(.,'推广')]");
		webtest.click("xpath=//a[contains(.,'关键词设置')]");
		webtest.click("xpath=//a[contains(@href,'/chanzhi/www/admin.php?m=tag&f=link&id=1')]");
		webtest.type("name=link", "http://www/taobao.com");
		webtest.click("xpath=//input[@value='保存']");
		Thread.sleep(5000);
	}
}
