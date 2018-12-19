package com.webtest.htmlunit_demo;
import java.util.Set;

/*
 * 作者：刘琪
 * 测试内容：成功提交一条订单
 * */
import org.apache.http.client.CookieStore;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.util.Cookie;
import com.webtest.core.HtmlUnit;
import com.webtest.utils.Common;

import net.sf.json.JSONObject;

public class Post_Submit {
	@Test
	public void submit_success() throws Exception {
		Set<Cookie> cookie = Common.getLoginCookie();
		String url = "http://study-perf.qa.netease.com/fgadmin/orders/submit";
		JSONObject submit = new JSONObject();
		submit.element("skuIds", "2");
		submit.element("skuNumbers","1");
		submit.element("stockIds", "74966312");
		submit.element("receiverName","张三");
		submit.element("cellPhone","18788990011");
		submit.element("addressDetail", "中山路125号");	
		submit.element("invoiceHead","");
		submit.element("voiceStatus",0);
		submit.element("needInvoice",0);
		submit.element("transportFee",0);
		submit.element("logisticsCompanyId",1);
		submit.element("accessSource", "noSource");
		submit.element("accessDevice", 0);
		submit.element("province", "重庆市");
		submit.element("city", "万州区");
		submit.element("area", "");
		String result = HtmlUnit.doPostByCookie(url, submit, cookie);
		System.out.println(result);
	}
	@Test
	public void submit_fail1() throws Exception {
		Set<Cookie> cookie = Common.getLoginCookie();
		String url = "http://study-perf.qa.netease.com/fgadmin/orders/submit";
		JSONObject submit = new JSONObject();
		submit.element("skuIds", 2);
		submit.element("skuNumbers","1");
		submit.element("stockIds", "74966312");
		submit.element("receiverName","张三");
		submit.element("cellPhone","18788990011");
		submit.element("addressDetail", "中山路125号");	
		submit.element("invoiceHead","");
		submit.element("voiceStatus",0);
		submit.element("needInvoice",0);
		submit.element("transportFee",0);
		submit.element("logisticsCompanyId",1);
		submit.element("accessSource", "noSource");
		submit.element("accessDevice", 0);
		submit.element("province", "重庆市");
		submit.element("city", "万州区");
		submit.element("area", "");
		String result = HtmlUnit.doPostByCookie(url, submit, cookie);
		System.out.println(result);
	}
	@Test
	public void submit_fail2() throws Exception {
		Set<Cookie> cookie = Common.getLoginCookie();
		String url = "http://study-perf.qa.netease.com/fgadmin/orders/submit";
		JSONObject submit = new JSONObject();
		submit.element("skuIds", "2");
		submit.element("skuNumbers",1);
		submit.element("stockIds", "74966312");
		submit.element("receiverName","张三");
		submit.element("cellPhone","18788990011");
		submit.element("addressDetail", "中山路125号");	
		submit.element("invoiceHead","");
		submit.element("voiceStatus",0);
		submit.element("needInvoice",0);
		submit.element("transportFee",0);
		submit.element("logisticsCompanyId",1);
		submit.element("accessSource", "noSource");
		submit.element("accessDevice", 0);
		submit.element("province", "重庆市");
		submit.element("city", "万州区");
		submit.element("area", "");
		String result = HtmlUnit.doPostByCookie(url, submit, cookie);
		System.out.println(result);
	}
	@Test
	public void submit_fail3() throws Exception {
		Set<Cookie> cookie = Common.getLoginCookie();
		String url = "http://study-perf.qa.netease.com/fgadmin/orders/submit";
		JSONObject submit = new JSONObject();
		submit.element("skuIds", "2");
		submit.element("skuNumbers","1");
		submit.element("stockIds", 74966312);
		submit.element("receiverName","张三");
		submit.element("cellPhone","18788990011");
		submit.element("addressDetail", "中山路125号");	
		submit.element("invoiceHead","");
		submit.element("voiceStatus",0);
		submit.element("needInvoice",0);
		submit.element("transportFee",0);
		submit.element("logisticsCompanyId",1);
		submit.element("accessSource", "noSource");
		submit.element("accessDevice", 0);
		submit.element("province", "重庆市");
		submit.element("city", "万州区");
		submit.element("area", "");
		String result = HtmlUnit.doPostByCookie(url, submit, cookie);
		System.out.println(result);
	}
	@Test
	public void submit_fail4() throws Exception {
		Set<Cookie> cookie = Common.getLoginCookie();
		String url = "http://study-perf.qa.netease.com/fgadmin/orders/submit";
		JSONObject submit = new JSONObject();
		submit.element("skuIds", "2");
		submit.element("skuNumbers","1");
		submit.element("stockIds", "74966312");
		submit.element("receiverName","张三");
		submit.element("cellPhone",187);
		submit.element("addressDetail", "中山路125号");	
		submit.element("invoiceHead","");
		submit.element("voiceStatus",0);
		submit.element("needInvoice",0);
		submit.element("transportFee",0);
		submit.element("logisticsCompanyId",1);
		submit.element("accessSource", "noSource");
		submit.element("accessDevice", 0);
		submit.element("province", "重庆市");
		submit.element("city", "万州区");
		submit.element("area", "");
		String result = HtmlUnit.doPostByCookie(url, submit, cookie);
		System.out.println(result);
	}
	@Test
	public void submit_fail5() throws Exception {
		Set<Cookie> cookie = Common.getLoginCookie();
		String url = "http://study-perf.qa.netease.com/fgadmin/orders/submit";
		JSONObject submit = new JSONObject();
		submit.element("skuIds", "null");
		submit.element("skuNumbers","1");
		submit.element("stockIds", "74966312");
		submit.element("receiverName","张三");
		submit.element("cellPhone","18788990011");
		submit.element("addressDetail", "中山路125号");	
		submit.element("invoiceHead","");
		submit.element("voiceStatus",0);
		submit.element("needInvoice",0);
		submit.element("transportFee",0);
		submit.element("logisticsCompanyId",1);
		submit.element("accessSource", "noSource");
		submit.element("accessDevice", 0);
		submit.element("province", "重庆市");
		submit.element("city", "万州区");
		submit.element("area", "");
		String result = HtmlUnit.doPostByCookie(url, submit, cookie);
		System.out.println(result);
	}
	@Test
	public void submit_fail6() throws Exception {
		Set<Cookie> cookie = Common.getLoginCookie();
		String url = "http://study-perf.qa.netease.com/fgadmin/orders/submit";
		JSONObject submit = new JSONObject();
		submit.element("skuIds", "2");
		submit.element("skuNumbers","null");
		submit.element("stockIds", "74966312");
		submit.element("receiverName","张三");
		submit.element("cellPhone","18788990011");
		submit.element("addressDetail", "中山路125号");	
		submit.element("invoiceHead","");
		submit.element("voiceStatus",0);
		submit.element("needInvoice",0);
		submit.element("transportFee",0);
		submit.element("logisticsCompanyId",1);
		submit.element("accessSource", "noSource");
		submit.element("accessDevice", 0);
		submit.element("province", "重庆市");
		submit.element("city", "万州区");
		submit.element("area", "");
		String result = HtmlUnit.doPostByCookie(url, submit, cookie);
		System.out.println(result);
	}
	@Test
	public void submit_fail7() throws Exception {
		Set<Cookie> cookie = Common.getLoginCookie();
		String url = "http://study-perf.qa.netease.com/fgadmin/orders/submit";
		JSONObject submit = new JSONObject();
		submit.element("skuIds", "2");
		submit.element("skuNumbers","1");
		submit.element("stockIds", "null");
		submit.element("receiverName","张三");
		submit.element("cellPhone","18788990011");
		submit.element("addressDetail", "中山路125号");	
		submit.element("invoiceHead","");
		submit.element("voiceStatus",0);
		submit.element("needInvoice",0);
		submit.element("transportFee",0);
		submit.element("logisticsCompanyId",1);
		submit.element("accessSource", "noSource");
		submit.element("accessDevice", 0);
		submit.element("province", "重庆市");
		submit.element("city", "万州区");
		submit.element("area", "");
		String result = HtmlUnit.doPostByCookie(url, submit, cookie);
		System.out.println(result);
	}
	@Test
	public void submit_fail8() throws Exception {
		Set<Cookie> cookie = Common.getLoginCookie();
		String url = "http://study-perf.qa.netease.com/fgadmin/orders/submit";
		JSONObject submit = new JSONObject();
		submit.element("skuIds", "2");
		submit.element("skuNumbers","1");
		submit.element("stockIds", "74966312");
		submit.element("receiverName","张三");
		submit.element("cellPhone","null");
		submit.element("addressDetail", "中山路125号");	
		submit.element("invoiceHead","");
		submit.element("voiceStatus",0);
		submit.element("needInvoice",0);
		submit.element("transportFee",0);
		submit.element("logisticsCompanyId",1);
		submit.element("accessSource", "noSource");
		submit.element("accessDevice", 0);
		submit.element("province", "重庆市");
		submit.element("city", "万州区");
		submit.element("area", "");
		String result = HtmlUnit.doPostByCookie(url, submit, cookie);
		System.out.println(result);
	}
	@Test
	public void submit_fail9() throws Exception {
		Set<Cookie> cookie = Common.getLoginCookie();
		String url = "http://study-perf.qa.netease.com/fgadmin/orders/submit";
		JSONObject submit = new JSONObject();
		submit.element("skuIds", "2");
		submit.element("skuNumbers","1");
		submit.element("stockIds", "74966312");
		submit.element("receiverName","");
		submit.element("cellPhone","18788990011");
		submit.element("addressDetail", "中山路125号");	
		submit.element("invoiceHead","");
		submit.element("voiceStatus",0);
		submit.element("needInvoice",0);
		submit.element("transportFee",0);
		submit.element("logisticsCompanyId",1);
		submit.element("accessSource", "noSource");
		submit.element("accessDevice", 0);
		submit.element("province", "重庆市");
		submit.element("city", "万州区");
		submit.element("area", "");
		String result = HtmlUnit.doPostByCookie(url, submit, cookie);
		System.out.println(result);
	}
	@Test
	public void submit_fail10() throws Exception {
		Set<Cookie> cookie = Common.getLoginCookie();
		String url = "http://study-perf.qa.netease.com/fgadmin/orders/submit";
		JSONObject submit = new JSONObject();
		submit.element("skuIds", "2");
		submit.element("skuNumbers","1");
		submit.element("stockIds", "74966312");
		submit.element("receiverName","null");
		submit.element("cellPhone","18788990011");
		submit.element("addressDetail", "中山路125号");	
		submit.element("invoiceHead","");
		submit.element("voiceStatus",0);
		submit.element("needInvoice",0);
		submit.element("transportFee",0);
		submit.element("logisticsCompanyId",1);
		submit.element("accessSource", "noSource");
		submit.element("accessDevice", 0);
		submit.element("province", "重庆市");
		submit.element("city", "万州区");
		submit.element("area", "");
		String result = HtmlUnit.doPostByCookie(url, submit, cookie);
		System.out.println(result);
	}
	@Test
	public void submit_fail11() throws Exception {
		Set<Cookie> cookie = Common.getLoginCookie();
		String url = "http://study-perf.qa.netease.com/fgadmin/orders/submit";
		JSONObject submit = new JSONObject();
		submit.element("skuIds", "2,3");
		submit.element("skuNumbers","1,1");
		submit.element("stockIds", "74966312,74966313");
		submit.element("receiverName","张三");
		submit.element("cellPhone","18788990011");
		submit.element("addressDetail", "571");	
		submit.element("invoiceHead","");
		submit.element("voiceStatus",0);
		submit.element("needInvoice",0);
		submit.element("transportFee",0);
		submit.element("logisticsCompanyId",1);
		submit.element("accessSource", "noSource");
		submit.element("accessDevice", 0);
		submit.element("province", "重庆市");
		submit.element("city", "万州区");
		submit.element("area", "");
		String result = HtmlUnit.doPostByCookie(url, submit, cookie);
		System.out.println(result);
	}
	@Test
	public void submit_fail12() throws Exception {
		Set<Cookie> cookie = Common.getLoginCookie();
		String url = "http://study-perf.qa.netease.com/fgadmin/orders/submit";
		JSONObject submit = new JSONObject();
		submit.element("skuIds", "2");
		submit.element("skuNumbers","1");
		submit.element("stockIds", "74966312");
		submit.element("receiverName","张三");
		submit.element("cellPhone","18788990011");
		submit.element("addressDetail", "null");	
		submit.element("invoiceHead","");
		submit.element("voiceStatus",0);
		submit.element("needInvoice",0);
		submit.element("transportFee",0);
		submit.element("logisticsCompanyId",1);
		submit.element("accessSource", "noSource");
		submit.element("accessDevice", 0);
		submit.element("province", "重庆市");
		submit.element("city", "万州区");
		submit.element("area", "");
		String result = HtmlUnit.doPostByCookie(url, submit, cookie);
		System.out.println(result);
	}
	@Test
	public void submit_fail13() throws Exception {
		Set<Cookie> cookie = Common.getLoginCookie();
		String url = "http://study-perf.qa.netease.com/fgadmin/orders/submit";
		JSONObject submit = new JSONObject();
		submit.element("skuIds", "2");
		submit.element("skuNumbers","1");
		submit.element("stockIds", "74966312");
		submit.element("receiverName","张三");
		submit.element("cellPhone","18788990011");
		submit.element("addressDetail", "中山路125号");	
		submit.element("invoiceHead","");
		submit.element("voiceStatus",0);
		submit.element("needInvoice",0);
		submit.element("transportFee",0);
		submit.element("logisticsCompanyId",1);
		submit.element("accessSource", "noSource");
		submit.element("accessDevice", 0);
		submit.element("province", 571);
		submit.element("city", "万州区");
		submit.element("area", "");
		String result = HtmlUnit.doPostByCookie(url, submit, cookie);
		System.out.println(result);
	}
	@Test
	public void submit_fail14() throws Exception {
		Set<Cookie> cookie = Common.getLoginCookie();
		String url = "http://study-perf.qa.netease.com/fgadmin/orders/submit";
		JSONObject submit = new JSONObject();
		submit.element("skuIds", "2,3");
		submit.element("skuNumbers","1,1");
		submit.element("stockIds", "74966312,74966313");
		submit.element("receiverName","张三");
		submit.element("cellPhone","18788990011");
		submit.element("addressDetail", "中山路125号");	
		submit.element("invoiceHead","");
		submit.element("voiceStatus",0);
		submit.element("needInvoice",0);
		submit.element("transportFee",0);
		submit.element("logisticsCompanyId",1);
		submit.element("accessSource", "noSource");
		submit.element("accessDevice", 0);
		submit.element("province", "重庆市");
		submit.element("city", 571);
		submit.element("area", "");
		String result = HtmlUnit.doPostByCookie(url, submit, cookie);
		System.out.println(result);
	}
	@Test
	public void submit_fail15() throws Exception {
		Set<Cookie> cookie = Common.getLoginCookie();
		String url = "http://study-perf.qa.netease.com/fgadmin/orders/submit";
		JSONObject submit = new JSONObject();
		submit.element("skuIds", "2,3");
		submit.element("skuNumbers","1,1");
		submit.element("stockIds", "74966312,74966313");
		submit.element("receiverName","张三");
		submit.element("cellPhone","18788990011");
		submit.element("addressDetail", "中山路125号");	
		submit.element("invoiceHead","");
		submit.element("voiceStatus",0);
		submit.element("needInvoice",0);
		submit.element("transportFee",0);
		submit.element("logisticsCompanyId",1);
		submit.element("accessSource", "noSource");
		submit.element("accessDevice", 0);
		submit.element("province", "重庆市");
		submit.element("city", "万州区");
		submit.element("area", 571);
		String result = HtmlUnit.doPostByCookie(url, submit, cookie);
		System.out.println(result);
	}
	@Test
	public void submit_fail16() throws Exception {
		Set<Cookie> cookie = Common.getLoginCookie();
		String url = "http://study-perf.qa.netease.com/fgadmin/orders/submit";
		JSONObject submit = new JSONObject();
		submit.element("skuIds", "2");
		submit.element("skuNumbers","1");
		submit.element("stockIds", "74966312");
		submit.element("receiverName","张三");
		submit.element("cellPhone","18788990011");
		submit.element("addressDetail", "中山路125号");	
		submit.element("invoiceHead","");
		submit.element("voiceStatus",0);
		submit.element("needInvoice",0);
		submit.element("transportFee",0);
		submit.element("logisticsCompanyId",1);
		submit.element("accessSource", 1);
		submit.element("accessDevice", 0);
		submit.element("province", "重庆市");
		submit.element("city", "万州区");
		submit.element("area", "");
		String result = HtmlUnit.doPostByCookie(url, submit, cookie);
		System.out.println(result);
	}

}
