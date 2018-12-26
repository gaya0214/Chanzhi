package com.webtest.demo;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class file_Upload extends BaseTest{
	@Test
	public void  file() {
		Back_Login.backLogin();
		webtest.click("link=设置");
		webtest.pause(3000);
		webtest.click("link=安全");
		webtest.pause(3000);
		webtest.click("link=附件上传");
		webtest.pause(3000);
		webtest.click("name=allowUpload");
		webtest.click("id=allowedFiles");
		webtest.type("id=allowedFiles", "html,");
		webtest.click("id=submit");
		webtest.pause(3000);
	}
}
