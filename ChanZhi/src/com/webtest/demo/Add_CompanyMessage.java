package com.webtest.demo;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
/*8.添加公司信息（站点-语言设置-公司）*/
public class Add_CompanyMessage extends BaseTest {
	@Test
	public void addMessage() throws Exception {
		Back_Login.backLogin();
		Thread.sleep(1000);
		webtest.click("xpath=//a[contains(.,'设置')]");
		webtest.click("xpath=//a[contains(.,'公司')]");
		webtest.click("xpath=//a[contains(.,'公司信息')]");
		webtest.typeAndClear("id=name", "青鸟息壤网络信息有限公司");
		webtest.tapClick();
		webtest.tapType("青鸟息壤网络信息有限公司");
		webtest.click("xpath=//th[contains(.,'公司介绍')]");
		webtest.tapClick();
		webtest.tapType("青鸟息壤网络信息有限公司");
		
		webtest.click("id=submit");
		Thread.sleep(3000);
	}
}
