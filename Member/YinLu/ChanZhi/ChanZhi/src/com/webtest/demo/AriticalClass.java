package com.webtest.demo;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class AriticalClass extends BaseTest{
//维护类目文章
	@Test
	public void aclass() throws Exception {
		
//		Admin_Login_Cz.adminlogin();	
		webtest.click("xpath=//a[contains(.,'内容')]");
		webtest.click("xpath=//a[contains(.,'维护类目')]");
		webtest.typeAndClear("name=children[1]", "文章类目1");
		webtest.typeAndClear("name=alias[1]", "别名1");
		
		webtest.type("name=children[17]", "新增文章类目Ŀ");
		webtest.type("name=alias[17]", "新增别名");
		webtest.click("id=submit");
		Thread.sleep(5000);

		
		
}
}
