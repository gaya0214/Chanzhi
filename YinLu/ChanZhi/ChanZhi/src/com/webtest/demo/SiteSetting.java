package com.webtest.demo;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class SiteSetting extends BaseTest{
//站点设置
	@Test
	public void site() throws Exception {
//		Admin_Login_Cz.adminlogin();	
		webtest.click("xpath=//a[contains(.,'设置')]");
		webtest.click("xpath=//a[contains(.,'站点设置')]");
		webtest.click("id=status2");
		webtest.click("id=type2");
		webtest.click("id=mobileTemplate1");
		webtest.typeAndClear("id=name", "蝉知系统");
		webtest.type("id=copyright", "1998-1-1");
		webtest.type("id=keywords", "关键词");
		webtest.type("id=indexKeywords", "首页关键词");
		webtest.type("id=slogan", "站点口号");
		webtest.type("id=meta", "<meta></meta>");
		webtest.type("id=desc", "站点描述");
		webtest.type("id=icpSN", "1");
		webtest.type("id=policeSN", "11");
		webtest.tapClick();
		webtest.tapClick();
		webtest.keysEnter();
		Thread.sleep(5000);
	}
}
