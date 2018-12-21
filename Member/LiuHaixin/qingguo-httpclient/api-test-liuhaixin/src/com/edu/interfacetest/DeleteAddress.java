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

public class DeleteAddress extends BaseTest{
	CloseableHttpClient httpclient;
	CloseableHttpResponse response;

	@Test
	public void TestDelete1() throws Exception {
		try {
    		httpclient=HttpClients.createDefault();
    		HttpPost httpPost1=new HttpPost("http://study-perf.qa.netease.com/common/fgadmin/login");
    		httpPost1.setHeader("Content-Type", "application/json");
    		StringEntity entity1=new StringEntity("{\"phoneArea\":\"86\",\"phoneNumber\":\"20000000000\","+"\"password\":\"netease123\"}","utf-8");
    		httpPost1.setEntity(entity1);
    		response=httpclient.execute(httpPost1);
    		HttpEntity httpEntity1=response.getEntity();
    		HttpPost httpPost=new HttpPost("http://study-perf.qa.netease.com//fgadmin/address/delete");
    		httpPost.setHeader("Content-Type", "application/json");
    		StringEntity entity=new StringEntity("{\"id\":77243286}","utf-8");
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
	public void TestDelete2() throws Exception {
		try {
    		httpclient=HttpClients.createDefault();
    		HttpPost httpPost1=new HttpPost("http://study-perf.qa.netease.com/common/fgadmin/login");
    		httpPost1.setHeader("Content-Type", "application/json");
    		StringEntity entity1=new StringEntity("{\"phoneArea\":\"86\",\"phoneNumber\":\"20000000000\","+"\"password\":\"netease123\"}","utf-8");
    		httpPost1.setEntity(entity1);
    		response=httpclient.execute(httpPost1);
    		HttpEntity httpEntity1=response.getEntity();
    		HttpPost httpPost=new HttpPost("http://study-perf.qa.netease.com//fgadmin/address/delete");
    		httpPost.setHeader("Content-Type", "application/json");
    		StringEntity entity=new StringEntity("{\"id\":\"77243286\"}","utf-8");
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
		public void TestDelete3() throws Exception {
			try {
	    		httpclient=HttpClients.createDefault();
	    		HttpPost httpPost1=new HttpPost("http://study-perf.qa.netease.com/common/fgadmin/login");
	    		httpPost1.setHeader("Content-Type", "application/json");
	    		StringEntity entity1=new StringEntity("{\"phoneArea\":\"86\",\"phoneNumber\":\"20000000000\","+"\"password\":\"netease123\"}","utf-8");
	    		httpPost1.setEntity(entity1);
	    		response=httpclient.execute(httpPost1);
	    		HttpEntity httpEntity1=response.getEntity();
	    		HttpPost httpPost=new HttpPost("http://study-perf.qa.netease.com//fgadmin/address/delete");
	    		httpPost.setHeader("Content-Type", "application/json");
	    		StringEntity entity=new StringEntity("{}","utf-8") ;
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
