package com.webtest.httpclient_demo;

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
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.core.HttpClient;

import net.sf.json.JSONObject;

/*
 * 作者：黄瑾然
 * */

public class Scene2 extends HttpClient{
	
	String address;
	double transportFee;
   	CloseableHttpClient httpclient=null;
	
   	//登录
   	@Test
    public void login() throws IOException{
    	CloseableHttpResponse response=null;
    	try {
    		httpclient=HttpClients.createDefault();
    		HttpPost httpPost=new HttpPost("http://study-perf.qa.netease.com/common/fgadmin/login");
    		httpPost.setHeader("Content-Type", "application/json");
    		StringEntity entity=new StringEntity("{\"phoneArea\":86,\"phoneNumber\":\"20000000000\","+"\"password\":\"netease123\"}","utf-8");
    		httpPost.setEntity(entity);
    		response=httpclient.execute(httpPost);
    		HttpEntity httpEntity=response.getEntity();
    		System.out.println("执行结果是："+EntityUtils.toString(httpEntity));
    		EntityUtils.consume(httpEntity);
    		response.close();
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
    }
   	
/*   	//添加收货地址
	@Test
   	public void addAddress() throws IOException{
   		CloseableHttpResponse response=null;
    	try {
    		HttpPost httpPost=new HttpPost("http://study-perf.qa.netease.com/common/fgadmin/address/new");
    		httpPost.setHeader("Content-Type", "application/json");
    		StringEntity entity=new StringEntity("{\"receiverName\":\"张三\",\"cellPhone\":\"12345678901\","+"\"addressDetail\":\"浙江大学\",\"province\":\"浙江省\",\"city\":\"杭州市\",\"area\":\"滨江区\"}","utf-8");
    		httpPost.setEntity(entity);
    		response=httpclient.execute(httpPost);
    		HttpEntity httpEntity=response.getEntity();
    		System.out.println("执行结果是："+EntityUtils.toString(httpEntity));
    		EntityUtils.consume(httpEntity);
    		response.close();
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
   	}
 */
   	
	//查询收货地址
   	@Test(dependsOnMethods = { "login" })
    public void getAddress() throws IOException{
    	CloseableHttpResponse response=null;
    	
    	try {
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
    
   	//计算运费
   	@Test(dependsOnMethods = { "getAddress" })
    public void getTransportFee() throws IOException{
    	JSONObject json= JSONObject.fromObject(this.address);
    	JSONObject result=json.getJSONObject("result").getJSONArray("list").getJSONObject(0);
    	String addressDetail=result.get("province")+"_"+result.get("city")+"_"+result.get("area");
    	int id=result.getInt("id");
    	String url=String.format("http://study-perf.qa.netease.com/common/getTransportFee?id=%d&addressDetail=%s", id,addressDetail);
    	CloseableHttpResponse response=null;
    	try {
    		HttpGet httpGet=new HttpGet(url);
    		response=httpclient.execute(httpGet);
    		httpGet.setHeader("Content-Type", "application/json");
    		HttpEntity entity=response.getEntity();
    		if(entity !=null) {
    			String feeResult=EntityUtils.toString(entity,"utf-8");
    			this.transportFee=JSONObject.fromObject(feeResult).getDouble("result");
    		}
    		EntityUtils.consume(entity);
    		response.close();
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
    }
    
   	//提交订单
   	@Test(dependsOnMethods = { "getTransportFee" })
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
