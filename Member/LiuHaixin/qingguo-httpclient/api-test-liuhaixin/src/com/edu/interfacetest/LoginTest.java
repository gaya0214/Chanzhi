package com.edu.interfacetest;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.edu.core.BaseTest;
import com.edu.core.HttpDriver;

import net.sf.json.JSONObject;

public class LoginTest extends BaseTest{
	String url="http://study-perf.qa.netease.com/common/fgadmin/login";
	String result=null;
    public String login(String phoneArea,String phoneNumber,String password) {
    	JSONObject para=new JSONObject();
    	para.element("phoneArea",phoneArea);
    	para.element("phoneNumber", phoneNumber);
    	para.element("password", password);
    	result=HttpDriver.doPost(url, para);
    	System.out.println(result);
		return result;  
    }
    @Test(priority =0)
	public void loginSuccess() throws Exception {
		result = this.login("86","20000000000","netease123");
		assertEquals("message","success");
    }    
    @Test(priority =1)
	public void loginfail() throws Exception {
		result = this.login("86","20000000000","net123");
		assertEquals("message","success");
    }     
}
