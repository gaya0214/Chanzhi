package com.webtest.demo;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class file_Upload extends BaseTest{
	@Test
	public void  file() {
		Back_Login.backLogin();
		webtest.click("link=����");
		webtest.pause(3000);
		webtest.click("link=��ȫ");
		webtest.pause(3000);
		webtest.click("link=�����ϴ�");
		webtest.pause(3000);
		webtest.click("name=allowUpload");
		webtest.click("id=allowedFiles");
		webtest.type("id=allowedFiles", "html,");
		webtest.click("id=submit");
		webtest.pause(3000);
	}
}
