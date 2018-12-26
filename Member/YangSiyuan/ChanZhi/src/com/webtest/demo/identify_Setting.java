package com.webtest.demo;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class identify_Setting extends BaseTest{
	@Test
	public void identify() {
		Back_Login.backLogin();
		webtest.click("link=设置");
		webtest.pause(3000);
		webtest.click("link=安全");
		webtest.pause(3000);
		webtest.click("link=验证码设置");
		webtest.pause(3000);
		webtest.click("id=question[]");
		webtest.type("id=question[]","你的真实姓名");
		webtest.pause(3000);
		webtest.click("id=answer[]");
		webtest.type("id=answer[]", "随便吧");
		webtest.pause(3000);
		webtest.click("id=submit");
		webtest.pause(3000);
	}
}
