package com.edu.interfacetest;

import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.testng.Assert;

import net.sf.json.JSONObject;

public class Sumit {
	private static final Object jsonPost = null;
	private Object address;

	public void sumit() throws IOException{
		JSONObject json=JSONObject.fromObject(this.address);
		JSONObject result=json.getJSONObject("result").getJSONArray("list").getJSONObject(0);
		String  receiverName=result.getString("receiverName");
		String  cellPhone =result.getString("cellPhone");
		String  addressDetail=result.getString("addressDetail");
		String  province=result.getString("province");
		String  city=result.getString("city");
		String  area=result.getString("area");
		double Fee=this.getTransport();
		JSONObject jsonPost=new JSONObject();
		jsonPost.element("skuIds","2");
		jsonPost.element("skuNumbers","1");
		jsonPost.element("stockIds","74966312");
		jsonPost.element("receiverName",receiverName);
		jsonPost.element("cellPhone",cellPhone);
		jsonPost.element("addressDetail",addressDetail);
		jsonPost.element("province",province);
		jsonPost.element("city",city);
		jsonPost.element("area",area);
		jsonPost.element("vioceStatus",0);
		jsonPost.element("needInvioce",0);
		jsonPost.element("invoiceHead",0);
		jsonPost.element("transportFee",Fee);
		jsonPost.element("logisticsCompanyId",1);
		jsonPost.element("accessSources","noSource");
		jsonPost.element("accessDevices",0);
		
		
		}

	private double getTransport() {
		CloseableHttpClient httpClient = null;
		CloseableHttpResponse response =null;
		HttpPost httpPost = new HttpPost();
		try {
			httpClient = HttpClients.createDefault();
			HttpGet httpGet=new HttpGet("http://study-perf.qa.netease.com/fgadmin/address/list");
			httpGet.setHeader("Content-Type","application/json");
		    StringEntity entity =new StringEntity(jsonPost.toString(),"UTF-8");
		    httpPost.setEntity(entity);
		    httpPost.setHeader("csrfToken","csrfToken");
		    response=httpClient.execute(httpPost);
		    HttpEntity httpEntity=response.getEntity();
		    String submitResult=EntityUtils.toString(httpEntity);
		    System.out.println(submitResult);
		    JSONObject jsonResult=JSONObject.fromObject(submitResult);
		    Assert.assertEquals(jsonResult.getInt("code"),200);
		    EntityUtils.consume(httpEntity);
		    response.close();
		    
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
				
		
		return 0;
	}

	
		

}
