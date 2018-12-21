package com.webtest.demo;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class kaifangdenglu extends BaseTest{
	@Test
	public void boketest() throws Exception{
		webtest.open("http://localhost:8032/chanzhi/www/admin.php");
		Thread.sleep(1000);
		webtest.type("name=account","wangderun");
		webtest.type("name=password", "123456");
		Thread.sleep(1000);
		webtest.click("xpath=//input[@type='submit']");
		Thread.sleep(1000);
		webtest.click("xpath=//a[contains('首页')]");
		webtest.click("xpath=/html/body/nav[1]/ul[1]/li[8]/a");//点击设置
		webtest.click("xpath=/html/body/nav[2]/div[2]/ul[1]/li[4]/a");//点击接口
		webtest.type("name=verification", "www.weibo.com");//微博
		Thread.sleep(1000);
		webtest.type("name=clientID", "727075670");
		Thread.sleep(1000);
		webtest.type("name=clientSecret", "65482wsx");
		Thread.sleep(1000);
		webtest.type("name=widget", "网页组件");
		Thread.sleep(3000);
		webtest.click("id=submit");
		Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[1]/div[2]/div/div[2]/div/div[2]/form/table/tbody/tr[1]/th");//QQ
		webtest.tapClick();
		webtest.tapType("727075670");
		Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[1]/div[2]/div/div[2]/div/div[2]/form/table/tbody/tr[2]/th");
		webtest.tapClick();
		webtest.tapType("65482wsx0.0");
		Thread.sleep(1000);
		webtest.tapClick();//保存还未解决
		webtest.enterclick();
		Thread.sleep(1000);
		/*webtest.click("xpath=/html/body/div[1]/div[2]/div/div[3]/div/div[2]/form/table/tbody/tr[1]/th");//GitHub
		webtest.tapClick();
		webtest.tapType("wangderun12345");
		Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[1]/div[2]/div/div[3]/div/div[2]/form/table/tbody/tr[2]/th");
		webtest.tapClick();
		webtest.tapType("65482wsx");
		Thread.sleep(1000);
		webtest.tapClick();//待解决
		webtest.enterclick();
		Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[1]/div[2]/div/div[4]/div/div[2]/form/table/tbody/tr[1]/th");//Facebook
		webtest.tapClick();
		webtest.tapType("727075670");
		Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[1]/div[2]/div/div[4]/div/div[2]/form/table/tbody/tr[2]/th");
		webtest.tapClick();
		webtest.tapType("65482wsx");
		Thread.sleep(1000);
		webtest.tapClick();//未解决
		webtest.enterclick();
		Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[1]/div[2]/div/div[5]/div/div[2]/form/table/tbody/tr[1]/th");//微信
		webtest.tapClick();
		webtest.tapType("15226509055");
		Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[1]/div[2]/div/div[5]/div/div[2]/form/table/tbody/tr[2]/th");
		webtest.tapClick();
		webtest.tapType("65482wsx");
		Thread.sleep(1000);
		webtest.click("id=autoLogin1");
		Thread.sleep(1000);
		webtest.tapClick();
		webtest.enterclick();*/
		
		
		
		
		
		
	}
}
