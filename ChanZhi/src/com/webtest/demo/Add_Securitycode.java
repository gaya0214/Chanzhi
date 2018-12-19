package com.webtest.demo;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
/*作者：杨斯媛
 * 16.验证码设置（站点-语言设置-安全）*/
public class Add_Securitycode extends BaseTest{
	@Test
    public void addscode() throws Exception {
		Back_Login.backLogin();
		Thread.sleep(1000);
		webtest.click("xpath=//a[contains(.,'安全')]");
		webtest.click("xpath=//a[contains(.,'验证码设置')]");
        webtest.type("id=question[]", "问题1");
        webtest.type("id=answer[]", "答案1");
        webtest.click("id=submit");
	}
}
