package com.webtest.demo;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class add_Whitelist extends BaseTest{
	@Test
	public void whitelist() {
		Back_Login.backLogin();
		webtest.click("link=����");
		webtest.pause(3000);
		webtest.click("link=��ȫ");
		webtest.pause(3000);
		webtest.click("link=����������");
		webtest.pause(3000);
		webtest.type("id=ip", "192.168.0.1");
		webtest.pause(3000);
		webtest.type("id=account", "ysy1");
		webtest.pause(3000);
		webtest.type("id=password","3927");
		webtest.click("id=submit");
	}
}
