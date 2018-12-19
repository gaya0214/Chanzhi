package com.webtest.demo;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
/*作者：韦宇杰
 * 48.设置缓存设置*/
public class Set_Cache extends BaseTest{
	@Test
	 public void setCache() throws Exception {
		Back_Login.backLogin();
		Thread.sleep(1000);
		webtest.click("xpath=//a[contains(.,'设置')]");
		webtest.click("xpath=//a[contains(.,'缓存设置')]");
	    webtest.click("id=status2");	
	    webtest.click("id=cachePage2");
	    webtest.typeAndClear("id=cacheExpired", "12");
	    webtest.click("id=submit");
	}
}
