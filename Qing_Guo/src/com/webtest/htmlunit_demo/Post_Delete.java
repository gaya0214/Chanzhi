package com.webtest.htmlunit_demo;

import java.io.IOException;
import java.util.Set;

import org.apache.http.client.CookieStore;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.util.Cookie;
import com.webtest.core.HtmlUnit;
import com.webtest.utils.ReadPro;
import com.webtest.utils.Common;

import net.sf.json.JSONObject;
/*作者：王得润*/
public class Post_Delete {
@Test
	public void deleteaddress_success() throws IOException, Exception{
	Set<Cookie> cookie = Common.getLoginCookie();
	JSONObject delete_id = new JSONObject();
	delete_id.element("id",82178900);
	String result = HtmlUnit.doPostByCookie(ReadPro.getProValue("url") + "/fgadmin/address/delete",delete_id, cookie);
	System.out.println(result);
}
@Test
public void deleteaddress_fail1() throws IOException, Exception{
Set<Cookie> cookie = Common.getLoginCookie();
JSONObject delete_id = new JSONObject();
delete_id.element("id",821789);
String result = HtmlUnit.doPostByCookie(ReadPro.getProValue("url") + "/fgadmin/address/delete",delete_id, cookie);
System.out.println(result);
}

}
