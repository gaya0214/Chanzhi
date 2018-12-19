package com.webtest.demo;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class Upload extends BaseTest{
	@Test
	public void upload() throws Exception{
		Back_Login.backLogin();
		webtest.click("xpath=//a[contains(.,'站点')]");
		webtest.click("xpath=//a[contains(.,'安全')]");
		webtest.click("xpath=//a[contains(.,'附件上传')]");
		webtest.click("name=allowUpload");
		webtest.type("id=allowFiles","");
		webtest.click("id=submit");
		
		}

}
