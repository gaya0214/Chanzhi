package com.webtest.demo;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class SetDesignList extends BaseTest{
	int i=0;
	@Test
    public void setDesignList() throws InterruptedException {
    	Back_Login.backLogin();
		Thread.sleep(1000);
		webtest.click("xpath=//a[contains(.,'设计')]");
	    webtest.click("xpath=//a[@href='/chanzhi/www/admin.php?m=ui&f=others']");
		webtest.click("xpath=//a[contains(.,'列表设置')]");
		webtest.typeAndClear("id=articleRec", "10");
		webtest.typeAndClear("id=productRec", "20");
		webtest.typeAndClear("id=blogRec", "20");
		webtest.typeAndClear("id=bookRec", "24");
		webtest.typeAndClear("id=messageRec", "20");
		webtest.typeAndClear("id=commentRec", "20");
		webtest.typeAndClear("id=forumRec", "20");
		webtest.typeAndClear("id=replyRec", "20");
		if(i==0) {
			webtest.click("id=blog[showCategory]1");
			webtest.selectByIndex("xpath=//select[@name='blog[categoryName]']", 1);
			webtest.selectByIndex("xpath=//select[@name='blog[categoryLevel]']", 1);
		}else {

			webtest.click("id=blog[showCategory]2");
		}
		webtest.selectByIndex("xpath=//select[@name='blog[imagePosition]']", 0);
		webtest.selectByIndex("xpath=//select[@name='blog[imageSize]']", 1);
		webtest.typeAndClear("xpath//input[@id='blog[imageWidth]']", "200");
		webtest.selectByIndex("xpath=//select[@name='article[imagePosition]']", 0);
		webtest.selectByIndex("xpath=//select[@name='article[imageSize]']", 1);
		webtest.typeAndClear("xpath=//input[@id='article[imageWidth]']", "200");
		webtest.selectByIndex("xpath=//select[@name='product[browseType]']", 1);
		webtest.selectByIndex("xpath=//select[@name='product[showViews]']", 1);
		webtest.selectByIndex("xpath=//select[@name='product[showPrice]']", 1);
		webtest.click("id=submit");
	}
}
