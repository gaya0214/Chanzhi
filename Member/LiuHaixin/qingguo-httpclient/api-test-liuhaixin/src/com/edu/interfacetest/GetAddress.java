package com.edu.interfacetest;

import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class GetAddress {
	public void getAddress() throws IOException{
		CloseableHttpClient httpClient = null;
		CloseableHttpResponse response =null;
		try {
			httpClient = HttpClients.createDefault();
			HttpGet httpGet=new HttpGet("http://study-perf.qa.netease.com/fgadmin/address/list");
			httpGet.setHeader("Content-Type","application/json");
			response=httpClient.execute(httpGet);
			HttpEntity entity=response.getEntity();
			if(entity!=null) {
				String address=EntityUtils.toString(entity,"UTF-8");
				System.out.println(address);
				
			}
				EntityUtils.consume(entity);
				response.close();
				
		}catch(Exception e) {
			e.printStackTrace();
		}
	}


}
