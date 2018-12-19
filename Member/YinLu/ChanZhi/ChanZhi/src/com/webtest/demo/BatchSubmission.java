package com.webtest.demo;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class BatchSubmission extends BaseTest{
	//批量提交资源
	@Test
	public void member() throws Exception {
//		Admin_Login_Cz.adminlogin();	
		webtest.click("xpath=//a[contains(.,'推广')]");
		webtest.click("xpath=//a[contains(.,'熊掌号')]");
		webtest.click("xpath=//a[contains(.,'批量提交')]");
		webtest.click("xpath=//a[contains(.,'批量提交资源')]");
		Thread.sleep(3000);
		

}
}