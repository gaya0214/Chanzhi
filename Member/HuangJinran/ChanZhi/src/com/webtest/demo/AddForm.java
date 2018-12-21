package com.webtest.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class AddForm extends BaseTest{
	@Test()
    public void addform() throws InterruptedException {
		int n=0;
		Back_Login.backLogin();
		webtest.click("xpath=//a[contains(.,'ตฅาณ')]");
    	Thread.sleep(2000);
    	webtest.click("xpath=//a[@class='btn btn-primary']");
    	Thread.sleep(2000);
    	webtest.type("id=title", "title1");
    	webtest.typeAndClear("id=order", "2");
    	if(n==0) {

        	webtest.type("id=alias", "alias");
            webtest.type("id=keywords", "keywords1");
            webtest.type("name=summary", "summary");
            webtest.enterFrame(0);
            webtest.type("xpath=//html[@spellcheck='false']", "text");
            webtest.leaveFrame();
            webtest.typeAndClear("id=addedDate","2018-11-27 16:00");
            webtest.click("xpath=//label[@for='status2']");
            webtest.click("xpath=//*[@id=\"onlyBody\"]");
    	}else {
    		webtest.click("id=isLink");
        	Thread.sleep(2000);
        	webtest.type("id=link", "www.baidu.com");
    	}
        webtest.click("id=submit");
	}
}
