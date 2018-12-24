package com.webtest.demo;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class AddStyle extends BaseTest{
    @Test
    public void addStyle() throws InterruptedException {
    	Back_Login.backLogin();
		Thread.sleep(1000);
		webtest.click("xpath=//a[contains(.,'设计')]");
		webtest.click("xpath=//a[contains(.,'区块')]");
		webtest.click("xpath=//a[contains(.,'添加')]");
		webtest.click("xpath=//a[@href='#customTab']");
		webtest.type("xpath=//input[@id='params[custom][default][iconColor]']", "#CA1407");
		webtest.type("xpath=//input[@id='params[custom][default][borderColor]']", "#CA1407");
		webtest.type("xpath=//input[@id='params[custom][default][paddingTop]']", "1");
		webtest.type("xpath=//input[@id='params[custom][default][paddingRight]']", "1");
		webtest.type("xpath=//input[@id='params[custom][default][paddingBottom]']", "1");
		webtest.type("xpath=//input[@id='params[custom][default][paddingLeft]']","1");
		webtest.type("xpath=//input[@id='params[custom][default][titleColor]']", "#CA1407");
		webtest.type("xpath=//input[@id='params[custom][default][titleBackground]']","#CA1407");
		webtest.type("xpath=//input[@id='params[custom][default][textColor]']", "#CA1407");
		webtest.type("xpath=//input[@id='params[custom][default][linkColor]']", "#CA1407");
		webtest.type("xpath=//input[@id='params[custom][default][backgroundColor]']", "#CA1407");
		webtest.type("xpath=//input[@id='params[class]']", "css1 css2");
		webtest.click("id=submit");
    }
}
