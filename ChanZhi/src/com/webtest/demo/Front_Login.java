package com.webtest.demo;

import org.testng.annotations.Test;
import com.webtest.core.*;
/*1.登录（前台）【注册、切换语言】*/
public class Front_Login extends BaseTest{
	@Test

	public void frontLogin()throws Exception{
		webtest.open("http://localhost:8032/chanzhi/www/index.php/user-login.html");
		webtest.type("id=account", "1138322644@qq.com");
		webtest.type("id=password", "123456");
		webtest.click("id=submit");
	}
}
