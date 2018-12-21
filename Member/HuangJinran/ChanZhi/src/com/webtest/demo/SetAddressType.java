package com.webtest.demo;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class SetAddressType extends BaseTest{
	int i=0; 
	@Test
	 public void setAddtype() throws InterruptedException {
		Back_Login.backLogin();
		Thread.sleep(1000);
		webtest.click("xpath=//a[contains(.,'设置')]");
		webtest.click("xpath=//a[contains(.,'地址类型')]");
		if(i==0) {
			webtest.click("id=requestType1");
		}else if(i==1) {
			webtest.click("requestType2");
		}else if(i==2) {
			webtest.click("requestType3");
		}
		webtest.click("id=submit");
	 }
}
