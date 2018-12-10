package com.webtest.demo;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
/*9.添加联系方式（站点-语言设置-公司）*/
public class Add_CompanyAddress extends BaseTest{
	@Test
    public void addAddress() throws Exception {
    	Back_Login.backLogin();
		Thread.sleep(1000);
		webtest.click("xpath=//a[contains(.,'站点')]");
		webtest.click("xpath=//a[contains(.,'语言设置')]");
		webtest.click("xpath=//a[contains(.,'公司')]");
		webtest.click("xpath=//a[contains(.,'联系方式')]");
		webtest.type("id=contacts", "测试员1");
		webtest.type("id=phone", "123456");
		webtest.type("id=fax", "chuanzhen");
		webtest.typeAndClear("id=email", "123456@qq.com");
		webtest.type("id=qq", "123456");
		webtest.type("id=skype", "skype");
		webtest.type("id=weixin", "weixin");
		webtest.type("id=weibo", "weibo");
		webtest.type("id=wangwang", "wangwang");
		webtest.type("id=site", "wangzhi");
		webtest.type("id=address", "dizhi");
		webtest.tapClick();
		webtest.enterClick();

    }
}
