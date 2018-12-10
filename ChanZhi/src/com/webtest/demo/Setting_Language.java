package com.webtest.demo;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import com.webtest.core.*;
import com.webtest.demo.*;
/*50.设置语言（设置-语言设置）*/
public class Setting_Language extends BaseTest{
	@Test
	public void registrationAgreement() throws Exception{
		Back_Login.backLogin();
		webtest.click("xpath=//a[contains(.,'设置')]");
		webtest.click("xpath=//a[contains(.,'语言设置')]");
		webtest.click("id=enabledLangs3");
		webtest.click("id=cn2tw1");
		webtest.click("id=defaultLang1");
		webtest.click("id=submit");
	}
}
