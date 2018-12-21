package com.webtest.demo;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class SetFlowStatistics extends BaseTest{
    @Test
	public void setFlow() throws InterruptedException {
	    Back_Login.backLogin();
		Thread.sleep(1000);
		webtest.click("xpath=//a[contains(.,'推广')]");
		webtest.click("xpath=//a[@href='/chanzhi/www/admin.php?m=stat&f=setting']");
		webtest.typeAndClear("xpath=//input[@id='saveDays']", "60");
		webtest.typeAndClear("xpath=//input[@id='maxDays']", "90");
		webtest.click("id=submit");
	}
}
