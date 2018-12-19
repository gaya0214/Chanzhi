package qgtest;

import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.util.Cookie;

import qgtest.HtmlUnit;
import net.sf.json.JSONObject;

public class AddressListTest {
	String url="http://study-perf.qa.netease.com";

	@Test
	public void addresslist1() throws Exception{

		Set<Cookie> cookie=Common.getLoginCookie();
		
		String result=HtmlUnit.doGetByCookie(url+"/fgadmin/address/list",cookie);
		System.out.println(result);
		JSONObject json=JSONObject.fromObject(result);
		Assert.assertEquals(json.getString("message"), "success");
	}
	
}
