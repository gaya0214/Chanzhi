package com.webtest.demo;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.demo.Admin_Login_Cz;

public class Product extends BaseTest{
	//添加产品
	@Test
	public void product() throws Exception {
//		Admin_Login_Cz.adminlogin();		
		webtest.click("xpath=//a[contains(.,'商城')]");
		webtest.click("xpath=//a[contains(.,'产品')]");
		webtest.click("xpath=//i[@class='icon-plus']");
		webtest.click("xpath=//ul[@class='chosen-choices']");	
		webtest.keysEnter();
		webtest.type("xpath=//input[@name='name']", "学习手册");
		webtest.type("xpath=//input[@name='titleColor']", "#000000");
		webtest.typeAndClear("xpath=//input[@name='order']", "1");

		webtest.type("xpath=//input[@name='alias']", "1");
		webtest.type("xpath=//input[@name='mall']", "http://www.taobao.com");
		webtest.type("xpath=//input[@name='keywords']","学习手册");
		
		webtest.tapClick();
		webtest.tapType("产品简介");		
		webtest.type("xpath=//html[@spellcheck='false']", "产品详情");
		
		webtest.click("xpath=//th[contains(.,'详情')]");
		webtest.tapClick();
		webtest.tapType("产品详情");
		webtest.click("xpath=//th[contains(.,'产品属性')]");
		webtest.type("xpath=//input[@name='brand']", "品牌");
		webtest.type("xpath=//input[@name='model']", "型号");
		webtest.type("xpath=//input[@name='color']", "颜色");
		webtest.type("xpath=//input[@name='amount']", "100");
		webtest.type("xpath=//input[@name='origin']", "产地");
		webtest.type("xpath=//input[@name='unit']", "单位");
		webtest.type("xpath=//input[@name='price']", "价格");
		webtest.type("xpath=//input[@name='promotion']", "特价");
		webtest.type("xpath=//input[@name='label[0]']", "价格");
		webtest.type("xpath=//input[@name='value[0]']", "100");
		webtest.tapClick();
		webtest.keysEnter();
//		webtest.click("xpath=//th[contains(.,'自定义属性')]");
//		webtest.click("xpath=//input[@type='submit']");
		Thread.sleep(8000);				
	}
}
