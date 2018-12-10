package com.webtest.demo;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import com.webtest.core.*;
import com.webtest.demo.*;
/*6.添加手册*/
public class Hand_Book extends BaseTest{
	@Test
	public void handBook() throws Exception{
	Back_Login.backLogin();
	webtest.click("xpath=//a[contains(.,'手册')]");
	webtest.click("xpath=//a[contains(.,'添加手册')]");

	webtest.type("id=author", "张三");
	webtest.type("id=title", "蝉知使用手册");
	webtest.type("id=alias", "chanzhi");
	webtest.type("id=keywords","蝉知֪");
	webtest.type("id=summary", "蝉知的简介");
	webtest.tapClick();
	webtest.tapType("蝉知的内容");
	
	Thread.sleep(3000);
	webtest.click("xpath=//input[@value='保存']");
	Thread.sleep(30000);
	
	}
}
