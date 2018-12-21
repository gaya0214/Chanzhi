package com.webtest.demo;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class AddFilesupload extends BaseTest{
	@Test
    public void addfupload() throws InterruptedException {
		int n=0;
    	Back_Login.backLogin();
		Thread.sleep(1000);
		webtest.click("xpath=//a[contains(.,'安全')]");
		webtest.click("xpath=//a[contains(.,'附件上传')]");
		if(n==1) {
			webtest.click("xpath=//input[@name='allowUpload']");	
		}
	    webtest.typeAndClear("xpath=//textarea[@id='allowedFiles']", "txt,doc");
	    webtest.click("id=submit");
	}
}
