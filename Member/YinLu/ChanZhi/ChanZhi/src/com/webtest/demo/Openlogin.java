package com.webtest.demo;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class Openlogin extends BaseTest{
// 开放登录
	@Test
	public void openlogin() throws Exception {
//		Admin_Login_Cz.adminlogin();		
		webtest.click("xpath=//a[contains(.,'站点')]");
		webtest.click("xpath=//a[contains(.,'语言设置')]");
		webtest.click("xpath=//a[contains(.,'接口')]");
		webtest.click("xpath=//a[contains(.,'语言设置')]");

		
		webtest.type("xpath=//input[@name='verification']", "123");
		Thread.sleep(1000);			
		webtest.tapClick();	//����֤
		webtest.tapClick();
		webtest.tapType("123");
		Thread.sleep(1000);		
		webtest.tapClick();
		webtest.tapType("123");
		Thread.sleep(1000);	
		webtest.tapClick();
		webtest.tapType("123");
		Thread.sleep(2000);			

		webtest.tapClick();
		webtest.keysEnter();
		//�������
		Thread.sleep(3000);	
		
		
		webtest.tapClick();//ʹ�ð���
		webtest.tapClick();
		webtest.tapType("123");
		Thread.sleep(2000);			
		webtest.tapClick();
		webtest.tapType("123");
		Thread.sleep(2000);			

		webtest.tapClick();
		//�������
		webtest.keysEnter();
		Thread.sleep(3000);			

		
		webtest.tapClick();//ʹ�ð���
		webtest.tapClick();
		webtest.tapType("123");
		Thread.sleep(2000);			
		webtest.tapClick();
		webtest.tapType("123");
		Thread.sleep(2000);			

		webtest.tapClick();
		//�������
		webtest.keysEnter();
		Thread.sleep(3000);			
			
		webtest.alertAccept();
		Thread.sleep(3000);			
//-------------------------------------------
//
//		webtest.tapClick();//ʹ�ð���
//		webtest.tapClick();
//		webtest.tapType("123");
//		Thread.sleep(1000);			
//		webtest.tapClick();
//		webtest.tapType("123");
//		Thread.sleep(1000);			
//
//		webtest.tapClick();
//		//�������
//		webtest.keysEnter();
//		Thread.sleep(3000);			


	}
	
}
