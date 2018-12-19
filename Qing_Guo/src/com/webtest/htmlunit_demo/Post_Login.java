package com.webtest.htmlunit_demo;

import java.io.IOException;

import org.testng.annotations.Test;

import com.webtest.core.HtmlUnit;
import com.webtest.utils.ReadPro;

import net.sf.json.JSONObject;
/*×÷Õß£ºÁõç÷*/
public class Post_Login {
	@Test
	public void login_success() throws IOException, Exception {
		JSONObject user = new JSONObject();
		user.element("phoneArea", "86");
		user.element("phoneNumber", "20000000000");
		user.element("password", "netease123");
		String result = HtmlUnit.doPost(ReadPro.getProValue("url") + "/common/fgadmin/login",user);
		System.out.println(result);
	}
	@Test
	public void login_fail1() throws IOException, Exception {
		JSONObject user = new JSONObject();
		user.element("phoneArea", 86);
		user.element("phoneNumber", "20000000000");
		user.element("password", "netease123");
		String result = HtmlUnit.doPost(ReadPro.getProValue("url") + "/common/fgadmin/login", user);
		System.out.println(result);
	}
	@Test
	public void login_fail2() throws IOException, Exception {
		JSONObject user = new JSONObject();
		user.element("phoneArea", "86");
		user.element("phoneNumber", "20");
		user.element("password", "netease123");
		String result = HtmlUnit.doPost(ReadPro.getProValue("url") + "/common/fgadmin/login", user);
		System.out.println(result);
	}
	@Test
	public void login_fail3() throws IOException, Exception {
		JSONObject user = new JSONObject();
		user.element("phoneArea", 86);
		user.element("phoneNumber", "20000000000");
		user.element("password", "123");
		String result = HtmlUnit.doPost(ReadPro.getProValue("url") + "/common/fgadmin/login", user);
		System.out.println(result);
	}
	@Test
	public void login_fail4() throws IOException, Exception {
		JSONObject user = new JSONObject();	
		user.element("phoneNumber", "20000000000");
		user.element("password", "netease123");
		String result = HtmlUnit.doPost(ReadPro.getProValue("url") + "/common/fgadmin/login", user);
		System.out.println(result);
	}
	@Test
	public void login_fail5() throws IOException, Exception {
		JSONObject user = new JSONObject();
		user.element("phoneArea", "86");
		
		user.element("password", "netease123");
		String result = HtmlUnit.doPost(ReadPro.getProValue("url") + "/common/fgadmin/login", user);
		System.out.println(result);
	}
	@Test
	public void login_fail6() throws IOException, Exception {
		JSONObject user = new JSONObject();
		user.element("phoneArea", "86");
		user.element("phoneNumber", "20000000000");
		
		String result = HtmlUnit.doPost(ReadPro.getProValue("url") + "/common/fgadmin/login", user);
		System.out.println(result);
	}
	@Test
	public void login_fail7() throws IOException, Exception {
		JSONObject user = new JSONObject();
		user.element("phoneArea", "86");
		user.element("phoneNumber", "200000000000000");
		user.element("password", "netease123");
		String result = HtmlUnit.doPost(ReadPro.getProValue("url") + "/common/fgadmin/login", user);
		System.out.println(result);
	}
	@Test
	public void login_fail8() throws IOException, Exception {
		JSONObject user = new JSONObject();
		user.element("phoneArea", "86");
		user.element("phoneNumber", "20000000000");
		user.element("password", "netease");
		String result = HtmlUnit.doPost(ReadPro.getProValue("url") + "/common/fgadmin/login", user);
		System.out.println(result);
	}
	@Test
	public void login_fail9() throws IOException, Exception {
		JSONObject user = new JSONObject();
		user.element("phoneArea", "86");
		user.element("phoneNumber", "10086");
		user.element("password", "netease123");
		String result = HtmlUnit.doPost(ReadPro.getProValue("url") + "/common/fgadmin/login", user);
		System.out.println(result);
	}
}
