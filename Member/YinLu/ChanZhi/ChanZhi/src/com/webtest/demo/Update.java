package com.webtest.demo;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class Update extends BaseTest{
//更新检索
	@Test
	public void update() throws Exception {
//		Admin_Login_Cz.adminlogin();
		webtest.click("xpath=//a[contains(.,'设置')]");
		webtest.click("xpath=//a[contains(.,'全文检索')]");
		webtest.click("xpath=//a[contains(.,'更新索引')]");
		Thread.sleep(5000);

	}
}
