package com.edu.test;

import java.io.IOException;

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

public class GetAddress extends BaseTest{
	CloseableHttpClient httpclient=null;
	String address;
	
	//查询收货地址成功
	@Test
    public void getAddress1() throws IOException{
    	CloseableHttpResponse response=null;
    	
    	try {
    		httpclient=HttpClients.createDefault();
    		HttpPost httpPost=new HttpPost("http://study-perf.qa.netease.com/common/fgadmin/login");
    		httpPost.setHeader("Content-Type", "application/json");
    		StringEntity entity1=new StringEntity("{\"phoneArea\":\"86\",\"phoneNumber\":\"20000000000\","+"\"password\":\"netease123\"}","utf-8");
    		httpPost.setEntity(entity1);
    		response=httpclient.execute(httpPost);
    		HttpEntity httpEntity=response.getEntity();
    		
    		HttpGet httpGet=new HttpGet("http://study-perf.qa.netease.com/fgadmin/address/list");
    		httpGet.setHeader("Content-Type", "application/json");
    		response=httpclient.execute(httpGet);
    		HttpEntity entity=response.getEntity();
    		if(entity !=null) {
    			address = EntityUtils.toString(entity, "utf-8");
    			System.out.println(address);
    		}
    		EntityUtils.consume(entity);
    		response.close();
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
    }
	

}
