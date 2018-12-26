package com.webtest.demo;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class add_CreditRules extends BaseTest{
	@Test
	public void creditruls() {
		Back_Login.backLogin();
		webtest.click("link=设置");
		webtest.click("link=积分");
		webtest.click("积分规则");
		webtest.pause(3000);
		webtest.typeAndClear("id=register", "100");
		webtest.pause(2000);
		webtest.typeAndClear("id=login","3");
		webtest.pause(2000);
		webtest.typeAndClear("id=maxLogin", "50");
		webtest.pause(2000);
		webtest.typeAndClear("id=thread", "5");
		webtest.pause(2000);
		webtest.typeAndClear("id=reply", "2");
		webtest.pause(2000);
		webtest.typeAndClear("id=delThread","10");
		webtest.pause(2000);
		webtest.typeAndClear("id=delReply","8");
		webtest.pause(2000);
		webtest.typeAndClear("id=perYuan", "50");
		webtest.pause(2000);
		webtest.typeAndClear("id=minAmount","6");
		webtest.pause(2000);
		webtest.click("id=submit");
	}
}
