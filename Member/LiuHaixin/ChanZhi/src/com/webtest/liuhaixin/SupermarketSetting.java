package com.webtest.demo;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class SupermarketSetting extends BaseTest{
	@Test
	public void supermarketsetting() throws Exception{
		Back_Login.backLogin();
		webtest.click("xpath=//a[contains(.,'商城')]");
		webtest.click("xpath=//html/body/nav/div/ul/li/a[contains(.,'设置')]");
		webtest.click("xpath=//a[contains(.,'快递')]");
		webtest.type("name=children[1]","顺丰快递");
		webtest.type("name=children[2]","圆通快递");
		webtest.type("name=children[3]","中通快递");
		webtest.type("name=children[4]","韵达快递");
		webtest.type("name=children[5]","天天快递");
		webtest.click("id=submit");
		}
}
