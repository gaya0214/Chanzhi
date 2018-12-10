package com.webtest.demo;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
/*17.附件上传（站点-语言设置-安全）*/
public class Add_Filesupload extends BaseTest{
	@Test
	 public void addfupload() throws Exception {
		
    	Back_Login.backLogin();
		Thread.sleep(1000);
		webtest.click("xpath=//a[contains(.,'安全')]");
		webtest.click("xpath=//a[contains(.,'附件上传')]");
		webtest.click("xpath=//input[@name='allowUpload']");	
	    webtest.typeAndClear("xpath=//textarea[@id='allowedFiles']", "txt,doc");
	    webtest.click("id=submit");
	}
}
