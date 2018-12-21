package com.webtest.demo;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class AddProduct extends BaseTest{
	@Test
	//添加产品
	public void addproduct() throws Exception{
		webtest.click("xpath=/html/body/nav[1]/ul[1]/li[3]/a");
		webtest.click("xpath=/html/body/nav[2]/div[2]/ul[1]/li[2]/a");
		webtest.click("xpath=//a[contains(.,' 添加产品')]");
		Thread.sleep(1000);
		webtest.click("class=chosen-choices");
		webtest.click("xpath=/html/body/div[1]/div[2]/div/div[2]/form/table/tbody/tr[1]/td[1]/div[2]/div/ul/li[1]");
		webtest.type("id=name","苹果");
		webtest.type("id=titleColor","ffffffff");
		webtest.type("id=order","1");
		webtest.type("id=alias","apple");
		webtest.type("id=mall","http://localhost:8032/chanzhi/www/product/id_111111.html");
		webtest.type("id=keywords","admin");
		webtest.tapClick();
		webtest.tapType("简介");
		webtest.click("xpath=//th[contains(.,'详情')]");
		webtest.tapClick();
		webtest.tapType("详情");
		webtest.type("id=brand","红富士");
		webtest.type("id=model","日本红富士2018");
		webtest.type("id=color","红色");
		webtest.type("id=amount","1111");
		webtest.type("id=origin","日本");
		webtest.type("id=unit","日本");
		webtest.type("id=price","11");
		webtest.type("id=promotion","10");
		webtest.type("xpath=//input[@id='label[0]']","111");
		webtest.type("xpath=//input[@id='value[0]']","111");
		webtest.tapClick();
		//webtest.click(null);
		webtest.Enterclick();
		Thread.sleep(2000);
	}
}
