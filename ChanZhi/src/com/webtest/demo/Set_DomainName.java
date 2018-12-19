package com.webtest.demo;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
/*作者：韦宇杰
 * 49.设置域名（设置-域名设置）*/
public class Set_DomainName extends BaseTest{
	@Test
	 public void setDomainname() throws Exception {
		Back_Login.backLogin();
		Thread.sleep(1000);
		webtest.click("xpath=//a[contains(.,'设置')]");
		webtest.click("xpath=//a[contains(.,'域名设置')]");
		webtest.typeAndClear("id=domain", "测试1");
		webtest.typeAndClear("id=allowedDomain", "测试2");
		webtest.click("id=scheme2");
		webtest.click("id=submit");
	}
}
