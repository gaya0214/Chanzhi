package com.webtest.demo;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class the_Delivery extends BaseTest{
	@Test
	public void delivery() {
		Back_Login.backLogin();
		webtest.click("link=商城");
		webtest.pause(3000);
		webtest.click("xpath=/html/body/nav/div/ul/li/a[@contans(,。'设置')]");
		webtest.pause(3000);
		webtest.click("link=快递");
		webtest.pause(3000);
		webtest.type("name=children[1]","第一一个快递");
		webtest.pause(3000);
		webtest.click("id=submit");
	}
}
