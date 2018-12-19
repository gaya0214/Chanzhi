package com.webtest.demo;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.demo.Admin_Login_Cz;

public class HandBook extends BaseTest{
	//添加手册 
	@Test
	public void handbook() throws Exception{
//		Admin_Login_Cz.adminlogin();
		webtest.click("xpath=//a[contains(.,'内容')]");
		webtest.click("xpath=//a[contains(.,'手册')]");
		Thread.sleep(1000);
		webtest.click("xpath=//a[contains(.,'添加手册')]");
		webtest.typeAndClear("xpath=//input[@name='author']","test");
		webtest.type("xpath=//input[@name='title']","手册2");
		webtest.type("xpath=//input[@name='alias']", "1");
		Thread.sleep(3000);

		webtest.type("xpath=//input[@name='keywords']","手册");
		Thread.sleep(3000);

		webtest.type("xpath=//textarea[@name='summary']","手册摘要");
		Thread.sleep(3000);

		webtest.tapClick();
		webtest.tapType("手册内容");

		webtest.click("xpath(=//th[contains(.,'内容')]");
		Thread.sleep(3000);
		webtest.keysDown();
		webtest.keysDown();
		webtest.keysDown();
		webtest.keysDown();

		Thread.sleep(3000);
		webtest.click("xpath=//input[@type='submit']");
		Thread.sleep(3000);

	}
	
}
