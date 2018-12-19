package com.webtest.demo;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

/*作者：黄瑾然
 * 14.添加黑名单（站点-语言设置-安全）
 * */
public class Add_Blacklist extends BaseTest{
    @Test
    public void addblist() throws Exception {
    	Back_Login.backLogin();
		webtest.click("xpath=//a[contains(.,'安全')]");
		webtest.click("xpath=//a[contains(.,'黑名单管理')]");
		webtest.click("xpath=//a[contains(.,'添加黑名单')]");
		webtest.type("xpath=//input[@id='identity']","内容");
		webtest.type("xpath=//input[@id='reason']", "原因");
		webtest.click("xpath=//select[@id='expired']");
		webtest.selectByIndex("id=expired", 2);
		webtest.enterClick();
		webtest.click("id=submit");
    }
}
