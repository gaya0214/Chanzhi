package com.webtest.demo;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class SetSecurity extends BaseTest{
	int i=0;
	@Test
	 public void setSecurity() throws InterruptedException {
		Back_Login.backLogin();
		Thread.sleep(1000);
		webtest.click("xpath=//a[contains(.,'设置')]");
		webtest.click("xpath=//a[contains(.,'安全')]");
		webtest.click("xpath=//a[contains(.,'基本设置')]");
	    webtest.click("id=captcha1");	
	    webtest.click("id=checkEmail1");
	    webtest.click("id=resetPassword2");
	    webtest.click("id=filterFunction1");
	    webtest.click("id=importantValidate3");
	    webtest.click("id=front1");
	    if(i==0) {
	    	webtest.click("id=checkLocation1");
		    webtest.click("xpath=//a[@id='useLocation']");
	    }else{
	    	webtest.click("id=checkLocation2");
	    }
	    
	    webtest.click("id=checkSessionIP1");
	    webtest.typeAndClear("xpath=//textarea[@class='form-control']", "测试2");
	    webtest.click("id=submit");
	}
}
