package com.webtest.demo;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
/*31.自定义添加CSS（设计-区块-添加-CSS）*/
public class Add_Css extends BaseTest{
	@Test
    public void addCss() throws Exception {
    	Back_Login.backLogin();
		Thread.sleep(1000);
		webtest.click("xpath=//a[contains(.,'设计')]");
		webtest.click("xpath=//a[contains(.,'区块')]");
		webtest.click("xpath=//a[contains(.,'添加')]");
		webtest.click("xpath=//a[@href='#cssTab']");
	    webtest.type("xpath=//textarea[@style='z-index: 100000; left: 124.333px; top: 5px;']", "hhhh");
	    webtest.click("id=submit");
	}

}
