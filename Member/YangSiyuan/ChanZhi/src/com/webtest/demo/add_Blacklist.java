package com.webtest.demo;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class add_Blacklist extends BaseTest{
	@Test
	public void blacklist() {
		Back_Login.backLogin();
		webtest.click("link=����");
		webtest.pause(3000);
		webtest.click("link=��ȫ");
		webtest.pause(3000);
		webtest.click("link=����������");
		webtest.pause(3000);
		webtest.click("link=��Ӻ�����");
		webtest.pause(3000);
		webtest.click("id=indentity");
		webtest.type("id=identity", "ysy0");
		webtest.pause(3000);
		webtest.click("id=reason");
		webtest.type("id=reason", "����");
		webtest.pause(3000);
		webtest.click("id=expired");
		webtest.selectByValue("id=expired", "10");
		webtest.click("id=submit");
		webtest.pause(5000);
	}
	
	
	
}
