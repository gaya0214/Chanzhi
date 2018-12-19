package com.webtest.demo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.webtest.core.BaseTest;
import com.webtest.dataprovider.NSDataProvider;

public class Admin_Login_Cz extends BaseTest{
	

	@Test(dataProvider="excel",dataProviderClass=NSDataProvider.class)
	public static void adminlogin(String u_name,String u_pwd) {
		webtest.open("http://localhost:8033/chanzhi/www/admin.php");
		webtest.type("name=account", u_name);
		webtest.type("name=password", u_pwd);
		webtest.click("xpath=//input[@value='登录']");
	}
}
//webtest.open("http://localhost:8033/chanzhi/www/admin.php");
//webtest.type("name=account", "yinlu");
//webtest.type("name=password", "123456");
//webtest.click("xpath=//input[@value='登录']");
