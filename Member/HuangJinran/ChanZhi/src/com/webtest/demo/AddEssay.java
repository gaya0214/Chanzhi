package com.webtest.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class AddEssay extends BaseTest{
	@Test
	// i=0为不跳转  i=1为跳转
	public void adde() throws InterruptedException {
		int n=0;
    	Back_Login.backLogin();
    	webtest.click("xpath=//a[contains(.,'文章')]");
    	Thread.sleep(1000);
    	webtest.click("xpath=//a[contains(.,'发布文章')]");
    	Thread.sleep(1000);
    	webtest.click("xpath=//ul[@class='chosen-choices']");
    	webtest.enterClick();
    	webtest.typeAndClear("id=author", "author");
    	webtest.click("xpath=//*[@id=\"source_chosen\"]");
    	webtest.downClick();
    	webtest.enterClick();
    	webtest.type("id=title", "title");
    	if(n==0) {
        	//只能使用英文或数字
        	webtest.type("id=alias", "alias");
        	//用逗号隔开
        	webtest.type("id=keywords", "keywords");
        	webtest.type("id=summary", "summary");
        	webtest.enterFrame(0);
        	webtest.type("xpath=//html[@spellcheck='false']", "text!!!");
        	webtest.leaveFrame();
        	webtest.click("xpath=//input[@id='status2']");
    	}else {
    		webtest.click("id=isLink");
    		Thread.sleep(1000);
    		webtest.type("id=link", "www.baidu.com");
    	}

    	webtest.click("xpath=//*[@id=\"submit\"]");
    	Reporter.log("文章发布测试1");
    }
}
