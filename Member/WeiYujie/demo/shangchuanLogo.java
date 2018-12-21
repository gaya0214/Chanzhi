package com.webtest.demo1204;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class shangchuanLogo extends BaseTest{
	@Test
	//上传logo（设计-组件-上传logo）
	public void jifenjiangli() throws Exception {
		webtest.open("http://localhost:8032/chanzhi/www/admin.php");
		Thread.sleep(1000);
		webtest.type("name=account","admin");
		webtest.type("name=password", "admin");
		webtest.click("xpath=//input[@type='submit']");
		Thread.sleep(1000);
		
		
		webtest.click("xpath=/html/body/nav[1]/ul[1]/li[6]/a");
		webtest.click("xpath=/html/body/nav[1]/ul[1]/li[6]/ul/li[4]/a");
		//点击图片
		webtest.type("xpath=/html/body/div[1]/div[2]/div/div[2]/form/div[1]/div/div[1]","C:\\Users\\wyj\\Desktop\\ChanZhi\\src\\logo.jpg");
		
		Thread.sleep(1000);
		
	}
}