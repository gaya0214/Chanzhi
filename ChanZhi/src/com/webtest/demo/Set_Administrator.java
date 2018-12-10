package com.webtest.demo;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class Set_Administrator extends BaseTest{
	@Test
	 public void setAdmin() throws Exception {
		Back_Login.backLogin();
		Thread.sleep(1000);

		webtest.click("xpath=//a[contains(.,'设置')]");
		webtest.click("xpath=//a[contains(.,'安全')]");
		webtest.click("xpath=//a[contains(.,'分组权限')]");
		webtest.click("xpath=//a[@href='/chanzhi/www/admin.php?m=group&f=edit&groupID=1']");
		Thread.sleep(1000);
		webtest.typeAndClear("xpath=//input[@class='form-control']","测试1");
		webtest.typeAndClear("xpath=//textarea[@class='form-control']", "测试1");
		webtest.click("id=submit");
	}
}
