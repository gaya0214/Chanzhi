package com.webtest.demo;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class AddWhitelist extends BaseTest{
    @Test
    public void addWlist() throws InterruptedException {
    	Back_Login.backLogin();
		Thread.sleep(1000);
		webtest.click("xpath=//a[contains(.,'安全')]");
		webtest.click("xpath=//a[contains(.,'白名单管理')]");
		webtest.type("xpath=//textarea[@id='ip']", "ip2");
		webtest.type("xpath=//textarea[@id='account']", "账号2");
		webtest.type("xpath=//input[@id='password']", "mima2");
		webtest.click("id=submit");
    }
}