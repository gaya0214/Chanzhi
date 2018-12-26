package com.webtest.demo;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class disgn_ListSetting extends BaseTest{
	@Test
	public static void disgnsetting(){
		Back_Login.backLogin();
		webtest.click("link=设计");
		webtest.click("xpath=//a[@href='/chanzhi/www/admin.php?m=ui&f=others']");
	}
	@Test
	public void listsettiong() {
		webtest.click("link=列表设置");
		webtest.pause(2000);
		webtest.typeAndClear("id=articleRec", "6");
		webtest.pause(1000);
		webtest.typeAndClear("id=productRec", "9");
		webtest.pause(2000);
		webtest.typeAndClear("id=blogRec", "13");
		webtest.pause(2000);
		webtest.typeAndClear("id=bookRec", "13");
		webtest.pause(2000);
		webtest.typeAndClear("id=forumRec", "10");
		webtest.pause(2000);
		webtest.typeAndClear("id=replyRec", "11");
		webtest.pause(2000);
		webtest.click("id=blog[showCategory]1");
		webtest.pause(2000);
		webtest.click("name=blog[categoryName]");
		webtest.selectByValue("name=blog[categoryName]", "abbr");
		webtest.pause(2000);
		webtest.click("name=blog[categoryLevel]");
		webtest.selectByValue("name=blog[categoryLevel]", "final");
		webtest.pause(2000);
		webtest.click("name=blog[imagePosition]");
		webtest.selectByValue("name=blog[imagePosition]", "right");
		webtest.selectByValue("name=blog[imageSize]", "middle");
		webtest.typeAndClear("id=blog[imageWidth]", "150");
		webtest.pause(2000);
		webtest.click("id=article");
		webtest.selectByValue("id=article", "left");
		webtest.selectByValue("name=article[imageSize]", "middle");
		webtest.typeAndClear("id=article[imageWidth]", "90");
		webtest.pause(2000);
		webtest.click("name=product[browseType]");
		webtest.selectByValue("name=product[browseType]", "card");
		webtest.pause(2000);
		webtest.click("name=product[showViews]");
		webtest.selectByValue("name=product[showViews]", "1");
		webtest.pause(2000);
		webtest.click("name=product[showPrice]");
		webtest.selectByValue("name=product[showPrice]", "1");
		webtest.pause(2000);
		webtest.click("id=submit");
	}
}
