package com.webtest.demo;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class setting_Statistics extends BaseTest{
	@Test
	public void statistics() {
		Back_Login.backLogin();
		webtest.click("link=推广");
		webtest.pause(2000);
		webtest.click("link=统计");
		webtest.pause(1000);
		webtest.click("xpath=//a[@href='/chanzhi/www/admin.php?m=stat&f=setting']");
		webtest.pause(1000);
		webtest.typeAndClear("id=saveDays", "60");
		webtest.pause(1000);
		webtest.typeAndClear("id=maxDays", "90");
		webtest.click("id=submit");
	}
}
