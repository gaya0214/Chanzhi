package com.webtest.demo1204;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class huiyuanjifenjiangli extends BaseTest{
	@Test
	//会员积分奖励(会员-操作-积分)
	public void jifenjiangli() throws Exception {
		webtest.open("http://localhost:8032/chanzhi/www/admin.php");
		Thread.sleep(1000);
		webtest.type("name=account","admin");
		webtest.type("name=password", "admin");
		webtest.click("xpath=//input[@type='submit']");
		Thread.sleep(1000);
		
		
		webtest.click("xpath=/html/body/nav[1]/ul[1]/li[4]/a");
		webtest.click("xpath=/html/body/div[1]/div/form/table/tbody/tr[1]/td[13]/span/a");
		
		webtest.click("xpath=/html/body/div[1]/div/form/table/tbody/tr[1]/td[13]/span/ul/li[1]/a");
		
		webtest.type("id=count", "100");
		Thread.sleep(1000);
		webtest.type("name=note", "奖励");
		Thread.sleep(1000);
		webtest.tapClick();
		webtest.Enterclick();
		Thread.sleep(1000);
	}
}