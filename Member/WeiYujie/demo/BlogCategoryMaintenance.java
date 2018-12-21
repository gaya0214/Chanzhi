package com.webtest.demo;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class BlogCategoryMaintenance extends BaseTest {
	@Test
	//维护博客类目
	public void blogCategoryMaintenance() throws Exception {
		webtest.open("http://localhost:8032/chanzhi/www/admin.php");
		Thread.sleep(1000);
		webtest.type("name=account","admin");
		webtest.type("name=password", "admin");
		webtest.click("xpath=//input[@type='submit']");
		Thread.sleep(1000);
		
		webtest.click("xpath=/html/body/nav[1]/ul[1]/li[2]/a");
		webtest.click("xpath=/html/body/nav[2]/div[2]/ul[1]/li[3]/a");
		webtest.click("xpath=//a[contains(.,'维护类目')]");
		webtest.typeAndClear("id=children[12]", "value11");
		webtest.typeAndClear("id=alias[12]", "value1111");
		webtest.click("id=submit");
	}
}
