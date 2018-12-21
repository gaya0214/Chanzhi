package com.webtest.demo;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class DomainNameSettings extends BaseTest{
	@Test
	//域名设置
	public void domainNameSettings() throws Exception {
		webtest.open("http://localhost:8032/chanzhi/www/admin.php");
		Thread.sleep(1000);
		webtest.type("name=account","admin");
		webtest.type("name=password", "admin");
		webtest.click("xpath=//input[@type='submit']");
		Thread.sleep(1000);
		
		webtest.click("xpath=/html/body/nav[1]/ul[1]/li[8]/a");
		webtest.click("xpath=//a[contains(.,'域名设置')]");
		webtest.type("id=domain", "www.1234.com");
		webtest.type("id=allowedDomain", "www.x11234.com");
		webtest.click("value=https");
		webtest.click("id=submit");
	}
}
