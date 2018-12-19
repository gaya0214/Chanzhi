package com.webtest.htmlunit_demo;

import java.io.IOException;
import java.util.Set;

import org.apache.http.client.CookieStore;
import org.testng.annotations.Test;

import com.webtest.utils.Common;
import com.gargoylesoftware.htmlunit.util.Cookie;
import com.webtest.core.HtmlUnit;
import com.webtest.utils.ReadPro;
/*×÷Õß£ºÎ¤Óî½Ü*/
public class Get_Address_list {
@Test
	public void address_list_success() throws IOException, Exception{
	Set<Cookie> cookie = Common.getLoginCookie();
	
	String result = HtmlUnit.doGetByCookie(ReadPro.getProValue("url")+"/fgadmin/address/list",cookie);
	/*http://study-perf.qa.netease.com/common/skuList?goodsId=1&tm=1540946089644*/
	System.out.println(result);
}
}
