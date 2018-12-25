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
	//1登录成功
	public void login_success() throws Exception {
		String url = "http://study-perf.qa.netease.com/common/fgadmin/login";
		JSONObject address = new JSONObject();
		address.element("phoneArea", "86");
		address.element("phoneNumber", "20000000000");
		address.element("password", "netease123");
		
		String result = HtmlUnit.doPost(url, address);
		System.out.println(result);
	}
	@Test
	//2登录失败，phoneArea参数类型不正确
	public void login_fail1() throws Exception {
		String url = "http://study-perf.qa.netease.com/common/fgadmin/login";
		JSONObject address = new JSONObject();
		address.element("phoneArea", "xx");
		address.element("phoneNumber", "20000000000");
		address.element("password", "netease123");
		
		String result = HtmlUnit.doPost(url, address);
		System.out.println(result);
	}
	@Test
	//3登录失败，phoneNumber参数类型不正确
	public void login_fail2() throws Exception {
		String url = "http://study-perf.qa.netease.com/common/fgadmin/login";
		JSONObject address = new JSONObject();
		address.element("phoneArea", "86");
		address.element("phoneNumber", "20000");
		address.element("password", "netease123");
		
		String result = HtmlUnit.doPost(url, address);
		System.out.println(result);
	}
	@Test
	//4登录失败，password参数类型不正确
	public void login_fail3() throws Exception {
		String url = "http://study-perf.qa.netease.com/common/fgadmin/login";
		JSONObject address = new JSONObject();
		address.element("phoneArea", "86");
		address.element("phoneNumber", "20000000000");
		address.element("password", "~");
		
		String result = HtmlUnit.doPost(url, address);
		System.out.println(result);
	}
	@Test
	//5登录失败，缺少phoneArea参数
		public void login_fail4() throws Exception {
			String url = "http://study-perf.qa.netease.com/common/fgadmin/login";
			JSONObject address = new JSONObject();
			//address.element("phoneArea", "86");
			address.element("phoneNumber", "20000000000");
			address.element("password", "netease123");
			
			String result = HtmlUnit.doPost(url, address);
			System.out.println(result);
		}
		
	@Test
	//6登录失败，缺少phoneNumber参数
		public void login_fail5() throws Exception {
			String url = "http://study-perf.qa.netease.com/common/fgadmin/login";
			JSONObject address = new JSONObject();
			address.element("phoneArea", "86");
			//address.element("phoneNumber", "20000000000");
			address.element("password", "netease123");
			
			String result = HtmlUnit.doPost(url, address);
			System.out.println(result);
		}
	@Test
	//7登录失败，缺少password参数
		public void login_fail6() throws Exception {
			String url = "http://study-perf.qa.netease.com/common/fgadmin/login";
			JSONObject address = new JSONObject();
			address.element("phoneArea", "86");
			address.element("phoneNumber", "20000000000");
			//address.element("password", "netease123");
			
			String result = HtmlUnit.doPost(url, address);
			System.out.println(result);
		}
	@Test
	//8登录失败，用户不存在
		public void login_fail7() throws Exception {
			String url = "http://study-perf.qa.netease.com/common/fgadmin/login";
			JSONObject address = new JSONObject();
			address.element("phoneArea", "86");
			address.element("phoneNumber", "10086");
			address.element("password", "netease123");
			
			String result = HtmlUnit.doPost(url, address);
			System.out.println(result);
		}
		
}