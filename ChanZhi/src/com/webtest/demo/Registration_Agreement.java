package com.webtest.demo;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import com.webtest.core.*;
import com.webtest.demo.*;
/*47.设置注册协议（设置-注册协议-开启）*/
public class Registration_Agreement extends BaseTest{
	@Test
	public void registrationAgreement() throws Exception{
		Back_Login.backLogin();
		webtest.click("xpath=//a[contains(.,'设置')]");
		webtest.click("xpath=//a[contains(.,'注册协议')]");
		webtest.click("id=agreement1");
		webtest.type("id=agreementTitle", "协议标题");
		webtest.tapClick();
		webtest.tapType("协议内容");
		webtest.click("id=submit");
	}

}
