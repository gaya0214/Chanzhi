package com.webtest.demo;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class NewGroup extends BaseTest {
	@Test
	//新增分组
	public void newGroup() throws Exception {
		webtest.open("http://localhost:8032/chanzhi/www/admin.php");
		Thread.sleep(1000);
		webtest.type("name=account","admin");
		webtest.type("name=password", "admin");
		webtest.click("xpath=//input[@type='submit']");
		Thread.sleep(1000);
		
		
		webtest.click("xpath=/html/body/nav[1]/ul[1]/li[8]/a");
		webtest.click("xpath=/html/body/nav[2]/div[2]/ul[1]/li[5]/a");
		webtest.click("xpath=//a[contains(.,'分组权限')]");
		webtest.click("xpath=//a[contains(.,'新增分组')]");
		webtest.type("id=name", "超级会员");
		webtest.type("id=desc", "会员的升级版");
		webtest.click("id=submit");
	}
}
