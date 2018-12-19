package com.webtest.demo;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
/*作者：黄瑾然
 * 15.添加白名单（站点-语言设置-安全）*/
public class Add_Whitelist extends BaseTest{
    @Test
    public void addWlist() throws Exception {
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