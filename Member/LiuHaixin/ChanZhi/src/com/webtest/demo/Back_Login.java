package com.webtest.demo;



import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class Back_Login extends BaseTest{
	@Test
	public static void backLogin()throws Exception{
		webtest.open("http://127.0.0.1:8686/admin.php/");
		webtest.type("name=account","admin");
		webtest.type("name=password","123456");
		webtest.click("id=submit");
	}

}
