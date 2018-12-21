package com.webtest.demo;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class FriendshipLink extends BaseTest{
	@Test
	//设置友情链接
	public static void friendshipLink() throws Exception{
		webtest.open("http://localhost:8032/chanzhi/www/admin.php");
		Thread.sleep(1000);
		webtest.type("name=account","admin");
		webtest.type("name=password", "admin");
		webtest.click("xpath=//input[@type='submit']");
		Thread.sleep(1000);
		
		webtest.click("xpath=/html/body/nav[1]/ul[1]/li[5]/a");
		webtest.click("xpath=/html/body/nav[2]/div[2]/ul[1]/li[3]/a");
		webtest.click("xpath=//th[contains(.,'首页链接')]");
		webtest.tapClick();
		
		//webtest.allSelect();
		Thread.sleep(1000);
		//webtest.clearthis();
		webtest.tapType("www.qqqqqqqqqqqqqqqqqqqq.com");
		
		webtest.click("id=submit");
	}
}
