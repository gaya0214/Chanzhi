package com.webtest.core;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


import org.apache.http.client.CookieStore;
import org.apache.http.client.config.CookieSpecs;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.impl.client.BasicCookieStore;
import org.testng.annotations.Test;

import com.beust.jcommander.internal.Maps;
import com.gargoylesoftware.htmlunit.HttpMethod;
import com.gargoylesoftware.htmlunit.Page;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.WebRequest;
import com.gargoylesoftware.htmlunit.WebResponse;
import com.gargoylesoftware.htmlunit.util.Cookie;

import net.sf.json.JSONObject;

public class HtmlUnit {

	public static String doGet(String url)throws Exception{
		WebClient client =new WebClient();
		WebRequest request=new WebRequest(new URL(url),HttpMethod.GET);
		client.addRequestHeader("Content-Type", "application/json");
		Page p=client.getPage(request);
		WebResponse respone=p.getWebResponse();
		String result=respone.getContentAsString();
		client.close();
		return result;
	}

	public static String doGet(String url,String para) throws Exception{		
	
		WebClient client =new WebClient();
		WebRequest request=new WebRequest(new URL(url+"?"+para),HttpMethod.GET);
		client.addRequestHeader("Content-Type", "application/json");
		Page p=client.getPage(request);
		WebResponse respone=p.getWebResponse();
		String result=respone.getContentAsString();
		client.close();
		return result;
		}
	
	public static String doGet(String url, JSONObject data) throws Exception{
		String para = URLEncoder.encode(data.toString(), "UTF-8");
		WebClient client =new WebClient();
		WebRequest request=new WebRequest(new URL(url+"?"+para),HttpMethod.GET);
		client.addRequestHeader("Content-Type", "application/json");
		Page p=client.getPage(request);
		WebResponse respone=p.getWebResponse();
		String result=respone.getContentAsString();
		client.close();
		return result;
	}
	
	public static String mapToString(Map<String, Object> para) {
		
		StringBuilder sBuilder = new StringBuilder();
		String content = null;
		int size = para.size();
		for (Entry<String, Object> entry : para.entrySet()) {
			sBuilder.append(entry.getKey() + "=" + entry.getValue());
			size--;
			if (size >= 1) {
				sBuilder.append("&");
			}

		}
		return sBuilder.toString();
}
	public static String doGet(String url,Map<String,Object>para) throws Exception{

		WebClient client =new WebClient();
		WebRequest request=new WebRequest(new URL(url+"?"+mapToString(para)),HttpMethod.GET);
		client.addRequestHeader("Content-Type", "application/json");
		Page p=client.getPage(request);		
		WebResponse respone=p.getWebResponse();
		String result=respone.getContentAsString();
		client.close();
		return result;
		}

	public static String doGetByCookie(String url,Set<Cookie> cookie) throws Exception{
		
		WebClient client =new WebClient();
		
//		cookie =(Set<Cookie>) client.getCookieManager().getCookies();                 
//		((CookieStore) cookie).addCookie(((Cookie) cookie).toHttpClient()); 
		Iterator<Cookie> iterator=cookie.iterator();
		while(iterator.hasNext()) {
			client.getCookieManager().addCookie(iterator.next());
			
		}	
		WebRequest request=new WebRequest(new URL(url),HttpMethod.GET);
		client.addRequestHeader("Content-Type", "application/json");
		Page p=client.getPage(request);		
		WebResponse respone=p.getWebResponse();
		String result=respone.getContentAsString();
		client.close();

		return result;
	}

	public static String doPost(String url,JSONObject user ) throws Exception{
		WebClient client =new WebClient();
		WebRequest request=new WebRequest(new URL(url),HttpMethod.POST);
		client.addRequestHeader("Content-Type", "application/json");
		
		request.setRequestBody(user.toString());
		
		Page p=client.getPage(request);
		WebResponse respone=p.getWebResponse();
		String result=respone.getContentAsString();
		client.close();
		return result;	
	}
	public static String doPost(String url, JSONObject data,CookieStore cookie) throws Exception{
		String para = URLEncoder.encode(data.toString(), "UTF-8");
		
		WebClient client =new WebClient();
		WebRequest request=new WebRequest(new URL(url+"?"+para),HttpMethod.POST);
		client.addRequestHeader("Content-Type", "application/json");
		
		request.setRequestBody(para);
		
		Page p=client.getPage(request);
		WebResponse respone=p.getWebResponse();
		String result=respone.getContentAsString();
		client.close();
		return result;
	}
	
	
	public static String doPostByForm(String url, Map<String, Object> para) throws Exception {
		WebClient client =new WebClient();
		String tspara=mapToString(para);
		WebRequest request=new WebRequest(new URL(url+"?"+tspara),HttpMethod.POST);
		client.addRequestHeader("Content-Type", "application/x-www-form-urlencoded");
		
		request.setRequestBody(tspara);
		
		Page p=client.getPage(request); 
		WebResponse respone=p.getWebResponse();
		String result=respone.getContentAsString();
		client.close();
		return result;

	}
	public static String doPostByCookie(String url, JSONObject para, Set<Cookie> cookie) throws Exception{
		WebClient client =new WebClient();
		Iterator<Cookie> iterator=cookie.iterator();
		while(iterator.hasNext()) {
			client.getCookieManager().addCookie(iterator.next());
			
		}
		String tspara=mapToString(para);
		WebRequest request=new WebRequest(new URL(url+"?"+tspara),HttpMethod.POST);
		client.addRequestHeader("Content-Type", "application/x-www-form-urlencoded");
		
		request.setRequestBody(tspara);
		
		Page p=client.getPage(request); 
		WebResponse respone=p.getWebResponse();
		String result=respone.getContentAsString();
		client.close();
		return result;
	}
	public static Set<Cookie> doPostgetCookie(String url, JSONObject user) throws Exception {
		//创建一个client对象
		WebClient client =new WebClient();
		               
		//创建请求webRequest
		WebRequest request=new WebRequest(new URL(url),HttpMethod.POST);
		//设置请求头
		client.addRequestHeader("Content-Type", "application/json");
	
		//设置请求体
		request.setRequestBody(user.toString());
		//执行请求
		Page p=client.getPage(request);
		//获得响应
		WebResponse respone=p.getWebResponse();
		//获得响应正文
		String result=respone.getContentAsString();
		//获得cookie
		Set<Cookie> cookie=client.getCookieManager().getCookies(); 

		//断开连接
		client.close();
		return cookie;
	
	}
	
}
