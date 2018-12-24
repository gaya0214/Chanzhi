package com.webtest.demo;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class SetDesignThumbnail extends BaseTest{
	@Test
    public void setDesignThumbmail() throws InterruptedException {
    	Back_Login.backLogin();
		Thread.sleep(1000);
		webtest.click("xpath=//a[contains(.,'设计')]");
	    webtest.click("xpath=//a[@href='/chanzhi/www/admin.php?m=ui&f=others']");
		webtest.click("xpath=//a[contains(.,'缩略图设置')]");
		webtest.typeAndClear("xpath=//input[@id='thumbs[s][width]']", "60");
		webtest.typeAndClear("xpath=//input[@id='thumbs[s][height]']", "60");
		webtest.typeAndClear("xpath=//input[@id='thumbs[m][width]']", "200");
		webtest.typeAndClear("xpath=//input[@id='thumbs[m][height]']", "200");
		webtest.typeAndClear("xpath=//input[@id='thumbs[l][width]']", "600");
		webtest.typeAndClear("xpath=//input[@id='thumbs[l][height]']", "800");
		webtest.click("id=submit");
	}
}
