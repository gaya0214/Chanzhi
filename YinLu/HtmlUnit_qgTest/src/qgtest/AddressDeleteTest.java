package qgtest;

import java.util.Set;

import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.util.Cookie;

import net.sf.json.JSONObject;

public class AddressDeleteTest {
	String url="http://study-perf.qa.netease.com/fgadmin/address/delete";
	@Test
	public void delete1() throws Exception {
		Set<Cookie> cookie=Common.getLoginCookie();

		JSONObject delete=new JSONObject();
		delete.element("id", "82179406");
		String result=HtmlUnit.doPostByCookie(url, delete, cookie);
		System.out.println(result);
	}
	@Test
	public void delete2() throws Exception {
		Set<Cookie> cookie=Common.getLoginCookie();

		JSONObject delete=new JSONObject();
		delete.element("id", "82179405");
		String result=HtmlUnit.doPostByCookie(url, delete, cookie);
		System.out.println(result);
	}
	@Test
	public void delete3() throws Exception {
		Set<Cookie> cookie=Common.getLoginCookie();

		JSONObject delete=new JSONObject();
		delete.element("id", 82179406);
		String result=HtmlUnit.doPostByCookie(url, delete, cookie);
		System.out.println(result);
	}
	@Test
	public void delete4() throws Exception {
		JSONObject delete=new JSONObject();
		delete.element("id", 82179406);
		String result=HtmlUnit.doPost(url, delete);
		System.out.println(result);
	}
}
