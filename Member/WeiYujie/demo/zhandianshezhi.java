package com.webtest.demo1205;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class zhandianshezhi extends BaseTest{
	@Test
	//站点设置（设置-站点设置）
	public void jifenjiangli() throws Exception {
		webtest.open("http://localhost:8032/chanzhi/www/admin.php");
		Thread.sleep(1000);
		webtest.type("name=account","admin");
		webtest.type("name=password", "admin");
		webtest.click("xpath=//input[@type='submit']");
		Thread.sleep(1000);
		
		//进入站点设置
		webtest.click("xpath=/html/body/nav[1]/ul[1]/li[8]/a");
		//基本信息设置
		
		webtest.typeAndClear("id=name", "蝉知企业门户系统");

		webtest.typeAndClear("id=keywords", "蝉知企业门户系统");
		webtest.typeAndClear("id=indexKeywords", "蝉知企业门户系统");
		webtest.typeAndClear("id=slogan", "蝉知企业门户系统");
		webtest.typeAndClear("id=meta", "蝉知企业门户系统");
		webtest.typeAndClear("id=desc", "蝉知企业门户系统");
		webtest.typeAndClear("id=icpSN", "123");
		webtest.typeAndClear("id=policeSN", "456");
		webtest.typeAndClear("id=policeLink", "http://www.miitbeian.gov.cn");
		webtest.tapClick();
		webtest.Enterclick();
		Thread.sleep(3000);
	}
}