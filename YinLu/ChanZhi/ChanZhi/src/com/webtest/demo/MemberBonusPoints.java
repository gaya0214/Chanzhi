package com.webtest.demo;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class MemberBonusPoints extends BaseTest{
//会员奖励积分
	@Test
	public void member() throws Exception {
//		Admin_Login_Cz.adminlogin();	
		webtest.click("xpath=//a[contains(.,'会员')]");
		webtest.click("xpath=//a[contains(.,'全部会员')]");
		webtest.click("xpath=//input[@value='user1']");
		webtest.tapClick();
		webtest.tapClick();
		webtest.tapClick();
		webtest.tapClick();
		webtest.keysEnter();

		webtest.click("xpath=//a[contains(@href,'/chanzhi/www/admin.php?m=user&f=addScore&account=user1')]");
		webtest.type("name=count", "5");
		webtest.type("id=note", "登录奖励");
		webtest.click("xpath=//input[@value='保存']");
		Thread.sleep(8000);

	}
}
