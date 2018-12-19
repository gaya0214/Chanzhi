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
 * 作者：刘海新
 * */

public class Scene1 extends HttpClient{
	
   	CloseableHttpClient httpclient=null;
	CloseableHttpResponse response;
	
  //获取所有商品的sku列表成功
  	@Test
  	public void TestSkuList1() throws Exception {
  		try {
  			httpclient=HttpClients.createDefault();
  			HttpGet httpGet=new HttpGet("http://study-perf.qa.netease.com/common/skuList");
  			response = httpclient.execute(httpGet);
  			System.out.println(response.getStatusLine());
  			httpGet.setHeader("Content-Type", "application/json");
  			HttpEntity entity=response.getEntity();
  			if(entity !=null) {
  				System.out.println(EntityUtils.toString(entity,"UTF-8"));
  			}
  			EntityUtils.consume(entity);
  		}catch(Exception e) {
  			e.printStackTrace();
  		}finally {
  			response.close();
  			httpclient.close();
  		}	
  	}

  	//获取goodsId=1的商品sku信息成功
  	@Test
  	public void TestSkuList2() throws Exception {
  		try {
  			httpclient=HttpClients.createDefault();
  			HttpGet httpGet=new HttpGet("http://study-perf.qa.netease.com/common/skuList?goodsId=1");
  			response = httpclient.execute(httpGet);
  			System.out.println(response.getStatusLine());
  			httpGet.setHeader("Content-Type", "application/json");
  			HttpEntity entity=response.getEntity();
  			if(entity !=null) {
  				System.out.println(EntityUtils.toString(entity,"UTF-8"));
  			}
  			EntityUtils.consume(entity);
  		}catch(Exception e) {
  			e.printStackTrace();
  		}finally {
  			response.close();
  			httpclient.close();
  		}	
  	}
    
    //获取goodsId=2的商品sku信息成功
  	@Test
  	public void TestSkuList3() throws Exception {
  		try {
  			httpclient=HttpClients.createDefault();
  			HttpGet httpGet=new HttpGet("http://study-perf.qa.netease.com/common/skuList?goodsId=2");
  			response = httpclient.execute(httpGet);
  			System.out.println(response.getStatusLine());
  			httpGet.setHeader("Content-Type", "application/json");
  			HttpEntity entity=response.getEntity();
  			if(entity !=null) {
  				System.out.println(EntityUtils.toString(entity,"UTF-8"));
  			}
  			EntityUtils.consume(entity);
  		}catch(Exception e) {
  			e.printStackTrace();
  		}finally {
  			response.close();
  			httpclient.close();
  		}	
  	}

  	//获取goodsId=3的商品sku信息成功
  	@Test
  	public void TestSkuList4() throws Exception {
  		try {
  			httpclient=HttpClients.createDefault();
  			HttpGet httpGet=new HttpGet("http://study-perf.qa.netease.com/common/skuList?goodsId=3");
  			response = httpclient.execute(httpGet);
  			System.out.println(response.getStatusLine());
  			httpGet.setHeader("Content-Type", "application/json");
  			HttpEntity entity=response.getEntity();
  			if(entity !=null) {
  				System.out.println(EntityUtils.toString(entity,"UTF-8"));
  			}
  			EntityUtils.consume(entity);
  		}catch(Exception e) {
  			e.printStackTrace();
  		}finally {
  			response.close();
  			httpclient.close();
  		}	
  	}
    
}
