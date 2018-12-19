package com.webtest.demo;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class ThumbSettings extends BaseTest{
	@Test
	public void thumbsettings() throws Exception{
		Back_Login.backLogin();
		webtest.click("xpath=//a[contains(.,'设计')]");
		webtest.click("xpath=//a[contains(.,'设置')]");
		webtest.click("xpath=//a[contains(.,'缩略图设置')]");
		webtest.typeAndClear("id=thumbs[s][width]","80");
		webtest.typeAndClear("id=thumbs[s][height]","80");
		webtest.typeAndClear("id=thumbs[m][width]","300");
		webtest.typeAndClear("id=thumbs[m][height]","300");
		webtest.typeAndClear("id=thumbs[l][width]","800");
		webtest.typeAndClear("id=thumbs[l][height]","600");
		webtest.click("id=submit");
		
		}
}
