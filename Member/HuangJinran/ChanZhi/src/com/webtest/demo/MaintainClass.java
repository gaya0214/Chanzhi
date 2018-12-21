package com.webtest.demo;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class MaintainClass extends BaseTest{
    @Test
    public void maintanClass() throws InterruptedException {
    	Back_Login.backLogin();
		Thread.sleep(1000);
		webtest.click("xpath=//a[contains(.,'产品')]");
		webtest.click("xpath=//a[contains(.,'维护类目')]");
		webtest.type("xpath=//input[@name='children[1]']", "类目1");
		webtest.type("xpath=//input[@name='alias[1]']", "别名1");
		webtest.type("xpath=//input[@name='children[2]']", "类目2");
		webtest.type("xpath=//input[@name='alias[2]']", "别名2");
		webtest.click("id=submit");
		
    }
}
