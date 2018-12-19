package com.webtest.demo;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import com.webtest.core.*;
import com.webtest.demo.*;
/*作者：刘琪
 * 5.发布博客*/
public class Publish_Blog extends BaseTest{
	@Test
	public void publishBlog() throws Exception{
		Back_Login.backLogin();
		webtest.click("xpath=//a[contains(.,'博客')]");
		webtest.click("xpath=//a[contains(.,'发布博客')]");
		webtest.click("xpath=//input[@class='default']");
		webtest.enterClick();
		webtest.type("id=author", "张三");
		webtest.click("classname=btn dropdown-toggle");
		webtest.enterClick();
		webtest.type("id=title", "蝉知的博客");
		webtest.type("id=alias", "chanzhi");
		webtest.type("id=keywords", "蝉知");
		
		webtest.tapClick();
		webtest.tapType("蝉知的摘要");
		
		webtest.tapClick();
		webtest.tapType("蝉知的内容");
		
		Thread.sleep(3000);
		webtest.click("id=submit");
		Thread.sleep(30000);
	}
}
