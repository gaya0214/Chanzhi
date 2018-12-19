package com.webtest.demo;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class SupermarketSettings extends BaseTest{
	@Test
	public void supermarketsetting() throws Exception{
		Back_Login.backLogin();
		webtest.click("xpath=//a[contains(.,'…Ã≥«')]");
		webtest.click("xpath=//html/body/nav/div/ul/li/a[contains(.,'…Ë÷√')]");
		webtest.type("class=chosen-single", "");
		webtest.type("id=confirmLimit", "");
		webtest.type("id=expireLimit", "");
		webtest.click("class=checkbox-inline");
		webtest.click("id=payment1");
		webtest.click("id=payment2");
		webtest.click("id=payment4");
		webtest.type("id=pid","2088888888888888");
		webtest.type("id=key","wert1234123412311231123112311231");
		webtest.type("id=email","1689449711@qq.com");
		webtest.type("id=wechat[appid]","223879");
		webtest.type("id=wechat[mch_id]","8945");
		webtest.type("id=wechat[apikey]","123456");
		webtest.type("id=wechat[appsecret]","123458");
		webtest.click("id=submit");
		
		
		}

}
