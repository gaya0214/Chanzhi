package com.edu.interfacetest;

import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import net.sf.json.JSONObject;

public class GetTransportFee {
	private Object address;
	public void getTransportFee() throws IOException{
		JSONObject json=JSONObject.fromObject(this.address);
		JSONObject result=json.getJSONObject("result").getJSONArray("list").getJSONObject(0);
	    String addressDetail=result.getString("province")+"-"+result.get("city")+"-"+result.get("area");
	    int id =result.getInt("id");
	    String url=String.format("https://study-perf.qa.netease.com/common/getTransportFee?id=%d&addressDetail-%s",id,addressDetail);
	    CloseableHttpClient httpClient = null;
		CloseableHttpResponse response =null;
		try {
			httpClient = HttpClients.createDefault();
	    	HttpGet httpGet=new HttpGet(url);
	    	response=httpClient.execute(httpGet);
	    	httpGet.setHeader("Content-Type","application/json");
	    	HttpEntity entity=response.getEntity();
	    	if(entity!=null) {
	    		String feeResult=EntityUtils.toString(entity,"UTF-8");
	    		JSONObject.fromObject(feeResult).getDouble("result");
	    		
	    	}
	    	EntityUtils.consume(entity);
	    	response.close();
	    }catch(Exception e) {
	    	e.printStackTrace();
	    }
	 }
	
	
	

}
