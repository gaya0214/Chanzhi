package com.webtest.demo;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class PlateManage extends BaseTest{
//版块管理
	@Test
	public void plate() throws Exception {
//		Admin_Login_Cz.adminlogin();	
		webtest.click("xpath=//a[contains(.,'会员')]");
		webtest.click("xpath=//a[contains(.,'论坛')]");
		webtest.click("xpath=//a[contains(.,'版块管理')]");
		webtest.typeAndClear("id=children[8]", "版块管理1");
		webtest.typeAndClear("id=alias[8]", "版块别名1");
		webtest.type("name=children[13]", "新增版块1");
		webtest.type("name=alias[13]", "新增别名1");
		webtest.click("xpath=//div[@data-order='7']");
		webtest.keysDown();

		webtest.keysDown();
		Thread.sleep(3000);

		webtest.click("id=submit");
		Thread.sleep(5000);



	}
}
