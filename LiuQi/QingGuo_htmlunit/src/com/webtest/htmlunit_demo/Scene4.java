package com.webtest.htmlunit_demo;

import java.io.IOException;
import java.util.Set;

import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.util.Cookie;
import com.webtest.core.HtmlUnit;
import com.webtest.utils.Common;
import com.webtest.utils.ReadPro;

import net.sf.json.JSONObject;

public class Scene4 {
	@Test(priority=0)
	public void address_list_success() throws IOException, Exception{
	Set<Cookie> cookie = Common.getLoginCookie();
	String result = HtmlUnit.doGetByCookie(ReadPro.getProValue("url")+"/fgadmin/address/list",cookie);
	System.out.println(result);
}
	@Test(priority=1)
	public void transportfee() throws Exception {
		String result = HtmlUnit.doGet(ReadPro.getProValue("url")+"/common/getTransportFee?id=1&addressDetail=浙江省_杭州市_西湖区");
		System.out.println(result);
	}
	@Test(priority=2)
	public void submit() throws Exception {
		Set<Cookie> cookie = Common.getLoginCookie();
		String url = "http://study-perf.qa.netease.com/fgadmin/orders/submit";
		JSONObject submit = new JSONObject();
		submit.element("skuIds", "2");
		submit.element("receiverName","张三");
		submit.element("cellPhone","20000000000");
		submit.element("addressDetail", "浙江大学");	
		submit.element("transportFee","6.0");
		submit.element("province", "浙江省");
		submit.element("city", "杭州市");
		submit.element("area", "西湖区");
		String result = HtmlUnit.doPostByCookie(url, submit, cookie);
		System.out.println(result);
	}
}
