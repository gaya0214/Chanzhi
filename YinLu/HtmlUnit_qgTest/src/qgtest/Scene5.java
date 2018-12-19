package qgtest;

import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.util.Cookie;

import net.sf.json.JSONObject;

public class Scene5 {
//未登录，无收货地址
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

		String result=HtmlUnit.doGet("http://study-perf.qa.netease.com/fgadmin/address/list");
		System.out.println(result);
		JSONObject json=JSONObject.fromObject(result);
		Assert.assertEquals(json.getString("message"), "success");
		
	}
	@Test(priority=2)
	public void addressnew() throws Exception {
		String url="http://study-perf.qa.netease.com/fgadmin/address/new";

		JSONObject address = new JSONObject();
		address.element("receiverName", "李四");
		address.element("cellPhone", "20000000004");
		address.element("addressDetail", "南京大学");
		address.element("province", "江苏省");
		address.element("city", "南京市");
		address.element("area", "鼓楼区");
		String result=HtmlUnit.doPost(url, address);	
		System.out.println(result);
	}
	@Test(priority=3)
	public void fee() throws Exception{
		String url="http://study-perf.qa.netease.com/common/getTransportFee?id=1&addressDetail=江苏省_南京市_鼓楼区";
		String result=HtmlUnit.doGet(url);
		System.out.println(result);
	}
	@Test(priority=4)
	public void submit() throws Exception {
		String url="http://study-perf.qa.netease.com/fgadmin/orders/submit";
		JSONObject submit = new JSONObject();
		submit.element("skuIds", "1");
		submit.element("receiverName", "李四");
		submit.element("cellPhone", "20000000004");
		submit.element("addressDetail", "南京大学");		
		submit.element("province", "江苏省");
		submit.element("city", "南京市");
		submit.element("area", "鼓楼区");		
		submit.element("transportFee", 7.0);

		String result=HtmlUnit.doPost(url, submit);
		System.out.println(result);
	}
}
