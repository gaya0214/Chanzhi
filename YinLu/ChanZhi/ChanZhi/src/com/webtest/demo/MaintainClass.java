package com.webtest.demo;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class MaintainClass extends BaseTest{
    @Test
    public void maintanClass() throws InterruptedException {
//    	Admin_Login_Cz.adminlogin();
    	
    	Thread.sleep(1000);
		webtest.click("xpath=//a[contains(.,'产品')]");
		webtest.click("xpath=//a[contains(.,'维护类目')]");
		webtest.typeAndClear("xpath=//input[@name='children[3]']", "类目1");
		webtest.typeAndClear("xpath=//input[@name='alias[3]']", "别名1");
		webtest.typeAndClear("xpath=//input[@name='children[6]']", "类目2");
		webtest.typeAndClear("xpath=//input[@name='alias[6]']", "别名2");
		webtest.click("id=submit");
		
    }
}
