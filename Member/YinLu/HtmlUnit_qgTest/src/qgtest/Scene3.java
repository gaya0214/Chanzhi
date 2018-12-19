package qgtest;

import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.util.Cookie;

import net.sf.json.JSONObject;

public class Scene3 {
//已登录，无收货地址
	@Test(priority=0)
	public void login() throws Exception {
		String url="http://study-perf.qa.netease.com/common/fgadmin/login";
		JSONObject login = new JSONObject();
		login.element("password", "netease123");
		login.element("phoneArea", "86");
		login.element("phoneNumber", "200000000055");
		String result=HtmlUnit.doPost(url, login);
		System.out.println("login_success"+result);
	}
	
	@Test(priority=1)
	public void addresslist() throws Exception {
		Set<Cookie> cookie=Common.getLoginCookie1();
		
		String result=HtmlUnit.doGetByCookie("http://study-perf.qa.netease.com/fgadmin/address/list",cookie);
		System.out.println(result);
		JSONObject json=JSONObject.fromObject(result);
		Assert.assertEquals(json.getString("message"), "success");
	}
	
	@Test(priority=2)
	public void addressnew() throws Exception {
		String url="http://study-perf.qa.netease.com/fgadmin/address/new";
		Set<Cookie> cookie=Common.getLoginCookie1();

		JSONObject address = new JSONObject();
		address.element("receiverName", "李四");
		address.element("cellPhone", "12345678901");
		address.element("addressDetail", "南京大学");
		address.element("province", "江苏省");
		address.element("city", "南京市");
		address.element("area", "鼓楼区");
		String result=HtmlUnit.doPostByCookie(url, address,cookie);	
		System.out.println(result);
	}
	
	@Test(priority=3)
	public void fee() throws Exception {
		String url="http://study-perf.qa.netease.com/common/getTransportFee?id=1&addressDetail=江苏省_南京市_鼓楼区";
		String result=HtmlUnit.doGet(url);
		System.out.println(result);

	}
	
	@Test(priority=4)
	public void submit() throws Exception {
		String url="http://study-perf.qa.netease.com/fgadmin/orders/submit";
		Set<Cookie> cookie=Common.getLoginCookie1();
		JSONObject submit = new JSONObject();
		submit.element("skuIds", "1");
		submit.element("receiverName", "20000000004");
		submit.element("cellPhone", "15868470172");
		submit.element("addressDetail", "南京大学");		
		submit.element("province", "江苏省");
		submit.element("city", "南京市");
		submit.element("area", "鼓楼区");		
		submit.element("transportFee", "7.0");
		String result=HtmlUnit.doPostByCookie(url, submit, cookie);
		System.out.println(result);
	}
}
