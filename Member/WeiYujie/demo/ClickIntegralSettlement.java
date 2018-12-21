package com.webtest.demo;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class ClickIntegralSettlement extends BaseTest{
	@Test
	public void clickIntegralSettlement() throws Exception {
		
		//点击积分结算
		webtest.click("xpath=/html/body/nav[1]/ul[1]/li[8]/a");
		webtest.click("xpath=/html/body/nav[2]/div[2]/ul[1]/li[3]/a");
		webtest.click("xpath=//a[contains(.,'积分结算')]");
		webtest.click("id=submit");
		
	}
}
