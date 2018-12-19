package qgtest;

import java.io.IOException;
import java.util.Set;

import org.apache.http.client.CookieStore;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.util.Cookie;

import qgtest.HtmlUnit;


import net.sf.json.JSONObject;

public class Common {
	
	@Test
	public static Set<Cookie> getLoginCookie() throws Exception {
		JSONObject login = new JSONObject();
		login.element("phoneArea", "86");
		login.element("phoneNumber", "200000000042");
		login.element("password", "netease123");

		Set<Cookie> cookie =HtmlUnit.doPostgetCookie("http://study-perf.qa.netease.com/common/fgadmin/login", login);
		return cookie;
	}
	@Test
	public static Set<Cookie> getLoginCookie1() throws Exception {
		JSONObject login = new JSONObject();
		login.element("phoneArea", "86");
		login.element("phoneNumber", "200000000055");
		login.element("password", "netease123");

		Set<Cookie> cookie =HtmlUnit.doPostgetCookie("http://study-perf.qa.netease.com/common/fgadmin/login", login);
		return cookie;
	}
}
