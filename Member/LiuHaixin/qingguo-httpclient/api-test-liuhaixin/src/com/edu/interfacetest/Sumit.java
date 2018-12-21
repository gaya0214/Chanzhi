package com.edu.interfacetest;
import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.util.EntityUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.edu.core.BaseTest;

import net.sf.json.JSONObject;

public class Sumit extends BaseTest{
	CloseableHttpClient httpclient=null;
	double transportFee;
	String address;
	
	@Test
    public void submitOrder() throws IOException{
    	JSONObject json= JSONObject.fromObject(this.address);
    	JSONObject result=json.getJSONObject("result").getJSONArray("list").getJSONObject(0);
    	String receiverName=result.getString("receiverName");
    	String cellPhone=result.getString("cellPhone");
    	String addressDetail=result.getString("addressDetail");
    	String province=result.getString("province");
    	String city=result.getString("city");
    	String area=result.getString("area");
    	double Fee=this.transportFee;
    	JSONObject jsonPost=new JSONObject();
    	jsonPost.element("skuIds", "2");
    	jsonPost.element("skuNumbers", "1");
    	jsonPost.element("stockIds", "74966312");
    	jsonPost.element("receiverName", receiverName);
    	jsonPost.element("cellPhone", cellPhone);
    	jsonPost.element("addressDetail", addressDetail);
    	jsonPost.element("province", province);
    	jsonPost.element("city", city);
    	jsonPost.element("area", area);
    	jsonPost.element("voiceStatus", 0);
    	jsonPost.element("needInvoice", 0);
    	jsonPost.element("invoiceHead", "");
    	jsonPost.element("transportFee", Fee);
    	jsonPost.element("logisticsCompanyId", 1);
    	jsonPost.element("accessSource", "noSource");
    	jsonPost.element("accessDevice", 0);
    	CloseableHttpResponse response=null;
    	try {
    		HttpPost httpPost=new HttpPost("http://study-perf.qa.netease.com/common/fgadmin/orders/submit");
    		httpPost.setHeader("Content-Type", "application/json");
    		StringEntity entity=new StringEntity(jsonPost.toString(),"utf-8");
    		httpPost.setEntity(entity);
    		httpPost.setHeader("carfToken", "carfToken");
    		response=httpclient.execute(httpPost);
    		HttpEntity httpEntity=response.getEntity();
    		String submitResult=EntityUtils.toString(httpEntity);
    		System.out.println(submitResult);
    		JSONObject jsonResult=JSONObject.fromObject(submitResult);
    		Assert.assertEquals(jsonResult.getInt("code"), 200);
    		EntityUtils.consume(httpEntity);
    		response.close();
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
    }
	
}
