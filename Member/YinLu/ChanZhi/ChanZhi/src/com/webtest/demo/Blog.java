package com.webtest.demo;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.demo.Admin_Login_Cz;

public class Blog extends BaseTest{
	@Test
	public void blog() throws Exception {

//		Admin_Login_Cz.adminlogin();		
		webtest.click("xpath=//a[contains(.,'内容')]");
		webtest.click("xpath=//a[@href='/chanzhi/www/admin.php?m=article&f=admin&type=blog']");
		webtest.click("xpath=//a[contains(.,' 发布博客')]");
		webtest.click("xpath=//ul[@class='chosen-choices']");	
		//��������¼�
		webtest.keysEnter();
		webtest.typeAndClear("xpath=//input[@name='author']","test");
		
		webtest.click("xpath=//span[contains(.,'原创')]");
		webtest.keysDown();
		webtest.keysEnter();
		webtest.type("xpath=//input[@name='title']", "测试博客");
		webtest.type("xpath=//input[@name='alias']", "1");
		webtest.type("xpath=//input[@name='keywords']", "博客");

		webtest.type("xpath=//textarea[@name='summary']", "博客摘要");
		webtest.tapClick();
		webtest.tapType("博客内容");
		Thread.sleep(3000);
		
		//定位不到这个状态
		webtest.click("xpath(=//th[contains(.,'状态')]");
		webtest.tapClick();
		Thread.sleep(1000);

		webtest.tapClick();
		webtest.keysEnter();
	

		Thread.sleep(5000);

	}
	
}
