package com.edu.interfacetest;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.testng.annotations.Test;

import com.edu.core.HttpClient;

public class HttpclientTestDemo1 extends HttpClient{
	
   	CloseableHttpClient httpclient=null;
	CloseableHttpResponse response;
	
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
