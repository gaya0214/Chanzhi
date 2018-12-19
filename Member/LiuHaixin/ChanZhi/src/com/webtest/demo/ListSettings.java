package com.webtest.demo;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class ListSettings extends BaseTest{
	@Test
	public void listsettings() throws Exception{
		Back_Login.backLogin();
		webtest.click("xpath=//a[contains(.,'设计')]");
		webtest.click("xpath=//a[contains(.,'设置')]");
		webtest.click("xpath=//a[contains(.,'列表设置')]");
		webtest.typeAndClear("id=articleRec","10");
		webtest.typeAndClear("id=productRec","100");
		webtest.typeAndClear("id=blogRec","500");
		webtest.typeAndClear("id=bookRec","2000");
		webtest.typeAndClear("id=messageRec","9520");
		webtest.typeAndClear("id=commentRec","78");
		webtest.typeAndClear("id=forumRec","985");
		webtest.typeAndClear("id=replyRec","9856");
		webtest.click("id=blog[showCategory]1");
		webtest.selectByValue("name=blog[imagePosition]","left");
		webtest.selectByValue("name=blog[imageSize]","middle");
		webtest.typeAndClear("id=blog[imageWidth]","985");
		webtest.selectByValue("name=article[imagePosition]","left");
		webtest.selectByValue("name=article[imageSize]","middle");
		webtest.typeAndClear("id=article[imageWidth]","95214");
		webtest.selectByValue("name=product[browseType]","list");
		webtest.selectByValue("name=product[showViews]","0");
		webtest.selectByValue("name=product[showPrice]","0");
		webtest.click("id=submit");
		}

}
