package com.webtest.htmlunit_demo;

import java.util.Set;

import org.apache.http.client.CookieStore;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.util.Cookie;
import com.webtest.core.HtmlUnit;
import com.webtest.utils.Common;

import net.sf.json.JSONObject;

public class Post_Address_new_test {
	@Test
	//1添加收货地址成功
	public void addAdress_success() throws Exception {
		Set<Cookie> cookie = Common.getLoginCookie();
		String url = "http://study-perf.qa.netease.com/fgadmin/address/new";
		JSONObject address = new JSONObject();
		address.element("id", "");
		address.element("receiverName", "张三");
		address.element("cellPhone", "18788990011");
		address.element("province", "浙江省");
		address.element("city", "杭州市");
		address.element("area", "滨江区");
		address.element("addressDetail", "浙江大学");
		String result = HtmlUnit.doPostByCookie(url, address, cookie);
		System.out.println(result);
	}
	@Test
	//2添加收货地址失败，receiveName参数类型不正确
	public void addAdress_fail1() throws Exception {
		Set<Cookie> cookie = Common.getLoginCookie();
		String url = "http://study-perf.qa.netease.com/fgadmin/address/new";
		JSONObject address = new JSONObject();
		address.element("id", "");
		address.element("receiverName", "123");
		address.element("cellPhone", "18788990011");
		address.element("province", "浙江省");
		address.element("city", "杭州市");
		address.element("area", "滨江区");
		address.element("addressDetail", "浙江大学");
		String result = HtmlUnit.doPostByCookie(url, address, cookie);
		System.out.println(result);
	}
	@Test
	//3添加收货地址失败，cellPhone参数类型不正确
	public void addAdress_fail2() throws Exception {
		Set<Cookie> cookie = Common.getLoginCookie();
		String url = "http://study-perf.qa.netease.com/fgadmin/address/new";
		JSONObject address = new JSONObject();
		address.element("id", "");
		address.element("receiverName", "张三");
		address.element("cellPhone", "187889900111");
		address.element("province", "浙江省");
		address.element("city", "杭州市");
		address.element("area", "滨江区");
		address.element("addressDetail", "浙江大学");
		String result = HtmlUnit.doPostByCookie(url, address, cookie);
		System.out.println(result);
	}
	@Test
	//4添加收货地址失败，addressDetail参数类型不正确
	public void addAdress_fail3() throws Exception {
		Set<Cookie> cookie = Common.getLoginCookie();
		String url = "http://study-perf.qa.netease.com/fgadmin/address/new";
		JSONObject address = new JSONObject();
		address.element("id", "");
		address.element("receiverName", "张三");
		address.element("cellPhone", "18788990011");
		address.element("province", "浙江省");
		address.element("city", "杭州市");
		address.element("area", "滨江区");
		address.element("addressDetail", "123");
		String result = HtmlUnit.doPostByCookie(url, address, cookie);
		System.out.println(result);
	}
	@Test
	//5添加收货地址失败，province参数类型不正确
	public void addAdress_fail4() throws Exception {
		Set<Cookie> cookie = Common.getLoginCookie();
		String url = "http://study-perf.qa.netease.com/fgadmin/address/new";
		JSONObject address = new JSONObject();
		address.element("id", "");
		address.element("receiverName", "张三");
		address.element("cellPhone", "18788990011");
		address.element("province", "571");
		address.element("city", "杭州市");
		address.element("area", "滨江区");
		address.element("addressDetail", "浙江大学");
		String result = HtmlUnit.doPostByCookie(url, address, cookie);
		System.out.println(result);
	}
	@Test
	//6添加收货地址失败，city参数类型不正确
	public void addAdress_fail5() throws Exception {
		Set<Cookie> cookie = Common.getLoginCookie();
		String url = "http://study-perf.qa.netease.com/fgadmin/address/new";
		JSONObject address = new JSONObject();
		address.element("id", "");
		address.element("receiverName", "张三");
		address.element("cellPhone", "18788990011");
		address.element("province", "浙江省");
		address.element("city", "571");
		address.element("area", "滨江区");
		address.element("addressDetail", "浙江大学");
		String result = HtmlUnit.doPostByCookie(url, address, cookie);
		System.out.println(result);
	}
	@Test
	//7添加收货地址失败，area参数类型不正确
	public void addAdress_fail6() throws Exception {
		Set<Cookie> cookie = Common.getLoginCookie();
		String url = "http://study-perf.qa.netease.com/fgadmin/address/new";
		JSONObject address = new JSONObject();
		address.element("id", "");
		address.element("receiverName", "张三");
		address.element("cellPhone", "18788990011");
		address.element("province", "浙江省");
		address.element("city", "杭州市");
		address.element("area", "571");
		address.element("addressDetail", "浙江大学");
		String result = HtmlUnit.doPostByCookie(url, address, cookie);
		System.out.println(result);
	}
	@Test
	//8添加收货地址失败，缺少receiverName参数
	public void addAdress_fail7() throws Exception {
		Set<Cookie> cookie = Common.getLoginCookie();
		String url = "http://study-perf.qa.netease.com/fgadmin/address/new";
		JSONObject address = new JSONObject();
		address.element("id", "");
		//address.element("receiverName", "张三");
		address.element("cellPhone", "18788990011");
		address.element("province", "浙江省");
		address.element("city", "杭州市");
		address.element("area", "滨江区");
		address.element("addressDetail", "浙江大学");
		String result = HtmlUnit.doPostByCookie(url, address, cookie);
		System.out.println(result);
	}
	@Test
	//9添加收货地址失败，缺少cellPhone参数
	public void addAdress_fail8() throws Exception {
		Set<Cookie> cookie = Common.getLoginCookie();
		String url = "http://study-perf.qa.netease.com/fgadmin/address/new";
		JSONObject address = new JSONObject();
		address.element("id", "");
		address.element("receiverName", "张三");
		//address.element("cellPhone", "18788990011");
		address.element("province", "浙江省");
		address.element("city", "杭州市");
		address.element("area", "滨江区");
		address.element("addressDetail", "浙江大学");
		String result = HtmlUnit.doPostByCookie(url, address, cookie);
		System.out.println(result);
	}
	@Test
	//10添加收货地址失败，缺少addressDetail参数
	public void addAdress_fail9() throws Exception {
		Set<Cookie> cookie = Common.getLoginCookie();
		String url = "http://study-perf.qa.netease.com/fgadmin/address/new";
		JSONObject address = new JSONObject();
		address.element("id", "");
		address.element("receiverName", "张三");
		address.element("cellPhone", "18788990011");
		address.element("province", "浙江省");
		address.element("city", "杭州市");
		address.element("area", "滨江区");
		//address.element("addressDetail", "浙江大学");
		String result = HtmlUnit.doPostByCookie(url, address, cookie);
		System.out.println(result);
	}
	@Test
	//11添加收货地址失败，缺少province参数
	public void addAdress_fail10() throws Exception {
		Set<Cookie> cookie = Common.getLoginCookie();
		String url = "http://study-perf.qa.netease.com/fgadmin/address/new";
		JSONObject address = new JSONObject();
		address.element("id", "");
		address.element("receiverName", "张三");
		address.element("cellPhone", "18788990011");
		//address.element("", "浙江省");
		address.element("city", "杭州市");
		address.element("area", "滨江区");
		address.element("addressDetail", "浙江大学");
		String result = HtmlUnit.doPostByCookie(url, address, cookie);
		System.out.println(result);
	}
	@Test
	//12添加收货地址失败，缺少city参数
	public void addAdress_fail11() throws Exception {
		Set<Cookie> cookie = Common.getLoginCookie();
		String url = "http://study-perf.qa.netease.com/fgadmin/address/new";
		JSONObject address = new JSONObject();
		address.element("id", "");
		address.element("receiverName", "张三");
		address.element("cellPhone", "18788990011");
		address.element("province", "浙江省");
		//address.element("city", "杭州市");
		address.element("area", "滨江区");
		address.element("addressDetail", "浙江大学");
		String result = HtmlUnit.doPostByCookie(url, address, cookie);
		System.out.println(result);
	}
	@Test
	//13添加收货地址失败，缺少area参数
	public void addAdress_fail12() throws Exception {
		Set<Cookie> cookie = Common.getLoginCookie();
		String url = "http://study-perf.qa.netease.com/fgadmin/address/new";
		JSONObject address = new JSONObject();
		address.element("id", "");
		address.element("receiverName", "张三");
		address.element("cellPhone", "18788990011");
		address.element("province", "浙江省");
		address.element("city", "杭州市");
		//address.element("area", "滨江区");
		address.element("addressDetail", "浙江大学");
		String result = HtmlUnit.doPostByCookie(url, address, cookie);
		System.out.println(result);
	}
	@Test
	//14添加收货地址成功，直辖市
	public void addAdress_success2() throws Exception {
		Set<Cookie> cookie = Common.getLoginCookie();
		String url = "http://study-perf.qa.netease.com/fgadmin/address/new";
		JSONObject address = new JSONObject();
		address.element("id", "");
		address.element("receiverName", "张三");
		address.element("cellPhone", "18788990011");
		address.element("province", "上海市");
		address.element("city", "上海市");
		address.element("area", "黄埔区");
		address.element("addressDetail", "复旦大学");
		String result = HtmlUnit.doPostByCookie(url, address, cookie);
		System.out.println(result);
	}
	@Test
	//15添加收货地址失败，区不匹配
	public void addAdress_fail13() throws Exception {
		Set<Cookie> cookie = Common.getLoginCookie();
		String url = "http://study-perf.qa.netease.com/fgadmin/address/new";
		JSONObject address = new JSONObject();
		address.element("id", "");
		address.element("receiverName", "张三");
		address.element("cellPhone", "18788990011");
		address.element("province", "江苏省");
		address.element("city", "南京市");
		address.element("area", "西湖区");
		address.element("addressDetail", "南京大学");
		String result = HtmlUnit.doPostByCookie(url, address, cookie);
		System.out.println(result);
	}
	@Test
	//16添加收货地址失败，市不匹配
	public void addAdress_fail14() throws Exception {
		Set<Cookie> cookie = Common.getLoginCookie();
		String url = "http://study-perf.qa.netease.com/fgadmin/address/new";
		JSONObject address = new JSONObject();
		address.element("id", "");
		address.element("receiverName", "张三");
		address.element("cellPhone", "18788990011");
		address.element("province", "江苏省");
		address.element("city", "南京市");
		address.element("area", "西湖区");
		address.element("addressDetail", "南京大学");
		String result = HtmlUnit.doPostByCookie(url, address, cookie);
		System.out.println(result);
	}
	@Test
	//17添加收货地址失败，市和区都不匹配
	public void addAdress_fail15() throws Exception {
		Set<Cookie> cookie = Common.getLoginCookie();
		String url = "http://study-perf.qa.netease.com/fgadmin/address/new";
		JSONObject address = new JSONObject();
		address.element("id", "");
		address.element("receiverName", "张三");
		address.element("cellPhone", "18788990011");
		address.element("province", "江苏省");
		address.element("city", "杭州市");
		address.element("area", "西湖区");
		address.element("addressDetail", "南京大学");
		String result = HtmlUnit.doPostByCookie(url, address, cookie);
		System.out.println(result);
	}
	@Test
	//18添加收货地址失败，省市区都不匹配
	public void addAdress_fail16() throws Exception {
		Set<Cookie> cookie = Common.getLoginCookie();
		String url = "http://study-perf.qa.netease.com/fgadmin/address/new";
		JSONObject address = new JSONObject();
		address.element("id", "");
		address.element("receiverName", "张三");
		address.element("cellPhone", "18788990011");
		address.element("province", "安徽省");
		address.element("city", "南京市");
		address.element("area", "西湖区");
		address.element("addressDetail", "南京大学");
		String result = HtmlUnit.doPostByCookie(url, address, cookie);
		System.out.println(result);
	}
	@Test
	//19添加已存在的收货地址失败
	//前置条件：收货地址已存在
	public void addAdress_fail17() throws Exception {
		Set<Cookie> cookie = Common.getLoginCookie();
		String url = "http://study-perf.qa.netease.com/fgadmin/address/new";
		JSONObject address = new JSONObject();
		address.element("id", "");
		address.element("receiverName", "张三");
		address.element("cellPhone", "18788990011");
		address.element("province", "浙江省");
		address.element("city", "杭州市");
		address.element("area", "滨江区");
		address.element("addressDetail", "浙江大学");
		String result = HtmlUnit.doPostByCookie(url, address, cookie);
		System.out.println(result);
	}
	@Test
	//20添加超过6个收货地址失败
	//前置条件：已添加6个收货地址
	public void addAdress_fail18() throws Exception {
		Set<Cookie> cookie = Common.getLoginCookie();
		String url = "http://study-perf.qa.netease.com/fgadmin/address/new";
		JSONObject address = new JSONObject();
		address.element("id", "");
		address.element("receiverName", "张三");
		address.element("cellPhone", "18788990011");
		address.element("province", "浙江省");
		address.element("city", "杭州市");
		address.element("area", "滨江区");
		address.element("addressDetail", "浙江大学");
		String result = HtmlUnit.doPostByCookie(url, address, cookie);
		System.out.println(result);
	}
	@Test
	//21未登录时添加收货地址失败
	//前置条件：未登录
	public void addAdress_fail20() throws Exception {
		//Set<Cookie> cookie = Common.getLoginCookie();
		String url = "http://study-perf.qa.netease.com/fgadmin/address/new";
		JSONObject address = new JSONObject();
		address.element("id", "");
		address.element("receiverName", "张三");
		address.element("cellPhone", "18788990011");
		address.element("province", "浙江省");
		address.element("city", "杭州市");
		address.element("area", "滨江区");
		address.element("addressDetail", "浙江大学");
		String result = HtmlUnit.doPostByCookie(url, address, null);
		System.out.println(result);
	}
	@Test
	//22添加收货地址失败，receiverName参数为""
	public void addAdress_fail21() throws Exception {
		Set<Cookie> cookie = Common.getLoginCookie();
		String url = "http://study-perf.qa.netease.com/fgadmin/address/new";
		JSONObject address = new JSONObject();
		address.element("id", "");
		address.element("receiverName", "");
		address.element("cellPhone", "18788990011");
		address.element("province", "浙江省");
		address.element("city", "杭州市");
		address.element("area", "滨江区");
		address.element("addressDetail", "浙江大学");
		String result = HtmlUnit.doPostByCookie(url, address, cookie);
		System.out.println(result);
	}
	@Test
	//23添加收货地址失败，cellPhone参数为null
	public void addAdress_fail22() throws Exception {
		Set<Cookie> cookie = Common.getLoginCookie();
		String url = "http://study-perf.qa.netease.com/fgadmin/address/new";
		JSONObject address = new JSONObject();
		address.element("id", "");
		address.element("receiverName", "张三");
		address.element("cellPhone", "null");
		address.element("province", "浙江省");
		address.element("city", "杭州市");
		address.element("area", "滨江区");
		address.element("addressDetail", "浙江大学");
		String result = HtmlUnit.doPostByCookie(url, address, cookie);
		System.out.println(result);
	}
}
