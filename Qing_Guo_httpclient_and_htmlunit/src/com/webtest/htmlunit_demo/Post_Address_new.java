package com.webtest.htmlunit_demo;

import java.util.Set;

import org.apache.http.client.CookieStore;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.util.Cookie;
import com.webtest.core.HtmlUnit;
import com.webtest.utils.Common;

import net.sf.json.JSONObject;
/*作者：尹璐*/
public class Post_Address_new {
	@Test
	public void addAdress_success1() throws Exception {
		Set<Cookie> cookie = Common.getLoginCookie();
		String url = "http://study-perf.qa.netease.com/fgadmin/address/new";
		JSONObject address = new JSONObject();
		
		address.element("receiverName", "张三");
		address.element("cellPhone", "12345678901");
		address.element("addressDetail", "浙江大学");
		address.element("province", "浙江省");
		address.element("city", "杭州市");
		address.element("area", "滨江区");
		String result = HtmlUnit.doPostByCookie(url, address, cookie);
		System.out.println(result);
	}
	@Test
	public void addAdress_fail0() throws Exception {
		Set<Cookie> cookie = Common.getLoginCookie();
		String url = "http://study-perf.qa.netease.com/fgadmin/address/new";
		JSONObject address = new JSONObject();
	
		address.element("receiverName", 123);
		address.element("cellPhone", "12345678901");
		address.element("addressDetail", "浙江大学");
		address.element("province", "浙江省");
		address.element("city", "杭州市");
		address.element("area", "滨江区");
		String result = HtmlUnit.doPostByCookie(url, address, cookie);
		System.out.println(result);
	}
	@Test
	public void addAdress_fail1() throws Exception {
		Set<Cookie> cookie = Common.getLoginCookie();
		String url = "http://study-perf.qa.netease.com/fgadmin/address/new";
		JSONObject address = new JSONObject();

		address.element("receiverName", "张三");
		address.element("cellPhone", "12345678901");
		address.element("addressDetail", 123);
		address.element("province", "浙江省");
		address.element("city", "杭州市");
		address.element("area", "滨江区");
		String result = HtmlUnit.doPostByCookie(url, address, cookie);
		System.out.println(result);
	}
	@Test
	public void addAdress_fail2() throws Exception {
		Set<Cookie> cookie = Common.getLoginCookie();
		String url = "http://study-perf.qa.netease.com/fgadmin/address/new";
		JSONObject address = new JSONObject();

		address.element("receiverName", "张三");
		address.element("cellPhone", "12345678901");
		address.element("addressDetail", 123);
		address.element("province", "浙江省");
		address.element("city", "杭州市");
		address.element("area", "滨江区");
		String result = HtmlUnit.doPostByCookie(url, address, cookie);
		System.out.println(result);
	}
	@Test
	public void addAdress_fail3() throws Exception {
		Set<Cookie> cookie = Common.getLoginCookie();
		String url = "http://study-perf.qa.netease.com/fgadmin/address/new";
		JSONObject address = new JSONObject();

		address.element("receiverName", "张三");
		address.element("cellPhone", 123456);
		address.element("addressDetail", "浙江大学");
		address.element("province","浙江省");
		address.element("city", "杭州市");
		address.element("area", "滨江区");
		String result = HtmlUnit.doPostByCookie(url, address, cookie);
		System.out.println(result);
	}
	@Test
	public void addAdress_fail4() throws Exception {
		Set<Cookie> cookie = Common.getLoginCookie();
		String url = "http://study-perf.qa.netease.com/fgadmin/address/new";
		JSONObject address = new JSONObject();

		address.element("receiverName", "张三");
		address.element("cellPhone", "12345678901");
		address.element("addressDetail",123);
		address.element("province","浙江省");
		address.element("city", "杭州市");
		address.element("area","滨江区");
		String result = HtmlUnit.doPostByCookie(url, address, cookie);
		System.out.println(result);
	}
	@Test
	public void addAdress_fail5() throws Exception {
		Set<Cookie> cookie = Common.getLoginCookie();
		String url = "http://study-perf.qa.netease.com/fgadmin/address/new";
		JSONObject address = new JSONObject();

		address.element("receiverName", "张三");
		address.element("cellPhone", "12345678901");
		address.element("addressDetail", "浙江大学");
		address.element("province",571);
		address.element("city", "杭州市");
		address.element("area", "滨江区");
		String result = HtmlUnit.doPostByCookie(url, address, cookie);
		System.out.println(result);
	}
	@Test
	public void addAdress_fail6() throws Exception {
		Set<Cookie> cookie = Common.getLoginCookie();
		String url = "http://study-perf.qa.netease.com/fgadmin/address/new";
		JSONObject address = new JSONObject();

		address.element("receiverName", "张三");
		address.element("cellPhone", "12345678901");
		address.element("addressDetail", "浙江大学");
		address.element("province","浙江省");
		address.element("city", 571);
		address.element("area", "滨江区");
		String result = HtmlUnit.doPostByCookie(url, address, cookie);
		System.out.println(result);
	}
	@Test
	public void addAdress_fail7() throws Exception {
		Set<Cookie> cookie = Common.getLoginCookie();
		String url = "http://study-perf.qa.netease.com/fgadmin/address/new";
		JSONObject address = new JSONObject();
	
		address.element("receiverName", "张三");
		address.element("cellPhone", "12345678901");
		address.element("addressDetail", "浙江大学");
		address.element("province","浙江省");
		address.element("city", "杭州市");
		address.element("area", 571);
		String result = HtmlUnit.doPostByCookie(url, address, cookie);
		System.out.println(result);
	}
	@Test
	public void addAdress_fail8() throws Exception {
		Set<Cookie> cookie = Common.getLoginCookie();
		String url = "http://study-perf.qa.netease.com/fgadmin/address/new";
		JSONObject address = new JSONObject();
	

		address.element("cellPhone", "12345678901");
		address.element("addressDetail", "浙江大学");
		address.element("province","浙江省");
		address.element("city", "杭州市");
		address.element("area", "滨江区");
		String result = HtmlUnit.doPostByCookie(url, address, cookie);
		System.out.println(result);
	}
	@Test
	public void addAdress_fail9() throws Exception {
		Set<Cookie> cookie = Common.getLoginCookie();
		String url = "http://study-perf.qa.netease.com/fgadmin/address/new";
		JSONObject address = new JSONObject();
	
		address.element("receiverName", "张三");

		address.element("addressDetail", "浙江大学");
		address.element("province","浙江省");
		address.element("city", "杭州市");
		address.element("area", "滨江区");
		String result = HtmlUnit.doPostByCookie(url, address, cookie);
		System.out.println(result);
	}
	@Test
	public void addAdress_fail10() throws Exception {
		Set<Cookie> cookie = Common.getLoginCookie();
		String url = "http://study-perf.qa.netease.com/fgadmin/address/new";
		JSONObject address = new JSONObject();
	
		address.element("receiverName", "张三");
		address.element("cellPhone", "12345678901");
		
		address.element("province","浙江省");
		address.element("city", "杭州市");
		address.element("area", "滨江区");
		String result = HtmlUnit.doPostByCookie(url, address, cookie);
		System.out.println(result);
	}
	@Test
	public void addAdress_fail11() throws Exception {
		Set<Cookie> cookie = Common.getLoginCookie();
		String url = "http://study-perf.qa.netease.com/fgadmin/address/new";
		JSONObject address = new JSONObject();

		address.element("receiverName", "张三");
		address.element("cellPhone", "12345678901");
		address.element("addressDetail", "浙江大学");

		address.element("city", "杭州市");
		address.element("area", "滨江区");
		String result = HtmlUnit.doPostByCookie(url, address, cookie);
		System.out.println(result);
	}
	@Test
	public void addAdress_fail12() throws Exception {
		Set<Cookie> cookie = Common.getLoginCookie();
		String url = "http://study-perf.qa.netease.com/fgadmin/address/new";
		JSONObject address = new JSONObject();

		address.element("receiverName", "张三");
		address.element("cellPhone", "12345678901");
		address.element("addressDetail", "浙江大学");
		address.element("province","浙江省");

		address.element("area", "滨江区");
		String result = HtmlUnit.doPostByCookie(url, address, cookie);
		System.out.println(result);
	}
	@Test
	public void addAdress_fail13() throws Exception {
		Set<Cookie> cookie = Common.getLoginCookie();
		String url = "http://study-perf.qa.netease.com/fgadmin/address/new";
		JSONObject address = new JSONObject();

		address.element("receiverName", "张三");
		address.element("cellPhone", "12345678901");
		address.element("addressDetail", "浙江大学");
		address.element("province","浙江省");
		address.element("city", "杭州市");

		String result = HtmlUnit.doPostByCookie(url, address, cookie);
		System.out.println(result);
	}
	@Test
	public void addAdress_success2() throws Exception {
		Set<Cookie> cookie = Common.getLoginCookie();
		String url = "http://study-perf.qa.netease.com/fgadmin/address/new";
		JSONObject address = new JSONObject();
		
		address.element("receiverName", "张三");
		address.element("cellPhone", "12345678901");
		address.element("addressDetail", "复旦大学");
		address.element("province","上海市");
		address.element("city", "上海市");
		address.element("area", "黄浦区");
		String result = HtmlUnit.doPostByCookie(url, address, cookie);
		System.out.println(result);
	}
	@Test
	public void addAdress_fail14() throws Exception {
		Set<Cookie> cookie = Common.getLoginCookie();
		String url = "http://study-perf.qa.netease.com/fgadmin/address/new";
		JSONObject address = new JSONObject();

		address.element("receiverName", "张三");
		address.element("cellPhone", "12345678901");
		address.element("addressDetail", "南京大学");
		address.element("province","江苏省");
		address.element("city", "南京市");
		address.element("area", "西湖区");
		String result = HtmlUnit.doPostByCookie(url, address, cookie);
		System.out.println(result);
	}
	@Test
	public void addAdress_fail15() throws Exception {
		Set<Cookie> cookie = Common.getLoginCookie();
		String url = "http://study-perf.qa.netease.com/fgadmin/address/new";
		JSONObject address = new JSONObject();

		address.element("receiverName", "张三");
		address.element("cellPhone", "12345678901");
		address.element("addressDetail", "南京大学");
		address.element("province","浙江省");
		address.element("city", "南京市");
		address.element("area", "西湖区");
		String result = HtmlUnit.doPostByCookie(url, address, cookie);
		System.out.println(result);
	}
	@Test
	public void addAdress_fail16() throws Exception {
		Set<Cookie> cookie = Common.getLoginCookie();
		String url = "http://study-perf.qa.netease.com/fgadmin/address/new";
		JSONObject address = new JSONObject();

		address.element("receiverName", "张三");
		address.element("cellPhone", "12345678901");
		address.element("addressDetail", "南京大学");
		address.element("province","江苏省");
		address.element("city", "杭州市");
		address.element("area", "西湖区");
		String result = HtmlUnit.doPostByCookie(url, address, cookie);
		System.out.println(result);
	}
	@Test
	public void addAdress_fail17() throws Exception {
		Set<Cookie> cookie = Common.getLoginCookie();
		String url = "http://study-perf.qa.netease.com/fgadmin/address/new";
		JSONObject address = new JSONObject();

		address.element("receiverName", "张三");
		address.element("cellPhone", "12345678901");
		address.element("addressDetail", "南京大学");
		address.element("province","安徽省");
		address.element("city", "南京市");
		address.element("area", "西湖区");
		String result = HtmlUnit.doPostByCookie(url, address, cookie);
		System.out.println(result);
	}
	@Test
	public void addAdress_fail18() throws Exception {
		Set<Cookie> cookie = Common.getLoginCookie();
		String url = "http://study-perf.qa.netease.com/fgadmin/address/new";
		JSONObject address = new JSONObject();

		address.element("receiverName", "张三");
		address.element("cellPhone", "12345678901");
		address.element("addressDetail", "浙江大学");
		address.element("province","浙江省");
		address.element("city", "杭州市");
		address.element("area", "滨江区");
		String result = HtmlUnit.doPostByCookie(url, address, cookie);
		System.out.println(result);
	}
	@Test
	public void addAdress_fail19() throws Exception {
		Set<Cookie> cookie = Common.getLoginCookie();
		String url = "http://study-perf.qa.netease.com/fgadmin/address/new";
		JSONObject address = new JSONObject();

		address.element("receiverName", "李四");
		address.element("cellPhone", "12345678902");
		address.element("addressDetail", "浙江工业大学");
		address.element("province","浙江省");
		address.element("city", "杭州市");
		address.element("area", "滨江区");
		String result = HtmlUnit.doPostByCookie(url, address, cookie);
		System.out.println(result);
	}
	@Test
	public void addAdress_fail20() throws Exception {
		Set<Cookie> cookie = Common.getLoginCookie();
		String url = "http://study-perf.qa.netease.com/fgadmin/address/new";
		JSONObject address = new JSONObject();

		address.element("receiverName", "");
		address.element("cellPhone", "12345678901");
		address.element("addressDetail", "浙江大学");
		address.element("province","浙江省");
		address.element("city", "杭州市");
		address.element("area", "滨江区");
		String result = HtmlUnit.doPostByCookie(url, address, cookie);
		System.out.println(result);
	}
	@Test
	public void addAdress_fail21() throws Exception {
		Set<Cookie> cookie = Common.getLoginCookie();
		String url = "http://study-perf.qa.netease.com/fgadmin/address/new";
		JSONObject address = new JSONObject();
	
		address.element("receiverName", "李四");
		address.element("cellPhone", "null");
		address.element("addressDetail", "浙江工业大学");
		address.element("province","浙江省");
		address.element("city", "杭州市");
		address.element("area", "滨江区");
		String result = HtmlUnit.doPostByCookie(url, address, cookie);
		System.out.println(result);
	}
}
