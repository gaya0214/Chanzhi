package com.webtest.demo;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class SettingUp extends BaseTest{
	int n=1;
	int i=1;
	@Test
    public void settingUp() throws InterruptedException {
    	Back_Login.backLogin();
		Thread.sleep(1000);
		webtest.click("xpath=//a[contains(.,'商城')]");
		webtest.click("xpath=//a[@href='/chanzhi/www/admin.php?m=product&f=setting']");
		webtest.click("xpath=//a[@class='chosen-single']");
		webtest.downClick();
		webtest.enterClick();
		if(n==0) {
			webtest.click("xpath=//input[@id='stock1']");
		}else if(n==1) {
			webtest.click("xpath=//input[@id='stock2']");
		}
		webtest.typeAndClear("xpath=//input[@id='confirmLimit']", "8");
		webtest.typeAndClear("xpath=//input[@id='exireLimit']", "31");
		if(i==1) {
			webtest.click("xpath=//input[@id='payment1']");
			webtest.type("xpath=//input[@id='pid']", "合作者ID");
			webtest.type("xpath=//input[@id='key']", "合作者KEY");
			webtest.type("xpath=//input[@id='email']", "支付宝邮箱");
		}else if(i==2) {
			webtest.click("xpath=//input[@id='payment2']");
			webtest.type("xpath=//input[@id='pid']", "合作者ID");
			webtest.type("xpath=//input[@id='key']", "合作者KEY");
			webtest.type("xpath=//input[@id='email']", "支付宝邮箱");
		}else if(i==3) {
			webtest.click("xpath=//input[@id='payment3']");
		}else if(i==4) {
			webtest.click("xpath=//input[@id='payment4']");
			webtest.type("xpath=//input[@id='wechat[appid]']", "公众号APPID");
			webtest.type("xpath=//input[@id='wechat[mch_id]']", "商户号");
			webtest.type("xpath=//input[@id='wechat[appsecret]']", "公众号密匙");
			
			
		}
		webtest.click("id=submit");
    }
}
