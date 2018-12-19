package com.webtest.demo;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
/*作者：杨斯媛
 * 30.自定义添加样式（设计-区块-添加-样式）*/
public class Add_Style extends BaseTest{
    @Test
    public void addStyle() throws Exception {
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
