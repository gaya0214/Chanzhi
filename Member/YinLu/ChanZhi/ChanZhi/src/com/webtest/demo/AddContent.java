package com.webtest.demo;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class AddContent extends BaseTest{
	//自定义添加内容
	@Test
	public void aclass() throws Exception {
			
//		Admin_Login_Cz.adminlogin();	
		webtest.click("xpath=//a[contains(.,'设计')]");
		webtest.click("xpath=//a[contains(.,'区块')]");
		
		webtest.click("xpath=//strong[contains(.,'自定义')]");
		webtest.click("xpath=//a[contains(.,' 添加')]");
		
		webtest.type("name=title", "自定义名称");
		webtest.click("xpath=//span[contains(.,'[没有图标]')]");
		webtest.keysDown();
		webtest.keysEnter();
		webtest.tapClick();
		webtest.tapClick();
		
		webtest.tapType("123");
		Thread.sleep(5000);
		webtest.click("xpath=//th[contains(.,'更多链接')]");
		webtest.tapClick();
		webtest.tapType("123");
		webtest.tapClick();
		webtest.tapType("123");
		webtest.click("id=submit");
		Thread.sleep(5000);
		
			
}
}
