package com.webtest.htmlunit_demo;

import java.util.Set;

import org.apache.http.client.CookieStore;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.util.Cookie;
import com.webtest.core.HtmlUnit;
import com.webtest.utils.Common;

import net.sf.json.JSONObject;

public class Post_login_test {
	@Test
	public void addAdress_success() throws Exception {
		Set<Cookie> cookie = Common.getLoginCookie();
		String url = "http://study-perf.qa.netease.common/fgadmin/login";
		JSONObject login = new JSONObject();
		login.element("phoneArea", "86");
		login.element("phoneNumber", "20000000000");
		login.element("password", "netease123");
		String result = HtmlUnit.doPostByCookie(url, login, cookie);
		System.out.println(result);
	}
	@Test
//	登录失败，phoneArea参数类型不正确

	public void addAdress_fail() throws Exception {
		Set<Cookie> cookie = Common.getLoginCookie();
		String url = "http://study-perf.qa.netease.common/fgadmin/login";//com/fgadmin/checkLogin
		JSONObject login = new JSONObject();
		login.element("phoneArea", "12");
		login.element("phoneNumber", "20000000000");
		login.element("password", "netease123");
		String result = HtmlUnit.doPostByCookie(url, login, cookie);
		System.out.println(result);
	}
	@Test
//	登录失败，phoneNumber参数类型不正确

	public void addAdress_fail2() throws Exception {
		Set<Cookie> cookie = Common.getLoginCookie();
		String url = "http://study-perf.qa.netease.common/fgadmin/login";
		JSONObject login = new JSONObject();
		login.element("phoneArea", "86");
		login.element("phoneNumber", "20000000001");
		login.element("password", "netease123");
		String result = HtmlUnit.doPostByCookie(url, login, cookie);
		System.out.println(result);
	}
	@Test
//	登录失败，password参数类型不正确

	public void addAdress_fail3() throws Exception {
		Set<Cookie> cookie = Common.getLoginCookie();
		String url = "http://study-perf.qa.netease.common/fgadmin/login";
		JSONObject login = new JSONObject();
		login.element("phoneArea", "86");
		login.element("phoneNumber", "20000000000");
		login.element("password", "123456");
		String result = HtmlUnit.doPostByCookie(url, login, cookie);
		System.out.println(result);
	}
	@Test
//	登录失败，缺少phoneArea参数

	public void addAdress_fail4() throws Exception {
		Set<Cookie> cookie = Common.getLoginCookie();
		String url = "http://study-perf.qa.netease.common/fgadmin/login";
		JSONObject login = new JSONObject();
		
		login.element("phoneNumber", "20000000000");
		login.element("password", "netease123");
		String result = HtmlUnit.doPostByCookie(url, login, cookie);
		System.out.println(result);
	}
	@Test
//	登录失败，缺少phoneNumber参数

	public void addAdress_fail5() throws Exception {
		Set<Cookie> cookie = Common.getLoginCookie();
		String url = "http://study-perf.qa.netease.common/fgadmin/login";
		JSONObject login = new JSONObject();
		login.element("phoneArea", "86");
		
		login.element("password", "netease123");
		String result = HtmlUnit.doPostByCookie(url, login, cookie);
		System.out.println(result);
	}
	@Test
//	登录失败，缺少password参数

	public void addAdress_fail6() throws Exception {
		Set<Cookie> cookie = Common.getLoginCookie();
		String url = "http://study-perf.qa.netease.common/fgadmin/login";
		JSONObject login = new JSONObject();
		login.element("phoneArea", "86");
		login.element("phoneNumber", "20000000000");
		
		String result = HtmlUnit.doPostByCookie(url, login, cookie);
		System.out.println(result);
	}
	@Test
//	登录失败，电话号码超过11位

	public void addAdress_fail7() throws Exception {
		Set<Cookie> cookie = Common.getLoginCookie();
		String url = "http://study-perf.qa.netease.common/fgadmin/login";
		JSONObject login = new JSONObject();
		login.element("phoneArea", "86");
		login.element("phoneNumber", "123456789012");
		login.element("password", "netease123");
		String result = HtmlUnit.doPostByCookie(url, login, cookie);
		System.out.println(result);
	}
	@Test
//	登录失败，密码错误

	public void addAdress_fail8() throws Exception {
		Set<Cookie> cookie = Common.getLoginCookie();
		String url = "http://study-perf.qa.netease.common/fgadmin/login";
		JSONObject login = new JSONObject();
		login.element("phoneArea", "86");
		login.element("phoneNumber", "20000000000");
		login.element("password", "wrong");
		String result = HtmlUnit.doPostByCookie(url, login, cookie);
		System.out.println(result);
	}
	@Test
//	登录失败，用户不存在

	public void addAdress_fail9() throws Exception {
		Set<Cookie> cookie = Common.getLoginCookie();
		String url = "http://study-perf.qa.netease.common/fgadmin/login";
		JSONObject login = new JSONObject();
		login.element("phoneArea", "86");
		login.element("phoneNumber", "10086");
		login.element("password", "netease123");
		String result = HtmlUnit.doPostByCookie(url, login, cookie);
		System.out.println(result);
	}
	
}