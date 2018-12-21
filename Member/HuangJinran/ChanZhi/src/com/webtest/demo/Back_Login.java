package com.webtest.demo;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class Back_Login extends BaseTest{
    @Test
    public static void backLogin() {
    	webtest.open("http://localhost:8032/chanzhi/www/admin.php/");
    	webtest.type("id=account","admin");
    	webtest.type("id=password","123456");
    	webtest.click("id=submit");
    }
}
