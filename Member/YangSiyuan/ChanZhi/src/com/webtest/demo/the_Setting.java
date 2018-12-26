package com.webtest.demo;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class the_Setting extends BaseTest{
	@Test
	public void mallSetting() {
		Back_Login.backLogin();
		webtest.click("link=商城");
		webtest.click("xpath=//a[@href='/chanzhi/www/admin.php?m=roduct&f=setting']");
		webtest.pause(3000);
		webtest.click("id=currency_chosen");
		webtest.click("xpath=//li[@data-option-array-index='5']");
		webtest.click("id=stook2");
		webtest.type("id=confirmLimit","15");
		webtest.type("id=expireLimit", "30");
		}
	@Test
	public void pay() {
		webtest.click("id=payment3");
		webtest.click("id=submit");
	}
	@Test
	public void pay2() {
		webtest.click("id=payment1");
		webtest.type("id=pid", "20880000000000000000");
		webtest.type("id=key","189872819511997123Ysys");
		webtest.type("id=email","437895852@qq.com");
		webtest.click("id=submit");
	}
	@Test
	public void pay3() {
		webtest.click("id=payment2");
		this.pay2();
		}
	@Test
	public void pay4() {
		webtest.click("id=payment4");
		webtest.type("id=wechat[appid]", "18987281951");
		webtest.type("id=wechat[mch_id]","11997123Ysys");
		webtest.type("id=wechat[apikey]","888888");
		webtest.type("id=wechat[appsecret]","888888");
		webtest.click("id=submit");
		
	}
}
