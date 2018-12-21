package com.edu.interfacetest;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.testng.annotations.Test;

import com.edu.core.BaseTest;

public class LoginTest extends BaseTest{
	CloseableHttpClient httpclient;
	CloseableHttpResponse response;

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
			
	//µÇÂ¼Ê§°Ü£¬È±ÉÙphoneArea²ÎÊý
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
			
	//µÇÂ¼Ê§°Ü£¬È±ÉÙphoneNumber²ÎÊý
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
				
	//µÇÂ¼Ê§°Ü£¬È±ÉÙpassword²ÎÊý
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
