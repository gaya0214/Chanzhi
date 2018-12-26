package com.webtest.demo;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class add_Setting extends BaseTest{
	@Test
	public void addsetting() {
		Back_Login.backLogin();
		webtest.click("link=内容");
		webtest.click("link=手册");
		webtest.click("xpath=//a[contains(@href,'/chanzhi/www/admin.php?m=book&f=setting')]");
		webtest.pause(3000);
		webtest.click("id=index");
		webtest.selectByValue("id=index","list");
		webtest.isChecked("name=fullScreen");
		webtest.selectByValue("id=chapter", "home");
		webtest.click("id=submit");
	}
	
}
