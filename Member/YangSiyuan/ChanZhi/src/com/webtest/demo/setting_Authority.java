package com.webtest.demo;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class setting_Authority extends BaseTest{
	public void enter() {
		Back_Login.backLogin();
		webtest.click("link=设置");
		webtest.click("link=安全");
		webtest.click("link=分组权限");
	}
	public void edition() {
		webtest.type("id=name","这是一个分组");
		webtest.pause(3000);
		webtest.type("id=desc", "测试新增分组功能");
		webtest.click("id=submit");
	}
	@Test
	public void add_group() {
		this.enter();
		this.edition();
	}
	@Test
	public void edit() {
		this.enter();
		webtest.click("xpath=//a[@href='/chanzhi/www/admin/php?m=group&f=edit&groupID=4']");
		this.edition();
	}
	/*@Test
	public void authoity() {
		this.enter();
		webtest.click("xpath=//a[(@href='/chanzhi/www/admin/php?m=group&f=managePriv&type=byGroup&param=4')]");
		webtest.pause(3000);
	}*/
}
