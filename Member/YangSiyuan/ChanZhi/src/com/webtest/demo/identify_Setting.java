package com.webtest.demo;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class identify_Setting extends BaseTest{
	@Test
	public void identify() {
		Back_Login.backLogin();
		webtest.click("link=����");
		webtest.pause(3000);
		webtest.click("link=��ȫ");
		webtest.pause(3000);
		webtest.click("link=��֤������");
		webtest.pause(3000);
		webtest.click("id=question[]");
		webtest.type("id=question[]","�����ʵ����");
		webtest.pause(3000);
		webtest.click("id=answer[]");
		webtest.type("id=answer[]", "����");
		webtest.pause(3000);
		webtest.click("id=submit");
		webtest.pause(3000);
	}
}
