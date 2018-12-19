package com.webtest.demo;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
/*作者：杨斯媛
 * 23.维护类目（商城-产品）*/
public class Maintain_Class extends BaseTest{
    @Test
    public void maintanClass() throws Exception {
    	Back_Login.backLogin();
		Thread.sleep(1000);
		webtest.click("xpath=//a[contains(.,'产品')]");
		webtest.click("xpath=//a[contains(.,'维护类目')]");
		webtest.type("id=children[]", "类目1");
		webtest.type("id=alias[]']", "别名1");
		webtest.click("id=submit");
		
    }
}
