package com.webtest.demo;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class SendMailSetting extends BaseTest{
	@Test
	public void sendMAilSetting() throws Exception {
		//发信设置
		webtest.click("xpath=/html/body/nav[1]/ul[1]/li[8]/a");
		webtest.click("xpath=/html/body/nav[2]/div[2]/ul[1]/li[4]/a");
		webtest.click("xpath=//a[contains(.,'发信设置')]");
		//首次设置需要填写邮箱地址
		//webtest.type("id=fromAddress", "18076553906@163.com");
		//webtest.click("id=submit");
		//Thread.sleep(2000);
		//编辑配置
		webtest.click("id=turnon1");
		webtest.type("id=fromAddress", "18076553906@163.com");
		webtest.type("id=fromName", "蝉知企业门户系统");
		webtest.type("id=host", "smtp@163.com");
		webtest.type("id=port", "25");
		webtest.click("id=auth1");
		webtest.type("id=username", "18076553906");
		webtest.type("id=password", "jimo1234");
		webtest.click("xpath=//label[contains(.,' 不加密')]");
		webtest.click("xpath=//label[contains(.,' 一般')]");
		webtest.click("id=submit");
	}
}
