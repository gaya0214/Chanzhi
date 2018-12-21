package com.webtest.demo;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class AddOpenLogin extends BaseTest{
	@Test
	public void addOpenLogin() throws Exception {
		
		//添加开放登陆
		webtest.click("xpath=/html/body/nav[1]/ul[1]/li[8]/a");
		webtest.click("xpath=/html/body/nav[2]/div[2]/ul[1]/li[4]/a");
		//新浪微博
		webtest.type("id=verification","www.sina.com.cn");//网页验证
		webtest.tapClick();//App key
		webtest.tapType("111111");
		webtest.tapClick();//App secret
		webtest.tapType("11111");
		webtest.tapClick();//网页组件
		webtest.tapType("11111");
		webtest.tapClick();//保存
		webtest.Enterclick();
		//QQ
		webtest.click("xpath=//th[contains(.,'APP ID')]");
		webtest.tapClick();//App id
		webtest.tapType("11111");
		webtest.tapClick();//App key
		webtest.tapType("11111");
		webtest.tapClick();//保存
		webtest.Enterclick();
//		//Github
//		webtest.click("xpath=//th[contains(.,'Client ID')]");
//		webtest.tapClick();//Client id
//		webtest.tapType("11111");
//		webtest.tapClick();//Client Secret
//		webtest.tapType("11111");
//		webtest.tapClick();//保存
//		webtest.Enterclick();
//		Thread.sleep(1000);
//		webtest.goBack();
//		//Facebook
//		webtest.click("xpath=//th[contains(.,'API ID')]");
//		webtest.tapClick();//API id
//		webtest.tapType("11111");
//		webtest.tapClick();//API Secret
//		webtest.tapType("11111");
//		webtest.tapClick();//保存
//		webtest.Enterclick();
//		Thread.sleep(1000);
//		webtest.goBack();
		
	}
}
