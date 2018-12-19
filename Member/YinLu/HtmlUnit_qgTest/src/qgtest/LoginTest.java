package qgtest;

import java.util.Set;

import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.util.Cookie;

import qgtest.HtmlUnit;


import net.sf.json.JSONObject;

public class LoginTest {

	@Test
	public void login_success() throws Exception{
		String url="http://study-perf.qa.netease.com/common/fgadmin/login";
		JSONObject login = new JSONObject();
		login.element("password", "netease123");
		login.element("phoneArea", "86");
		login.element("phoneNumber", "200000000042");
		String result=HtmlUnit.doPost(url, login);
		System.out.println("login_success"+result);

	}
	
	@Test
	public void login_fail1() throws Exception {
		String url="http://study-perf.qa.netease.com/common/fgadmin/login";
		JSONObject login = new JSONObject();
		login.element("password", "netease123");
		login.element("phoneArea", 86);
		login.element("phoneNumber", "200000000042");
		String result=HtmlUnit.doPost(url, login);
		System.out.println("login_fail1"+result);
	}
	
	@Test
	public void login_fail2() throws Exception {
		String url="http://study-perf.qa.netease.com/common/fgadmin/login";
		JSONObject login = new JSONObject();
		login.element("password", "netease123");
		login.element("phoneArea", "86");
		login.element("phoneNumber", 200000000042.0);
		String result=HtmlUnit.doPost(url, login);
		System.out.println("login_fail2"+result);
	}
	
	@Test
	public void login_fail3() throws Exception {
		String url="http://study-perf.qa.netease.com/common/fgadmin/login";
		JSONObject login = new JSONObject();
		login.element("password", 123456);
		login.element("phoneArea", "86");
		login.element("phoneNumber", "200000000042");
		String result=HtmlUnit.doPost(url, login);
		System.out.println("login_fail3"+result);
	}
	
	@Test
	public void login_fail4() throws Exception {
		String url="http://study-perf.qa.netease.com/common/fgadmin/login";
		JSONObject login = new JSONObject();
		login.element("password", "netease123");
		login.element("phoneNumber", "200000000042");
		String result=HtmlUnit.doPost(url, login);
		System.out.println("login_fail4"+result);
	}
	
	@Test
	public void login_fail5() throws Exception {
		String url="http://study-perf.qa.netease.com/common/fgadmin/login";
		JSONObject login = new JSONObject();
		login.element("password", "netease123");
		login.element("phoneArea", "86");
		String result=HtmlUnit.doPost(url, login);
		System.out.println("login_fail5"+result);
	}
	
	@Test
	public void login_fail6() throws Exception {
		String url="http://study-perf.qa.netease.com/common/fgadmin/login";
		JSONObject login = new JSONObject();
		login.element("phoneArea", "86");
		login.element("phoneNumber", "200000000042");
		String result=HtmlUnit.doPost(url, login);
		System.out.println("login_fail6"+result);
	}
	
	@Test
	public void login_fail7() throws Exception {
		String url="http://study-perf.qa.netease.com/common/fgadmin/login";
		JSONObject login = new JSONObject();
		login.element("password", "netease123");
		login.element("phoneArea", "86");
		login.element("phoneNumber", "123456789012");
		String result=HtmlUnit.doPost(url, login);
		System.out.println("login_fail7"+result);
	}
	
	@Test
	public void login_fail8() throws Exception{
		String url="http://study-perf.qa.netease.com/common/fgadmin/login";
		JSONObject login = new JSONObject();
		login.element("password", "wrong");
		login.element("phoneArea", "86");
		login.element("phoneNumber", "200000000042");
		String result=HtmlUnit.doPost(url, login);
		System.out.println("login_fail8"+result);
	}
	
	@Test
	public void login_fail9() throws Exception{
		String url="http://study-perf.qa.netease.com/common/fgadmin/login";
		JSONObject login = new JSONObject();
		login.element("password", "netease123");
		login.element("phoneArea", "86");
		login.element("phoneNumber", "10086");
		String result=HtmlUnit.doPost(url, login);
		System.out.println("login_fail9"+result);
	}
}
