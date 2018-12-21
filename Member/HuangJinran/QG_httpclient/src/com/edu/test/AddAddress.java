package com.edu.test;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
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

public class AddAddress extends BaseTest{
	CloseableHttpClient httpclient;
	CloseableHttpResponse response;

	//添加收货地址成功
	@Test
	public void TestAdd1() throws Exception {
		try {
			httpclient=HttpClients.createDefault();
    		HttpPost httpPost1=new HttpPost("http://study-perf.qa.netease.com/common/fgadmin/login");
    		httpPost1.setHeader("Content-Type", "application/json");
    		StringEntity entity1=new StringEntity("{\"phoneArea\":\"86\",\"phoneNumber\":\"20000000000\","+"\"password\":\"netease123\"}","utf-8");
    		httpPost1.setEntity(entity1);
    		response=httpclient.execute(httpPost1);
    		HttpEntity httpEntity1=response.getEntity();
			
    		//httpclient=HttpClients.createDefault();
    		HttpPost httpPost=new HttpPost("http://study-perf.qa.netease.com//fgadmin/address/new");
    		httpPost.setHeader("Content-Type", "application/json");
    		StringEntity entity=new StringEntity("{\"receiverName\":\"张三\",\"cellPhone\":\"12345678901\","+"\"addressDetail\":\"浙江大学\",\"province\":\"浙江省\",\"city\":\"杭州市\",\"area\":\"滨江区\"}","utf-8");
    		httpPost.setEntity(entity);
    		response=httpclient.execute(httpPost);
    		HttpEntity httpEntity=response.getEntity();
    		System.out.println(EntityUtils.toString(httpEntity));
    		EntityUtils.consume(httpEntity);
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
	}
	
	//添加收货地址失败，receiveName参数类型不正确
	@Test
	public void TestAdd2() throws Exception {
		try {
	   		httpclient=HttpClients.createDefault();
	   		HttpPost httpPost1=new HttpPost("http://study-perf.qa.netease.com/common/fgadmin/login");
    		httpPost1.setHeader("Content-Type", "application/json");
    		StringEntity entity1=new StringEntity("{\"phoneArea\":\"86\",\"phoneNumber\":\"20000000000\","+"\"password\":\"netease123\"}","utf-8");
    		httpPost1.setEntity(entity1);
    		response=httpclient.execute(httpPost1);
    		HttpEntity httpEntity1=response.getEntity();
	   		HttpPost httpPost=new HttpPost("http://study-perf.qa.netease.com//fgadmin/address/new");
	   		httpPost.setHeader("Content-Type", "application/json");
	   		StringEntity entity=new StringEntity("{\"receiverName\":123,\"cellPhone\":\"12345678901\","+"\"addressDetail\":\"浙江大学\",\"province\":\"浙江省\",\"city\":\"杭州市\",\"area\":\"滨江区\"}","utf-8");
	   		httpPost.setEntity(entity);
	   		response=httpclient.execute(httpPost);
	   		HttpEntity httpEntity=response.getEntity();
	   		System.out.println(EntityUtils.toString(httpEntity));
	   		EntityUtils.consume(httpEntity);
	   	}catch(Exception e) {
	   		e.printStackTrace();
	   	}
	}
	
	//添加收货地址失败，cellPhone参数类型不正确
	@Test
	public void TestAdd3() throws Exception {
		try {
    		httpclient=HttpClients.createDefault();
    		HttpPost httpPost1=new HttpPost("http://study-perf.qa.netease.com/common/fgadmin/login");
    		httpPost1.setHeader("Content-Type", "application/json");
    		StringEntity entity1=new StringEntity("{\"phoneArea\":\"86\",\"phoneNumber\":\"20000000000\","+"\"password\":\"netease123\"}","utf-8");
    		httpPost1.setEntity(entity1);
    		response=httpclient.execute(httpPost1);
    		HttpEntity httpEntity1=response.getEntity();
    		HttpPost httpPost=new HttpPost("http://study-perf.qa.netease.com//fgadmin/address/new");
    		httpPost.setHeader("Content-Type", "application/json");
    		StringEntity entity=new StringEntity("{\"receiverName\":\"张三\",\"cellPhone\":12345678901,"+"\"addressDetail\":\"浙江大学\",\"province\":\"浙江省\",\"city\":\"杭州市\",\"area\":\"滨江区\"}","utf-8");
    		httpPost.setEntity(entity);
	   		response=httpclient.execute(httpPost);
	   		HttpEntity httpEntity=response.getEntity();
	   		System.out.println(EntityUtils.toString(httpEntity));
	   		EntityUtils.consume(httpEntity);
     	}catch(Exception e) {
    		e.printStackTrace();
	   	}
	}
		
	//添加收货地址失败，addressDetail参数类型不正确
	@Test
	public void TestAdd4() throws Exception {
		try {
	   		httpclient=HttpClients.createDefault();
	   		HttpPost httpPost=new HttpPost("http://study-perf.qa.netease.com//fgadmin/address/new");
	   		httpPost.setHeader("Content-Type", "application/json");
	   		StringEntity entity=new StringEntity("{\"receiverName\":\"张三\",\"cellPhone\":\"12345678901\","+"\"addressDetail\":123,\"province\":\"浙江省\",\"city\":\"杭州市\",\"area\":\"滨江区\"}","utf-8");
	   		httpPost.setEntity(entity);
	   		response=httpclient.execute(httpPost);
	   		HttpEntity httpEntity=response.getEntity();
	   		System.out.println(EntityUtils.toString(httpEntity));
	   		EntityUtils.consume(httpEntity);
	   	}catch(Exception e) {
	   		e.printStackTrace();
	   	}
	}
	
	//添加收货地址失败，province参数类型不正确
	@Test
	public void TestAdd5() throws Exception {
		try {
    		httpclient=HttpClients.createDefault();
    		HttpPost httpPost1=new HttpPost("http://study-perf.qa.netease.com/common/fgadmin/login");
    		httpPost1.setHeader("Content-Type", "application/json");
    		StringEntity entity1=new StringEntity("{\"phoneArea\":\"86\",\"phoneNumber\":\"20000000000\","+"\"password\":\"netease123\"}","utf-8");
    		httpPost1.setEntity(entity1);
    		response=httpclient.execute(httpPost1);
    		HttpEntity httpEntity1=response.getEntity();
    		HttpPost httpPost=new HttpPost("http://study-perf.qa.netease.com//fgadmin/address/new");
    		httpPost.setHeader("Content-Type", "application/json");
    		StringEntity entity=new StringEntity("{\"receiverName\":\"张三\",\"cellPhone\":\"12345678901\","+"\"addressDetail\":\"浙江大学\",\"province\":571,\"city\":\"杭州市\",\"area\":\"滨江区\"}","utf-8");
    		httpPost.setEntity(entity);
    		response=httpclient.execute(httpPost);
    		HttpEntity httpEntity=response.getEntity();
    		System.out.println(EntityUtils.toString(httpEntity));
    		EntityUtils.consume(httpEntity);
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
	}
		
	//添加收货地址失败，city参数类型不正确
	@Test
	public void TestAdd6() throws Exception {
		try {
	   		httpclient=HttpClients.createDefault();
	   		HttpPost httpPost1=new HttpPost("http://study-perf.qa.netease.com/common/fgadmin/login");
    		httpPost1.setHeader("Content-Type", "application/json");
    		StringEntity entity1=new StringEntity("{\"phoneArea\":\"86\",\"phoneNumber\":\"20000000000\","+"\"password\":\"netease123\"}","utf-8");
    		httpPost1.setEntity(entity1);
    		response=httpclient.execute(httpPost1);
    		HttpEntity httpEntity1=response.getEntity();
	   		HttpPost httpPost=new HttpPost("http://study-perf.qa.netease.com//fgadmin/address/new");
	   		httpPost.setHeader("Content-Type", "application/json");
	   		StringEntity entity=new StringEntity("{\"receiverName\":\"张三\",\"cellPhone\":\"12345678901\","+"\"addressDetail\":\"浙江大学\",\"province\":\"浙江省\",\"city\":571,\"area\":\"滨江区\"}","utf-8");
	   		httpPost.setEntity(entity);
	   		response=httpclient.execute(httpPost);
	   		HttpEntity httpEntity=response.getEntity();
	   		System.out.println(EntityUtils.toString(httpEntity));
	   		EntityUtils.consume(httpEntity);
	   	}catch(Exception e) {
	   		e.printStackTrace();
	   	}
	}
		
	//添加收货地址失败，area参数类型不正确
	@Test
	public void TestAdd7() throws Exception {
		try {
    		httpclient=HttpClients.createDefault();
    		HttpPost httpPost1=new HttpPost("http://study-perf.qa.netease.com/common/fgadmin/login");
    		httpPost1.setHeader("Content-Type", "application/json");
    		StringEntity entity1=new StringEntity("{\"phoneArea\":\"86\",\"phoneNumber\":\"20000000000\","+"\"password\":\"netease123\"}","utf-8");
    		httpPost1.setEntity(entity1);
    		response=httpclient.execute(httpPost1);
    		HttpEntity httpEntity1=response.getEntity();
    		HttpPost httpPost=new HttpPost("http://study-perf.qa.netease.com//fgadmin/address/new");
    		httpPost.setHeader("Content-Type", "application/json");
    		StringEntity entity=new StringEntity("{\"receiverName\":\"张三\",\"cellPhone\":\"12345678901\","+"\"addressDetail\":\"浙江大学\",\"province\":\"浙江省\",\"city\":\"杭州市\",\"area\":571}","utf-8");
    		httpPost.setEntity(entity);
	   		response=httpclient.execute(httpPost);
	   		HttpEntity httpEntity=response.getEntity();
	   		System.out.println(EntityUtils.toString(httpEntity));
	   		EntityUtils.consume(httpEntity);
     	}catch(Exception e) {
    		e.printStackTrace();
	   	}
	}
			
	//添加收货地址失败，缺少receiverName参数
	@Test
	public void TestAdd8() throws Exception {
		try {
	   		httpclient=HttpClients.createDefault();
	   		HttpPost httpPost1=new HttpPost("http://study-perf.qa.netease.com/common/fgadmin/login");
    		httpPost1.setHeader("Content-Type", "application/json");
    		StringEntity entity1=new StringEntity("{\"phoneArea\":\"86\",\"phoneNumber\":\"20000000000\","+"\"password\":\"netease123\"}","utf-8");
    		httpPost1.setEntity(entity1);
    		response=httpclient.execute(httpPost1);
    		HttpEntity httpEntity1=response.getEntity();
	   		HttpPost httpPost=new HttpPost("http://study-perf.qa.netease.com//fgadmin/address/new");
	   		httpPost.setHeader("Content-Type", "application/json");
	   		StringEntity entity=new StringEntity("{\"cellPhone\":\"12345678901\","+"\"addressDetail\":\"浙江大学\",\"province\":\"浙江省\",\"city\":\"杭州市\",\"area\":\"滨江区\"}","utf-8");
	   		httpPost.setEntity(entity);
	   		response=httpclient.execute(httpPost);
	   		HttpEntity httpEntity=response.getEntity();
	   		System.out.println(EntityUtils.toString(httpEntity));
	   		EntityUtils.consume(httpEntity);
	   	}catch(Exception e) {
	   		e.printStackTrace();
	   	}
	}
	
	//添加收货地址失败，缺少cellPhone参数
	@Test
	public void TestAdd9() throws Exception {
		try {
	   		httpclient=HttpClients.createDefault();
	   		HttpPost httpPost1=new HttpPost("http://study-perf.qa.netease.com/common/fgadmin/login");
    		httpPost1.setHeader("Content-Type", "application/json");
    		StringEntity entity1=new StringEntity("{\"phoneArea\":\"86\",\"phoneNumber\":\"20000000000\","+"\"password\":\"netease123\"}","utf-8");
    		httpPost1.setEntity(entity1);
    		response=httpclient.execute(httpPost1);
    		HttpEntity httpEntity1=response.getEntity();
	   		HttpPost httpPost=new HttpPost("http://study-perf.qa.netease.com//fgadmin/address/new");
	   		httpPost.setHeader("Content-Type", "application/json");
	   		StringEntity entity=new StringEntity("{\"receiverName\":\"张三\","+"\"addressDetail\":\"浙江大学\",\"province\":\"浙江省\",\"city\":\"杭州市\",\"area\":\"滨江区\"}","utf-8");
	   		httpPost.setEntity(entity);
	   		response=httpclient.execute(httpPost);
	   		HttpEntity httpEntity=response.getEntity();
	   		System.out.println(EntityUtils.toString(httpEntity));
	   		EntityUtils.consume(httpEntity);
	   	}catch(Exception e) {
	   		e.printStackTrace();
	   	}
	}

	//添加收货地址失败，缺少addressDetail参数
	@Test
	public void TestAdd10() throws Exception {
		try {
	   		httpclient=HttpClients.createDefault();
	   		HttpPost httpPost1=new HttpPost("http://study-perf.qa.netease.com/common/fgadmin/login");
    		httpPost1.setHeader("Content-Type", "application/json");
    		StringEntity entity1=new StringEntity("{\"phoneArea\":\"86\",\"phoneNumber\":\"20000000000\","+"\"password\":\"netease123\"}","utf-8");
    		httpPost1.setEntity(entity1);
    		response=httpclient.execute(httpPost1);
    		HttpEntity httpEntity1=response.getEntity();
	   		HttpPost httpPost=new HttpPost("http://study-perf.qa.netease.com//fgadmin/address/new");
	   		httpPost.setHeader("Content-Type", "application/json");
	   		StringEntity entity=new StringEntity("{\"receiverName\":\"张三\",\"cellPhone\":\"12345678901\",\"province\":\"浙江省\""+",\"city\":\"杭州市\",\"area\":\"滨江区\"}","utf-8");
	   		httpPost.setEntity(entity);
	   		response=httpclient.execute(httpPost);
	   		HttpEntity httpEntity=response.getEntity();
	   		System.out.println(EntityUtils.toString(httpEntity));
	   		EntityUtils.consume(httpEntity);
     	}catch(Exception e) {
    		e.printStackTrace();
    	}
	}
	
	//添加收货地址失败，缺少province参数
	@Test
	public void TestAdd11() throws Exception {
		try {
	   		httpclient=HttpClients.createDefault();
	   		HttpPost httpPost1=new HttpPost("http://study-perf.qa.netease.com/common/fgadmin/login");
    		httpPost1.setHeader("Content-Type", "application/json");
    		StringEntity entity1=new StringEntity("{\"phoneArea\":\"86\",\"phoneNumber\":\"20000000000\","+"\"password\":\"netease123\"}","utf-8");
    		httpPost1.setEntity(entity1);
    		response=httpclient.execute(httpPost1);
    		HttpEntity httpEntity1=response.getEntity();
	   		HttpPost httpPost=new HttpPost("http://study-perf.qa.netease.com//fgadmin/address/new");
	   		httpPost.setHeader("Content-Type", "application/json");
	   		StringEntity entity=new StringEntity("{\"receiverName\":\"张三\",\"cellPhone\":\"12345678901\",\"addressDetail\":\"浙江大学\""+",\"city\":\"杭州市\",\"area\":\"滨江区\"}","utf-8");
	   		httpPost.setEntity(entity);
	   		response=httpclient.execute(httpPost);
	   		HttpEntity httpEntity=response.getEntity();
	   		System.out.println(EntityUtils.toString(httpEntity));
	   		EntityUtils.consume(httpEntity);
     	}catch(Exception e) {
    		e.printStackTrace();
    	}
	}	
	
	//添加收货地址失败，缺少city参数
	@Test
	public void TestAdd12() throws Exception {
		try {
	   		httpclient=HttpClients.createDefault();
	   		HttpPost httpPost1=new HttpPost("http://study-perf.qa.netease.com/common/fgadmin/login");
    		httpPost1.setHeader("Content-Type", "application/json");
    		StringEntity entity1=new StringEntity("{\"phoneArea\":\"86\",\"phoneNumber\":\"20000000000\","+"\"password\":\"netease123\"}","utf-8");
    		httpPost1.setEntity(entity1);
    		response=httpclient.execute(httpPost1);
    		HttpEntity httpEntity1=response.getEntity();
	   		HttpPost httpPost=new HttpPost("http://study-perf.qa.netease.com//fgadmin/address/new");
	   		httpPost.setHeader("Content-Type", "application/json");
	   		StringEntity entity=new StringEntity("{\"receiverName\":\"张三\",\"cellPhone\":\"12345678901\",\"addressDetail\":\"浙江大学\""+",\"province\":\"浙江省\",\"area\":\"滨江区\"}","utf-8");
	   		httpPost.setEntity(entity);
	   		response=httpclient.execute(httpPost);
	   		HttpEntity httpEntity=response.getEntity();
	   		System.out.println(EntityUtils.toString(httpEntity));
	   		EntityUtils.consume(httpEntity);
     	}catch(Exception e) {
    		e.printStackTrace();
    	}
	}
	
	//添加收货地址失败，缺少area参数
	@Test
	public void TestAdd13() throws Exception {
		try {
	   		httpclient=HttpClients.createDefault();
	   		HttpPost httpPost1=new HttpPost("http://study-perf.qa.netease.com/common/fgadmin/login");
    		httpPost1.setHeader("Content-Type", "application/json");
    		StringEntity entity1=new StringEntity("{\"phoneArea\":\"86\",\"phoneNumber\":\"20000000000\","+"\"password\":\"netease123\"}","utf-8");
    		httpPost1.setEntity(entity1);
    		response=httpclient.execute(httpPost1);
    		HttpEntity httpEntity1=response.getEntity();
	   		HttpPost httpPost=new HttpPost("http://study-perf.qa.netease.com//fgadmin/address/new");
	   		httpPost.setHeader("Content-Type", "application/json");
	   		StringEntity entity=new StringEntity("{\"receiverName\":\"张三\",\"cellPhone\":\"12345678901\",\"addressDetail\":\"浙江大学\""+",\"province\":\"浙江省\",\"city\":\"杭州市\"}","utf-8");
	   		httpPost.setEntity(entity);
	   		response=httpclient.execute(httpPost);
	   		HttpEntity httpEntity=response.getEntity();
	   		System.out.println(EntityUtils.toString(httpEntity));
	   		EntityUtils.consume(httpEntity);
     	}catch(Exception e) {
    		e.printStackTrace();
    	}
	}	
	
	//添加收货地址成功,直辖市
	@Test
	public void TestAdd14() throws Exception {
		try {
	   		httpclient=HttpClients.createDefault();
	   		HttpPost httpPost1=new HttpPost("http://study-perf.qa.netease.com/common/fgadmin/login");
    		httpPost1.setHeader("Content-Type", "application/json");
    		StringEntity entity1=new StringEntity("{\"phoneArea\":\"86\",\"phoneNumber\":\"20000000000\","+"\"password\":\"netease123\"}","utf-8");
    		httpPost1.setEntity(entity1);
    		response=httpclient.execute(httpPost1);
    		HttpEntity httpEntity1=response.getEntity();
	   		HttpPost httpPost=new HttpPost("http://study-perf.qa.netease.com//fgadmin/address/new");
	   		httpPost.setHeader("Content-Type", "application/json");
	   		StringEntity entity=new StringEntity("{\"receiverName\":\"张三\",\"cellPhone\":\"12345678901\",\"addressDetail\":\"复旦大学\""+",\"province\":\"上海市\",\"city\":\"上海市\",\"area\":\"黄浦区\"}","utf-8");
	   		httpPost.setEntity(entity);
	   		response=httpclient.execute(httpPost);
	   		HttpEntity httpEntity=response.getEntity();
	   		System.out.println(EntityUtils.toString(httpEntity));
	   		EntityUtils.consume(httpEntity);
     	}catch(Exception e) {
    		e.printStackTrace();
    	}
	}	
	
	//添加收货地址失败，区不匹配
	@Test
	public void TestAdd15() throws Exception {
		try {
	   		httpclient=HttpClients.createDefault();
	   		HttpPost httpPost1=new HttpPost("http://study-perf.qa.netease.com/common/fgadmin/login");
    		httpPost1.setHeader("Content-Type", "application/json");
    		StringEntity entity1=new StringEntity("{\"phoneArea\":\"86\",\"phoneNumber\":\"20000000000\","+"\"password\":\"netease123\"}","utf-8");
    		httpPost1.setEntity(entity1);
    		response=httpclient.execute(httpPost1);
    		HttpEntity httpEntity1=response.getEntity();
	   		HttpPost httpPost=new HttpPost("http://study-perf.qa.netease.com//fgadmin/address/new");
	   		httpPost.setHeader("Content-Type", "application/json");
	   		StringEntity entity=new StringEntity("{\"receiverName\":\"张三\",\"cellPhone\":\"12345678901\",\"addressDetail\":\"南京大学\""+",\"province\":\"江苏省\",\"city\":\"南京市\",\"area\":\"西湖区\"}","utf-8");
	   		httpPost.setEntity(entity);
	   		response=httpclient.execute(httpPost);
	   		HttpEntity httpEntity=response.getEntity();
	   		System.out.println(EntityUtils.toString(httpEntity));
	   		EntityUtils.consume(httpEntity);
     	}catch(Exception e) {
    		e.printStackTrace();
    	}
	}	
	
	//添加收货地址失败，市不匹配
	@Test
	public void TestAdd16() throws Exception {
		try {
	   		httpclient=HttpClients.createDefault();
	   		HttpPost httpPost1=new HttpPost("http://study-perf.qa.netease.com/common/fgadmin/login");
    		httpPost1.setHeader("Content-Type", "application/json");
    		StringEntity entity1=new StringEntity("{\"phoneArea\":\"86\",\"phoneNumber\":\"20000000000\","+"\"password\":\"netease123\"}","utf-8");
    		httpPost1.setEntity(entity1);
    		response=httpclient.execute(httpPost1);
    		HttpEntity httpEntity1=response.getEntity();
	   		HttpPost httpPost=new HttpPost("http://study-perf.qa.netease.com//fgadmin/address/new");
	   		httpPost.setHeader("Content-Type", "application/json");
	   		StringEntity entity=new StringEntity("{\"receiverName\":\"张三\",\"cellPhone\":\"12345678901\",\"addressDetail\":\"南京大学\""+",\"province\":\"浙江省\",\"city\":\"南京市\",\"area\":\"西湖区\"}","utf-8");
	   		httpPost.setEntity(entity);
	   		response=httpclient.execute(httpPost);
	   		HttpEntity httpEntity=response.getEntity();
	   		System.out.println(EntityUtils.toString(httpEntity));
	   		EntityUtils.consume(httpEntity);
     	}catch(Exception e) {
    		e.printStackTrace();
    	}
	}	

	//添加收货地址失败，市、区不匹配
	@Test
	public void TestAdd17() throws Exception {
		try {
	   		httpclient=HttpClients.createDefault();
	   		HttpPost httpPost1=new HttpPost("http://study-perf.qa.netease.com/common/fgadmin/login");
    		httpPost1.setHeader("Content-Type", "application/json");
    		StringEntity entity1=new StringEntity("{\"phoneArea\":\"86\",\"phoneNumber\":\"20000000000\","+"\"password\":\"netease123\"}","utf-8");
    		httpPost1.setEntity(entity1);
    		response=httpclient.execute(httpPost1);
    		HttpEntity httpEntity1=response.getEntity();
	   		HttpPost httpPost=new HttpPost("http://study-perf.qa.netease.com//fgadmin/address/new");
	   		httpPost.setHeader("Content-Type", "application/json");
	   		StringEntity entity=new StringEntity("{\"receiverName\":\"张三\",\"cellPhone\":\"12345678901\",\"addressDetail\":\"南京大学\""+",\"province\":\"江苏省\",\"city\":\"杭州市\",\"area\":\"西湖区\"}","utf-8");
	   		httpPost.setEntity(entity);
	   		response=httpclient.execute(httpPost);
	   		HttpEntity httpEntity=response.getEntity();
	   		System.out.println(EntityUtils.toString(httpEntity));
	   		EntityUtils.consume(httpEntity);
     	}catch(Exception e) {
    		e.printStackTrace();
    	}
	}		

	//添加收货地址失败，省市区不匹配
	@Test
	public void TestAdd18() throws Exception {
		try {
	   		httpclient=HttpClients.createDefault();
	   		HttpPost httpPost1=new HttpPost("http://study-perf.qa.netease.com/common/fgadmin/login");
    		httpPost1.setHeader("Content-Type", "application/json");
    		StringEntity entity1=new StringEntity("{\"phoneArea\":\"86\",\"phoneNumber\":\"20000000000\","+"\"password\":\"netease123\"}","utf-8");
    		httpPost1.setEntity(entity1);
    		response=httpclient.execute(httpPost1);
    		HttpEntity httpEntity1=response.getEntity();
	   		HttpPost httpPost=new HttpPost("http://study-perf.qa.netease.com//fgadmin/address/new");
	   		httpPost.setHeader("Content-Type", "application/json");
	   		StringEntity entity=new StringEntity("{\"receiverName\":\"张三\",\"cellPhone\":\"12345678901\",\"addressDetail\":\"南京大学\""+",\"province\":\"安徽省\",\"city\":\"南京市\",\"area\":\"西湖区\"}","utf-8");
	   		httpPost.setEntity(entity);
	   		response=httpclient.execute(httpPost);
	   		HttpEntity httpEntity=response.getEntity();
	   		System.out.println(EntityUtils.toString(httpEntity));
	   		EntityUtils.consume(httpEntity);
     	}catch(Exception e) {
    		e.printStackTrace();
    	}
	}	
	
	//添加收货地址失败，添加已存在的收货地址
	@Test
	public void TestAdd19() throws Exception {
		try {
	    	httpclient=HttpClients.createDefault();
	    	HttpPost httpPost1=new HttpPost("http://study-perf.qa.netease.com/common/fgadmin/login");
    		httpPost1.setHeader("Content-Type", "application/json");
    		StringEntity entity1=new StringEntity("{\"phoneArea\":\"86\",\"phoneNumber\":\"20000000000\","+"\"password\":\"netease123\"}","utf-8");
    		httpPost1.setEntity(entity1);
    		response=httpclient.execute(httpPost1);
    		HttpEntity httpEntity1=response.getEntity();
	    	HttpPost httpPost=new HttpPost("http://study-perf.qa.netease.com//fgadmin/address/new");
	    	httpPost.setHeader("Content-Type", "application/json");
	    	StringEntity entity=new StringEntity("{\"receiverName\":\"张三\",\"cellPhone\":\"12345678901\","+"\"addressDetail\":\"浙江大学\",\"province\":\"浙江省\",\"city\":\"杭州市\",\"area\":\"滨江区\"}","utf-8");
	    	httpPost.setEntity(entity);
	    	response=httpclient.execute(httpPost);
	    	httpclient=HttpClients.createDefault();
	    	HttpPost httpPost2=new HttpPost("http://study-perf.qa.netease.com//fgadmin/address/new");
	    	httpPost2.setHeader("Content-Type", "application/json");
	    	StringEntity entity2=new StringEntity("{\"receiverName\":\"张三\",\"cellPhone\":\"12345678901\","+"\"addressDetail\":\"浙江大学\",\"province\":\"浙江省\",\"city\":\"杭州市\",\"area\":\"滨江区\"}","utf-8");
	    	httpPost2.setEntity(entity2);
	    	response=httpclient.execute(httpPost2);
	    	HttpEntity httpEntity=response.getEntity();
	    	System.out.println(EntityUtils.toString(httpEntity));
	    	EntityUtils.consume(httpEntity);
	    }catch(Exception e) {
	    	e.printStackTrace();
	    }
	}
		
	//添加收货地址失败，添加超过6个收货地址
	@Test
	public void TestAdd20() throws Exception {
		try {
		   	httpclient=HttpClients.createDefault();
		   	HttpPost httpPost1=new HttpPost("http://study-perf.qa.netease.com/common/fgadmin/login");
    		httpPost1.setHeader("Content-Type", "application/json");
    		StringEntity entity1=new StringEntity("{\"phoneArea\":\"86\",\"phoneNumber\":\"20000000000\","+"\"password\":\"netease123\"}","utf-8");
    		httpPost1.setEntity(entity1);
    		response=httpclient.execute(httpPost1);
    		HttpEntity httpEntity1=response.getEntity();
		   	HttpPost httpPost=new HttpPost("http://study-perf.qa.netease.com//fgadmin/address/new");
		   	httpPost.setHeader("Content-Type", "application/json");
		   	StringEntity entity=new StringEntity("{\"receiverName\":\"张大\",\"cellPhone\":\"12345678901\",\"addressDetail\":\"南京大学\""+",\"province\":\"安徽省\",\"city\":\"南京市\",\"area\":\"西湖区\"}","utf-8");
		   	httpPost.setEntity(entity);
		   	httpclient=HttpClients.createDefault();
		   	HttpPost httpPost2=new HttpPost("http://study-perf.qa.netease.com//fgadmin/address/new");
		   	httpPost2.setHeader("Content-Type", "application/json");
		   	StringEntity entity2=new StringEntity("{\"receiverName\":\"张二\",\"cellPhone\":\"12345678901\",\"addressDetail\":\"南京大学\""+",\"province\":\"安徽省\",\"city\":\"南京市\",\"area\":\"西湖区\"}","utf-8");
		   	httpPost.setEntity(entity2);
		   	httpclient=HttpClients.createDefault();
		   	HttpPost httpPost3=new HttpPost("http://study-perf.qa.netease.com//fgadmin/address/new");
		   	httpPost3.setHeader("Content-Type", "application/json");
		   	StringEntity entity3=new StringEntity("{\"receiverName\":\"张三\",\"cellPhone\":\"12345678901\",\"addressDetail\":\"南京大学\""+",\"province\":\"安徽省\",\"city\":\"南京市\",\"area\":\"西湖区\"}","utf-8");
		   	httpPost.setEntity(entity3);
		   	httpclient=HttpClients.createDefault();
		   	HttpPost httpPost4=new HttpPost("http://study-perf.qa.netease.com//fgadmin/address/new");
		   	httpPost4.setHeader("Content-Type", "application/json");
		   	StringEntity entity4=new StringEntity("{\"receiverName\":\"张四\",\"cellPhone\":\"12345678901\",\"addressDetail\":\"南京大学\""+",\"province\":\"安徽省\",\"city\":\"南京市\",\"area\":\"西湖区\"}","utf-8");
		   	httpPost.setEntity(entity4);
		   	httpclient=HttpClients.createDefault();
		   	HttpPost httpPost5=new HttpPost("http://study-perf.qa.netease.com//fgadmin/address/new");
		   	httpPost5.setHeader("Content-Type", "application/json");
		   	StringEntity entity5=new StringEntity("{\"receiverName\":\"张五\",\"cellPhone\":\"12345678901\",\"addressDetail\":\"南京大学\""+",\"province\":\"安徽省\",\"city\":\"南京市\",\"area\":\"西湖区\"}","utf-8");
		   	httpPost.setEntity(entity5);
		   	httpclient=HttpClients.createDefault();
		   	HttpPost httpPost6=new HttpPost("http://study-perf.qa.netease.com//fgadmin/address/new");
		   	httpPost6.setHeader("Content-Type", "application/json");
		   	StringEntity entity6=new StringEntity("{\"receiverName\":\"张六\",\"cellPhone\":\"12345678901\",\"addressDetail\":\"南京大学\""+",\"province\":\"安徽省\",\"city\":\"南京市\",\"area\":\"西湖区\"}","utf-8");
		   	httpPost.setEntity(entity6);
		   	response=httpclient.execute(httpPost6);
		   	HttpEntity httpEntity=response.getEntity();
		   	System.out.println(EntityUtils.toString(httpEntity));
		   	EntityUtils.consume(httpEntity);
	     }catch(Exception e) {
	    	e.printStackTrace();
	    }
	}
	
	//未登录时添加收货地址
	@Test
	public void TestAdd21() throws Exception {
		try {
    		httpclient=HttpClients.createDefault();
    		HttpPost httpPost1=new HttpPost("http://study-perf.qa.netease.com/common/fgadmin/login");
    		httpPost1.setHeader("Content-Type", "application/json");
    		StringEntity entity1=new StringEntity("{\"phoneArea\":\"86\",\"phoneNumber\":\"20000000000\","+"\"password\":\"netease123\"}","utf-8");
    		httpPost1.setEntity(entity1);
    		response=httpclient.execute(httpPost1);
    		HttpEntity httpEntity1=response.getEntity();
    		HttpPost httpPost=new HttpPost("http://study-perf.qa.netease.com//fgadmin/address/new");
    		httpPost.setHeader("Content-Type", "application/json");
    		StringEntity entity=new StringEntity("{\"receiverName\":\"张三\",\"cellPhone\":\"12345678901\","+"\"addressDetail\":\"浙江大学\",\"province\":\"浙江省\",\"city\":\"杭州市\",\"area\":\"滨江区\"}","utf-8");
    		httpPost.setEntity(entity);
    		response=httpclient.execute(httpPost);
    		HttpEntity httpEntity=response.getEntity();
    		System.out.println(EntityUtils.toString(httpEntity));
    		EntityUtils.consume(httpEntity);
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
	}
	
	//添加收货地址失败，receiverName参数为“”
	@Test
	public void TestAdd22() throws Exception {
		try {
    		httpclient=HttpClients.createDefault();
    		HttpPost httpPost1=new HttpPost("http://study-perf.qa.netease.com/common/fgadmin/login");
    		httpPost1.setHeader("Content-Type", "application/json");
    		StringEntity entity1=new StringEntity("{\"phoneArea\":\"86\",\"phoneNumber\":\"20000000000\","+"\"password\":\"netease123\"}","utf-8");
    		httpPost1.setEntity(entity1);
    		response=httpclient.execute(httpPost1);
    		HttpEntity httpEntity1=response.getEntity();
    		HttpPost httpPost=new HttpPost("http://study-perf.qa.netease.com//fgadmin/address/new");
    		httpPost.setHeader("Content-Type", "application/json");
    		StringEntity entity=new StringEntity("{\"receiverName\":\"\",\"cellPhone\":\"12345678901\","+"\"addressDetail\":\"浙江大学\",\"province\":\"浙江省\",\"city\":\"杭州市\",\"area\":\"滨江区\"}","utf-8");
    		httpPost.setEntity(entity);
    		response=httpclient.execute(httpPost);
    		HttpEntity httpEntity=response.getEntity();
    		System.out.println(EntityUtils.toString(httpEntity));
    		EntityUtils.consume(httpEntity);
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
	}
	
	//添加收货地址失败，cellPhone参数为null
	@Test
	public void TestAdd23() throws Exception {
		try {
    		httpclient=HttpClients.createDefault();
    		HttpPost httpPost1=new HttpPost("http://study-perf.qa.netease.com/common/fgadmin/login");
    		httpPost1.setHeader("Content-Type", "application/json");
    		StringEntity entity1=new StringEntity("{\"phoneArea\":\"86\",\"phoneNumber\":\"20000000000\","+"\"password\":\"netease123\"}","utf-8");
    		httpPost1.setEntity(entity1);
    		response=httpclient.execute(httpPost1);
    		HttpEntity httpEntity1=response.getEntity();
    		HttpPost httpPost=new HttpPost("http://study-perf.qa.netease.com//fgadmin/address/new");
    		httpPost.setHeader("Content-Type", "application/json");
    		StringEntity entity=new StringEntity("{\"receiverName\":\"张三\",\"cellPhone\":,"+"\"addressDetail\":\"浙江大学\",\"province\":\"浙江省\",\"city\":\"杭州市\",\"area\":\"滨江区\"}","utf-8");
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
