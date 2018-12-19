package com.webtest.demo;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class BlogClass extends BaseTest {
	//维护博客类目

	@Test
	public void aclass() throws Exception {
		
//		Admin_Login_Cz.adminlogin();	
		webtest.click("xpath=//a[contains(.,'内容')]");
		webtest.click("xpath=//a[contains(.,'博客')]");
		webtest.click("xpath=//a[contains(.,'维护类目')]");
		webtest.typeAndClear("name=children[4]", "博客类目1");
		webtest.typeAndClear("name=alias[4]", "博客别名1");
		
		webtest.type("name=children[6]", "新增博客类目");
		webtest.type("name=alias[6]", "新增博客别名");
		
		webtest.click("id=submit");
		
		Thread.sleep(5000);
}
}
