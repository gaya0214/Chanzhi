package com.webtest.httpclient_demo;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

/*
 * 作者：刘海新
 * */

public class SkuList extends BaseTest{
	CloseableHttpClient httpclient;
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

	//获取goodsId=2147483648的商品sku信息失败(超过int最大取值范围)
	@Test
	public void TestSkuList3() throws Exception {
		try {
			httpclient=HttpClients.createDefault();
			HttpGet httpGet=new HttpGet("http://study-perf.qa.netease.com/common/skuList?goodsId=2147483648");
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

	//获取goodsId不存在的商品失败
	@Test
	public void TestSkuList4() throws Exception {
		try {
			httpclient=HttpClients.createDefault();
			HttpGet httpGet=new HttpGet("http://study-perf.qa.netease.com/common/skuList?goodsId=9999");
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
	
	//goodsId类型不正确
	@Test
	public void TestSkuList5() throws Exception {
		try {
			httpclient=HttpClients.createDefault();
			HttpGet httpGet=new HttpGet("http://study-perf.qa.netease.com/common/skuList?goodsId='1'");
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

