package com.edu.test;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.testng.annotations.Test;

import com.edu.core.BaseTest;

/*
 * 作者：黄瑾然
 * */

public class Login extends BaseTest{
	CloseableHttpClient httpclient;
	CloseableHttpResponse response;

	//登录成功
	@Test
	public void TestLogin1() throws Exception {
		try {
    		httpclient=HttpClients.createDefault();
    		HttpPost httpPost=new HttpPost("http://study-perf.qa.netease.com/common/fgadmin/login");
    		httpPost.setHeader("Content-Type", "application/json");
    		StringEntity entity=new StringEntity("{\"phoneArea\":\"86\",\"phoneNumber\":\"20000000000\","+"\"password\":\"netease123\"}","utf-8");
    		httpPost.setEntity(entity);
    		response=httpclient.execute(httpPost);
    		HttpEntity httpEntity=response.getEntity();
    		System.out.println(EntityUtils.toString(httpEntity));
    		EntityUtils.consume(httpEntity);
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
	}
	
	//登录失败，phoneArea参数类型不正确
	@Test
	public void TestLogin2() throws Exception {
		try {
	    	httpclient=HttpClients.createDefault();
	    	HttpPost httpPost=new HttpPost("http://study-perf.qa.netease.com/common/fgadmin/login");
	    	httpPost.setHeader("Content-Type", "application/json");
	    	StringEntity entity=new StringEntity("{\"phoneArea\":86,\"phoneNumber\":\"20000000000\","+"\"password\":\"netease123\"}","utf-8");
    		httpPost.setEntity(entity);
	   		response=httpclient.execute(httpPost);
	   		HttpEntity httpEntity=response.getEntity();
	   		System.out.println(EntityUtils.toString(httpEntity));
	   		EntityUtils.consume(httpEntity);
	    }catch(Exception e) {
	    	e.printStackTrace();
    	}
	}
		
	//登录失败，phoneNumber参数类型不正确
	@Test
	public void TestLogin3() throws Exception {
		try {
	   		httpclient=HttpClients.createDefault();
	   		HttpPost httpPost=new HttpPost("http://study-perf.qa.netease.com/common/fgadmin/login");
	    	httpPost.setHeader("Content-Type", "application/json");
	    	StringEntity entity=new StringEntity("{\"phoneArea\":\"86\",\"phoneNumber\":\"20000000\","+"\"password\":\"netease123\"}","utf-8");
    		httpPost.setEntity(entity);
	   		response=httpclient.execute(httpPost);
	   		HttpEntity httpEntity=response.getEntity();
	   		System.out.println(EntityUtils.toString(httpEntity));
	   		EntityUtils.consume(httpEntity);
	    }catch(Exception e) {
	    	e.printStackTrace();
    	}
	}
		
	//登录失败，password参数类型不正确
	@Test
	public void TestLogin4() throws Exception {
		try {
    		httpclient=HttpClients.createDefault();
    		HttpPost httpPost=new HttpPost("http://study-perf.qa.netease.com/common/fgadmin/login");
    		httpPost.setHeader("Content-Type", "application/json");
    		StringEntity entity=new StringEntity("{\"phoneArea\":\"86\",\"phoneNumber\":\"20000000000\","+"\"password\":123456}","utf-8");
    		httpPost.setEntity(entity);
    		response=httpclient.execute(httpPost);
    		HttpEntity httpEntity=response.getEntity();
    		System.out.println(EntityUtils.toString(httpEntity));
        	EntityUtils.consume(httpEntity);		    
			}catch(Exception e) {
	    		e.printStackTrace();
	    	}
		}
			
	//登录失败，缺少phoneArea参数
	@Test
	public void TestLogin5() throws Exception {
		try {
	   		httpclient=HttpClients.createDefault();
	   		HttpPost httpPost=new HttpPost("http://study-perf.qa.netease.com/common/fgadmin/login");
	   		httpPost.setHeader("Content-Type", "application/json");
	   		StringEntity entity=new StringEntity("{\"phoneNumber\":\"20000000000\","+"\"password\":\"netease123\"}","utf-8");
	   		httpPost.setEntity(entity);
	   		response=httpclient.execute(httpPost);
	   		HttpEntity httpEntity=response.getEntity();
	   		System.out.println(EntityUtils.toString(httpEntity));
	   		EntityUtils.consume(httpEntity);
    	}catch(Exception e) {
    		e.printStackTrace();
		}
	}
			
	//登录失败，缺少phoneNumber参数
	@Test
	public void TestLogin6() throws Exception {
		try {
    		httpclient=HttpClients.createDefault();
    		HttpPost httpPost=new HttpPost("http://study-perf.qa.netease.com/common/fgadmin/login");
    		httpPost.setHeader("Content-Type", "application/json");
			StringEntity entity=new StringEntity("{\"phoneArea\":\"86\""+"\"password\":\"netease123\"}","utf-8");
			httpPost.setEntity(entity);
			response=httpclient.execute(httpPost);
			HttpEntity httpEntity=response.getEntity();
		    System.out.println(EntityUtils.toString(httpEntity));
			EntityUtils.consume(httpEntity);
		}catch(Exception e) {
			e.printStackTrace();
	    }
	}
				
	//登录失败，缺少password参数
	@Test
	public void TestLogin7() throws Exception {
		try {
	   		httpclient=HttpClients.createDefault();
	   		HttpPost httpPost=new HttpPost("http://study-perf.qa.netease.com/common/fgadmin/login");
	   		httpPost.setHeader("Content-Type", "application/json");
	   		StringEntity entity=new StringEntity("{\"phoneArea\":\"86\",\"phoneNumber\":\"20000000000\","+"}","utf-8");
	   		httpPost.setEntity(entity);
	   		response=httpclient.execute(httpPost);
	   		HttpEntity httpEntity=response.getEntity();
	   		System.out.println(EntityUtils.toString(httpEntity));
	   		EntityUtils.consume(httpEntity);
	   	}catch(Exception e) {
	   		e.printStackTrace();
	   	}
	}
				
	//登录失败，电话号码超过11位
	@Test
	public void TestLogin8() throws Exception {
		try {
	   		httpclient=HttpClients.createDefault();
	   		HttpPost httpPost=new HttpPost("http://study-perf.qa.netease.com/common/fgadmin/login");
	   		httpPost.setHeader("Content-Type", "application/json");
	   		StringEntity entity=new StringEntity("{\"phoneArea\":\"86\",\"phoneNumber\":\"123456789012\","+"\"password\":\"netease123\"}","utf-8");
	   		httpPost.setEntity(entity);
	   		response=httpclient.execute(httpPost);
	   		HttpEntity httpEntity=response.getEntity();
	   		System.out.println(EntityUtils.toString(httpEntity));
	   		EntityUtils.consume(httpEntity);
	  	}catch(Exception e) {
	   		e.printStackTrace();
	   	}
	}

    //登录失败，密码错误
	@Test
	public void TestLogin9() throws Exception {
    	try {
	   		httpclient=HttpClients.createDefault();
	   		HttpPost httpPost=new HttpPost("http://study-perf.qa.netease.com/common/fgadmin/login");
	   		httpPost.setHeader("Content-Type", "application/json");
	   		StringEntity entity=new StringEntity("{\"phoneArea\":\"86\",\"phoneNumber\":\"20000000000\","+"\"password\":\"wrong\"}","utf-8");
	   		httpPost.setEntity(entity);
	   		response=httpclient.execute(httpPost);
	   		HttpEntity httpEntity=response.getEntity();
	   		System.out.println(EntityUtils.toString(httpEntity));
	   		EntityUtils.consume(httpEntity);
	   	}catch(Exception e) {
	   		e.printStackTrace();
	   	}
	}
					
	//登录失败，用户不存在
	@Test
	public void TestLogin10() throws Exception {
		try {
	  		httpclient=HttpClients.createDefault();
	   		HttpPost httpPost=new HttpPost("http://study-perf.qa.netease.com/common/fgadmin/login");
	  		httpPost.setHeader("Content-Type", "application/json");
	  		StringEntity entity=new StringEntity("{\"phoneArea\":\"86\",\"phoneNumber\":\"10086\","+"\"password\":\"netease123\"}","utf-8");
	  		httpPost.setEntity(entity);
	  		response=httpclient.execute(httpPost);
	  		HttpEntity httpEntity=response.getEntity();
	  		System.out.println(EntityUtils.toString(httpEntity));
	  		EntityUtils.consume(httpEntity);
	  	}catch(Exception e) {
	  		e.printStackTrace();
	  	}
	}

}
