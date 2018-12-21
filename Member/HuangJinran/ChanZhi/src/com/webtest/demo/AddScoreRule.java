package com.webtest.demo;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class AddScoreRule extends BaseTest{
    @Test
    public void addRule() throws InterruptedException {
    	Back_Login.backLogin();
		Thread.sleep(1000);
		webtest.click("xpath=//a[contains(.,'站点')]");
		webtest.click("xpath=//a[contains(.,'语言设置')]");
		webtest.click("xpath=//a[contains(.,'积分')]");
		webtest.typeAndClear("xpath=//*[@id=\"register\"]", "100");
		webtest.typeAndClear("xpath=//*[@id=\"login\"]", "4");
		webtest.typeAndClear("xpath=//*[@id=\"maxLogin\"]", "20");
		webtest.typeAndClear("xpath=//*[@id=\"thread\"]", "10");
		webtest.typeAndClear("xpath=//*[@id=\"reply\"]", "6");
		webtest.typeAndClear("xpath=//*[@id=\"approveSubmission\"]", "20");
		webtest.typeAndClear("xpath=//*[@id=\"delThread\"]", "30");
		webtest.typeAndClear("xpath=//*[@id=\"delReply\"]", "18");
		webtest.typeAndClear("xpath=//*[@id=\"perYuan\"]", "20");
		webtest.typeAndClear("xpath=//*[@id=\"minAmount\"]", "2");
		webtest.click("xpath=//*[@id=\"submit\"]");
		Reporter.log("修改积分规则");
    }
}
