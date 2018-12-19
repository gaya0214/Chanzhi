package com.webtest.demo;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class Administrator extends BaseTest{
	@Test
	public void administrator() throws Exception{
		Back_Login.backLogin();
		webtest.click("xpath=//a[contains(.,'设置')]");
		webtest.click("xpath=//a[contains(.,'安全')]");
		webtest.click("xpath=//a[contains(.,'分组权限')]");
		webtest.click("xpath=//a[contains(.,'编辑')]");
		webtest.typeAndClear("id=name","管理员");
		webtest.typeAndClear("id=desc","拥有后台所有权限");
		webtest.click("id=submit");
		}

}
