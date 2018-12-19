package com.webtest.demo;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class FlowStatistics extends BaseTest{
	//流量统计设置
	@Test
	public void flow() throws Exception {
//		Admin_Login_Cz.adminlogin();	
		webtest.click("xpath=//a[contains(.,'推广')]");
		webtest.click("xpath=//a[contains(@href,'/chanzhi/www/admin.php?m=stat&f=setting')]");
		webtest.typeAndClear("name=saveDays", "60");
		webtest.typeAndClear("name=maxDays", "120");
		webtest.click("id=submit");
		Thread.sleep(5000);
	}
}
