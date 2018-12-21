package com.webtest.demo1207;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class shezhiyuyan extends BaseTest{
	@Test
	//设置语言（设置-语言设置）
	public void jifenjiangli() throws Exception {
		webtest.open("http://localhost:8032/chanzhi/www/admin.php");
		Thread.sleep(1000);
		webtest.type("name=account","admin");
		webtest.type("name=password", "admin");
		webtest.click("xpath=//input[@type='submit']");
		Thread.sleep(1000);
		
		
		webtest.click("xpath=/html/body/nav[1]/ul[1]/li[8]/a");
		webtest.click("xpath=//a[contains(.,'语言设置')]");
		
		webtest.click("xpath=//input[@id='cn2tw1']");
		webtest.click("xpath=//label[@for='defaultLang1']");
		webtest.click("id=submit");
		Thread.sleep(1000);
	}
}