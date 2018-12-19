package com.webtest.demo;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
/*作者：杨斯媛
 * 25.快递（商城-设置-快递）*/
public class Expressage extends BaseTest{
	@Test
    public void expressage() throws Exception {
		Back_Login.backLogin();
		Thread.sleep(1000);
		webtest.click("xpath=//a[contains(.,'商城')]");
		webtest.click("xpath=//a[@href='/chanzhi/www/admin.php?m=product&f=setting']");
		webtest.click("xpath=//a[contains(.,'快递')]");
	    webtest.type("id=children[]", "快递1");
	    webtest.click("id=submit");
	}
}
