package com.webtest.demo;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import com.webtest.core.*;
import com.webtest.demo.*;
/*45.设置CDN设置（设置-CDN设置）*/
public class CDN_Setting extends BaseTest{
	@Test
	public void cdnSetting() throws Exception{
		Back_Login.backLogin();
		webtest.click("xpath=//a[contains(.,'设置')]");
		webtest.click("xpath=//a[contains(.,'CDN设置')]");
		webtest.click("id=open1");
		webtest.click("id=submit");
	}
}
