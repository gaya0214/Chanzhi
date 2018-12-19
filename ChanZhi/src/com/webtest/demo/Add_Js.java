package com.webtest.demo;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
/*作者：刘海新
 * 32.�自定义添加JS（设计-区块-添加-JS）
*/
public class Add_Js extends BaseTest{
	@Test
    public void addJs() throws Exception {
    	Back_Login.backLogin();
		Thread.sleep(1000);
		webtest.click("xpath=//a[contains(.,'设计')]");
		webtest.click("xpath=//a[contains(.,'区块')]");
		webtest.click("xpath=//a[contains(.,'添加')]");
		webtest.click("xpath=//a[@href='#jsTab']");
	    webtest.type("xpath=//textarea[@style='z-index: 100000; height: 18px; left: 223.333px; top: 9px;']", "hhhh");
	    webtest.click("id=submit");
	}
}
