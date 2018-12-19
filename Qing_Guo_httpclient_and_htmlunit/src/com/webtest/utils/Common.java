package com.webtest.utils;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.http.client.CookieStore;
import net.sf.json.JSONObject;

import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.util.Cookie;
import com.webtest.core.HtmlUnit;
public class Common {
	static Set<Cookie> cookie =null;
	public static Set<Cookie> getLoginCookie() throws IOException, Exception {
		
		JSONObject user = new JSONObject();
		String url=ReadPro.getProValue("url") + "/common/fgadmin/login";
		user.element("phoneArea", "86");
		user.element("phoneNumber", "20000000000");
		user.element("password", "netease123");
		cookie = HtmlUnit.doPostgetCookie(url,user);
		
		WebClient client = new WebClient();
		
		return cookie;
	}
}