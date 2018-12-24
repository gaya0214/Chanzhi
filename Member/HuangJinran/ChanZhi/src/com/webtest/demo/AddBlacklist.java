package com.webtest.demo;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class AddBlacklist extends BaseTest{
    @Test
    public void addblist() throws InterruptedException {
    	Back_Login.backLogin();
		Thread.sleep(1000);
		webtest.click("xpath=//a[contains(.,'安全')]");
		webtest.click("xpath=//a[contains(.,'黑名单管理')]");
		webtest.click("xpath=//a[contains(.,'添加黑名单')]");
		Thread.sleep(1000);
		webtest.type("xpath=//input[@id='identity']","测试员1");
		webtest.type("xpath=//input[@id='reason']", "原因1");
		webtest.click("xpath=//select[@id='expired']");
		webtest.selectByIndex("id=expired", 2);
		webtest.enterClick();
		webtest.click("id=submit");
    }
}
