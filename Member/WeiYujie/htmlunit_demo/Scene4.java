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
	//查询收货地址
	public void look_Address() throws IOException, Exception {
		Set<Cookie> cookie = Common.getLoginCookie();
		String result = HtmlUnit.doGetByCookie(ReadPro.getProValue("url")+"/fgadmin/address/list", cookie);
		System.out.println(result);
	}
	@Test(priority=1)
	//计算运费
	public void computed_Freight() throws IOException, Exception {
		Set<Cookie> cookie = Common.getLoginCookie();
		String result = HtmlUnit.doGetByCookie(ReadPro.getProValue("url")+"/common/getTransportFee", cookie);
		System.out.println(result);
	}
	@Test(priority=2)
	//提交订单
	public void submit() throws IOException, Exception {
		Set<Cookie> cookie = Common.getLoginCookie();
		String url = "http://study-perf.qa.netease.com/fgadmin/orders/submit";
		JSONObject submit = new JSONObject();
		submit.element("skuIds", "1");
		submit.element("receiverName","李四");
		submit.element("cellPhone","20000000004");
		submit.element("addressDetail", "南京大学");	
		submit.element("transportFee","7.0");
		submit.element("province", "江苏省");
		submit.element("city", "南京市");
		submit.element("area", "鼓楼区");
		String result = HtmlUnit.doPostByCookie(url, submit, cookie);
		System.out.println(result);
	}
}
