package com.webtest.demo;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class StyleCSS extends BaseTest{
	@Test
	public void stylecss() throws Exception{
		Back_Login.backLogin();
		webtest.click("xpath=//a[contains(.,'Éè¼Æ')]");
		webtest.click("xpath=//a[contains(.,'Çø¿é')]");
		webtest.click("class=panel-actions");
		webtest.click("xpath=//a[contains(.,'CSS')]");
		webtest.type("class=ace_text-input","");
		webtest.click("id=submit");
		}
}
