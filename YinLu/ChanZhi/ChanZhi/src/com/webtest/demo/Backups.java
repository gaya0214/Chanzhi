package com.webtest.demo;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class Backups extends BaseTest{

	@Test
	public void backups() throws Exception {
//		Admin_Login_Cz.adminlogin();
		webtest.click("xpath=//a[contains(.,'设置')]");
		webtest.click("xpath=//a[contains(.,'备份还原')]");

		webtest.click("id=backupBtn");
		webtest.click("xpath=//button[contains(.,'确认')]");
		Thread.sleep(5000);
	}
}
