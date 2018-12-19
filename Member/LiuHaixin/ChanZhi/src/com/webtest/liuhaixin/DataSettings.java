package com.webtest.demo;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class DataSettings extends BaseTest{
	@Test
	public void datasettings() throws Exception{
		Back_Login.backLogin();
		webtest.click("xpath=//a[contains(.,'推广')]");
		webtest.click("xpath=//a[contains(.,'统计')]");
		webtest.click("xpath=//html/body/div/div/div/ul/li/a[contains(.,'设置')]");
		webtest.typeAndClear("id=saveDays","30");
		webtest.typeAndClear("id=maxDays","60");
		webtest.click("id=submit");
		}

}
