package com.webtest.demo;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class ArticleCategoryMaintenance extends BaseTest {
	@Test
	//维护文章类目
	public void articleCategoryMaintenance() throws Exception {
		webtest.open("http://localhost:8032/chanzhi/www/admin.php");
		Thread.sleep(1000);
		webtest.type("name=account","admin");
		webtest.type("name=password", "admin");
		webtest.click("xpath=//input[@type='submit']");
		Thread.sleep(1000);
		
		
		webtest.click("xpath=/html/body/nav[1]/ul[1]/li[2]/a");
		webtest.click("xpath=//a[contains(.,'维护类目')]");
		webtest.typeAndClear("id=children[14]", "value11");
		webtest.click("id=submit");
	}
}
