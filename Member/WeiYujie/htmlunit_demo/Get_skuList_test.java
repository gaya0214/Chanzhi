package com.webtest.htmlunit_demo;

import java.io.IOException;
import java.util.Set;

import org.apache.http.client.CookieStore;
import org.testng.annotations.Test;

import com.webtest.utils.Common;
import com.gargoylesoftware.htmlunit.util.Cookie;
import com.webtest.core.HtmlUnit;
import com.webtest.utils.ReadPro;

public class Get_skuList_test {
	@Test
	//获取所有商品的sku列表成功
	public void address_list1() throws IOException, Exception{
		Set<Cookie> cookie = Common.getLoginCookie();
	
		String result = HtmlUnit.doGetByCookie(ReadPro.getProValue("url")+"/common/skuList",cookie);
		/*http://study-perf.qa.netease.com/common/skuList?goodsId=1&tm=1540946089644*/
		System.out.println(result);
	}
	
	@Test
	//获取goodsId=1的商品sku信息成功
	public void address_list2() throws IOException, Exception {
		Set<Cookie> cookie = Common.getLoginCookie();
		String result = HtmlUnit.doGetByCookie(ReadPro.getProValue("url")+"/common/skuList?goodsId=1",cookie);
		System.out.println(result);
	}
	
	@Test
	//获取goodsId=2147483648的商品sku信息失败(超过int最大取值范围)
	public void address_list3() throws IOException, Exception {
		Set<Cookie> cookie = Common.getLoginCookie();
		String result = HtmlUnit.doGetByCookie(ReadPro.getProValue("url")+"/common/skuList?goodsId=2147483648",cookie);
		System.out.println(result);
	}
	
	@Test
	//获取goodsId不存在的商品失败
	public void address_list4() throws IOException, Exception {
		Set<Cookie> cookie = Common.getLoginCookie();
		String result = HtmlUnit.doGetByCookie(ReadPro.getProValue("url")+"/common/skuList?goodsId=9999",cookie);
		System.out.println(result);
	}
	
	@Test
	//goodsId类型不正确
	public void address_list5() throws IOException, Exception {
		Set<Cookie> cookie = Common.getLoginCookie();
		String result = HtmlUnit.doGetByCookie(ReadPro.getProValue("url")+"/common/skuList?goodsId='1'",cookie);
		System.out.println(result);
	}
}