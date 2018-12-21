package com.webtest.demo;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class zhandianshezhi1205 extends BaseTest{
	@Test
	public void boketest() throws Exception{
		webtest.open("http://localhost:8032/chanzhi/www/admin.php");
		Thread.sleep(1000);
		webtest.type("name=account","wangderun");
		webtest.type("name=password", "123456");
		Thread.sleep(1000);
		webtest.click("xpath=//input[@type='submit']");
		Thread.sleep(1000);
		webtest.click("xpath=//a[contains('首页')]");
		Thread.sleep(1000);
		webtest.click("xpath=/html/body/nav[1]/ul[1]/li[8]/a");//点击设置
		Thread.sleep(1000);
		webtest.type("name=copyright", "2018");
		Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[1]/div[2]/div/div[2]/form/table/tbody/tr[12]/th");
		webtest.tapClick();
		webtest.tapType("蝉知官网");
		Thread.sleep(1000);
		webtest.type("name=indexKeywords", "蝉知");
		Thread.sleep(1000);
		webtest.type("name=slogan", "口号");
		Thread.sleep(1000);
		webtest.type("name=meta", "wangderun");
		Thread.sleep(1000);
		webtest.type("name=desc", "创建网页的网站");
		Thread.sleep(1000);
		webtest.type("name=icpSN", "74110");
		Thread.sleep(1000);
		webtest.type("name=policeSN", "74110");
		Thread.sleep(1000);
		webtest.click("id=submit");
		
		/*webtest.click("xpath=");
		webtest.type("name=", "");*/
	}
}
