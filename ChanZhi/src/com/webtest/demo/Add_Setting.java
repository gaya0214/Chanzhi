package com.webtest.demo;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
/*作者：杨斯媛
 * 22.添加设置（内容-手册）*/
public class Add_Setting extends BaseTest{
	int n=0;
    @Test
    public void addset() throws Exception {
    	Back_Login.backLogin();
		Thread.sleep(1000);
		webtest.click("xpath=//a[contains(.,'内容')]");
		webtest.click("xpath=//a[contains(.,'手册')]");
		Thread.sleep(1000);
		webtest.click("xpath=//a[contains(@href,'/chanzhi/www/admin.php?m=book&f=setting')]");
		webtest.selectByIndex("xpath=//select[@id='index']",0);
		webtest.enterClick();
		if(n==0) {
			webtest.click("xpath=//input[contains(.,'是')]");
		}else if(n==1) {
			webtest.click("xpath=//input[contains(.,'否')]");
		}
		webtest.selectByIndex("xpath=//select[@id='chapter']", 0);
		webtest.click("id=submit");
    }
}
