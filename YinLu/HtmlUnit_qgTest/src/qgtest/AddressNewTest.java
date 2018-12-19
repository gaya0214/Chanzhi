package qgtest;

import java.util.Set;

import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.util.Cookie;

import net.sf.json.JSONObject;

public class AddressNewTest {
	String url="http://study-perf.qa.netease.com/fgadmin/address/new";
	@Test
	public void addressnew1() throws Exception {
		Set<Cookie> cookie=Common.getLoginCookie();

		JSONObject address = new JSONObject();
		address.element("receiverName", "张三");
		address.element("cellPhone", "12345678901");
		address.element("addressDetail", "浙江大学");
		address.element("province", "浙江省");
		address.element("city", "杭州市");
		address.element("area", "滨江区");
		String result=HtmlUnit.doPostByCookie(url, address,cookie);	
		System.out.println(result);
	}
	@Test
	public void addressnew2() throws Exception {
		Set<Cookie> cookie=Common.getLoginCookie();

		JSONObject address = new JSONObject();
		address.element("receiverName", 123);
		address.element("cellPhone", "12345678901");
		address.element("addressDetail", "浙江大学");
		address.element("province", "浙江省");
		address.element("city", "杭州市");
		address.element("area", "滨江区");
		String result=HtmlUnit.doPostByCookie(url, address,cookie);	
		System.out.println(result);
	}
	@Test
	public void addressnew3() throws Exception {
		Set<Cookie> cookie=Common.getLoginCookie();

		JSONObject address = new JSONObject();
		address.element("receiverName", "张三");
		address.element("cellPhone", 12345678901.0);
		address.element("addressDetail", "浙江大学");
		address.element("province", "浙江省");
		address.element("city", "杭州市");
		address.element("area", "滨江区");
		String result=HtmlUnit.doPostByCookie(url, address,cookie);	
		System.out.println(result);
	}
	@Test
	public void addressnew4() throws Exception {
		Set<Cookie> cookie=Common.getLoginCookie();

		JSONObject address = new JSONObject();
		address.element("receiverName", "张三");
		address.element("cellPhone", "12345678901");
		address.element("addressDetail", 123);
		address.element("province", "浙江省");
		address.element("city", "杭州市");
		address.element("area", "滨江区");
		String result=HtmlUnit.doPostByCookie(url, address,cookie);	
		System.out.println(result);
	}
	@Test
	public void addressnew5() throws Exception {
		Set<Cookie> cookie=Common.getLoginCookie();

		JSONObject address = new JSONObject();
		address.element("receiverName", "张三");
		address.element("cellPhone", "12345678901");
		address.element("addressDetail", "浙江大学");
		address.element("province", 571);
		address.element("city", "杭州市");
		address.element("area", "滨江区");
		String result=HtmlUnit.doPostByCookie(url, address,cookie);	
		System.out.println(result);
	}
	@Test
	public void addressnew6() throws Exception {
		Set<Cookie> cookie=Common.getLoginCookie();

		JSONObject address = new JSONObject();
		address.element("receiverName", "张三");
		address.element("cellPhone", "12345678901");
		address.element("addressDetail", "浙江大学");
		address.element("province", "浙江省");
		address.element("city", 571);
		address.element("area", "滨江区");
		String result=HtmlUnit.doPostByCookie(url, address,cookie);	
		System.out.println(result);
	}
	@Test
	public void addressnew7() throws Exception {
		Set<Cookie> cookie=Common.getLoginCookie();

		JSONObject address = new JSONObject();
		address.element("receiverName", "张三");
		address.element("cellPhone", "12345678901");
		address.element("addressDetail", "浙江大学");
		address.element("province", "浙江省");
		address.element("city", "杭州市");
		address.element("area", 571);
		String result=HtmlUnit.doPostByCookie(url, address,cookie);	
		System.out.println(result);
	}
	@Test
	public void addressnew8() throws Exception {
		Set<Cookie> cookie=Common.getLoginCookie();

		JSONObject address = new JSONObject();
		address.element("cellPhone", "12345678901");
		address.element("addressDetail", "浙江大学");
		address.element("province", "浙江省");
		address.element("city", "杭州市");
		address.element("area", "滨江区");
		String result=HtmlUnit.doPostByCookie(url, address,cookie);	
		System.out.println(result);
	}
	@Test
	public void addressnew9() throws Exception {
		Set<Cookie> cookie=Common.getLoginCookie();

		JSONObject address = new JSONObject();
		address.element("receiverName", "张三");
		address.element("addressDetail", "浙江大学");
		address.element("province", "浙江省");
		address.element("city", "杭州市");
		address.element("area", "滨江区");
		String result=HtmlUnit.doPostByCookie(url, address,cookie);	
		System.out.println(result);
	}
	@Test
	public void addressnew10() throws Exception {
		Set<Cookie> cookie=Common.getLoginCookie();

		JSONObject address = new JSONObject();
		address.element("receiverName", "张三");
		address.element("cellPhone", "12345678901");
		address.element("province", "浙江省");
		address.element("city", "杭州市");
		address.element("area", "滨江区");
		String result=HtmlUnit.doPostByCookie(url, address,cookie);	
		System.out.println(result);
	}
	@Test
	public void addressnew11() throws Exception {
		Set<Cookie> cookie=Common.getLoginCookie();

		JSONObject address = new JSONObject();
		address.element("receiverName", "张三");
		address.element("cellPhone", "12345678901");
		address.element("addressDetail", "浙江大学");
		address.element("city", "杭州市");
		address.element("area", "滨江区");
		String result=HtmlUnit.doPostByCookie(url, address,cookie);	
		System.out.println(result);
	}
	@Test
	public void addressnew12() throws Exception {
		Set<Cookie> cookie=Common.getLoginCookie();

		JSONObject address = new JSONObject();
		address.element("receiverName", "张三");
		address.element("cellPhone", "12345678901");
		address.element("addressDetail", "浙江大学");
		address.element("province", "浙江省");
		address.element("area", "滨江区");
		String result=HtmlUnit.doPostByCookie(url, address,cookie);	
		System.out.println(result);
	}
	@Test
	public void addressnew13() throws Exception {
		Set<Cookie> cookie=Common.getLoginCookie();

		JSONObject address = new JSONObject();
		address.element("receiverName", "张三");
		address.element("cellPhone", "12345678901");
		address.element("addressDetail", "浙江大学");
		address.element("province", "浙江省");
		address.element("city", "杭州市");
		String result=HtmlUnit.doPostByCookie(url, address,cookie);	
		System.out.println(result);
	}
	@Test
	public void addressnew14() throws Exception {
		Set<Cookie> cookie=Common.getLoginCookie();

		JSONObject address = new JSONObject();
		address.element("receiverName", "张三");
		address.element("cellPhone", "12345678901");
		address.element("addressDetail", "复旦大学");
		address.element("province", "上海市");
		address.element("city", "上海区");
		address.element("area", "黄浦区");
		String result=HtmlUnit.doPostByCookie(url, address,cookie);	
		System.out.println(result);
	}
	@Test
	public void addressnew15() throws Exception {
		Set<Cookie> cookie=Common.getLoginCookie();

		JSONObject address = new JSONObject();
		address.element("receiverName", "张三");
		address.element("cellPhone", "12345678901");
		address.element("addressDetail", "南京大学");
		address.element("province", "江苏省");
		address.element("city", "南京市");
		address.element("area", "西湖区");
		String result=HtmlUnit.doPostByCookie(url, address,cookie);	
		System.out.println(result);
	}
	@Test
	public void addressnew16() throws Exception {
		Set<Cookie> cookie=Common.getLoginCookie();

		JSONObject address = new JSONObject();
		address.element("receiverName", "张三");
		address.element("cellPhone", "12345678901");
		address.element("addressDetail", "南京大学");
		address.element("province", "浙江省");
		address.element("city", "南京市");
		address.element("area", "西湖区");
		String result=HtmlUnit.doPostByCookie(url, address,cookie);	
		System.out.println(result);
	}
	@Test
	public void addressnew17() throws Exception {
		Set<Cookie> cookie=Common.getLoginCookie();

		JSONObject address = new JSONObject();
		address.element("receiverName", "张三");
		address.element("cellPhone", "12345678901");
		address.element("addressDetail", "南京大学");
		address.element("province", "江苏省");
		address.element("city", "杭州市");
		address.element("area", "西湖区");
		String result=HtmlUnit.doPostByCookie(url, address,cookie);	
		System.out.println(result);
	}
	@Test
	public void addressnew18() throws Exception {
		Set<Cookie> cookie=Common.getLoginCookie();

		JSONObject address = new JSONObject();
		address.element("receiverName", "张三");
		address.element("cellPhone", "12345678901");
		address.element("addressDetail", "南京大圩");
		address.element("province", "安徽省");
		address.element("city", "南京区");
		address.element("area", "西湖区");
		String result=HtmlUnit.doPostByCookie(url, address,cookie);	
		System.out.println(result);
	}
	@Test
	public void addressnew19() throws Exception {
		Set<Cookie> cookie=Common.getLoginCookie();

		JSONObject address = new JSONObject();
		address.element("receiverName", "张三");
		address.element("cellPhone", "12345678901");
		address.element("addressDetail", "浙江大学");
		address.element("province", "浙江省");
		address.element("city", "杭州市");
		address.element("area", "滨江区");
		String result=HtmlUnit.doPostByCookie(url, address,cookie);	
		System.out.println(result);
	}
	@Test
	public void addressnew20() throws Exception {
		Set<Cookie> cookie=Common.getLoginCookie();

		JSONObject address = new JSONObject();
		address.element("receiverName", "李四");
		address.element("cellPhone", "12345678901");
		address.element("addressDetail", "浙江工业大学");
		address.element("province", "浙江省");
		address.element("city", "杭州市");
		address.element("area", "滨江区");
		String result=HtmlUnit.doPostByCookie(url, address,cookie);	
		System.out.println(result);
	}
	@Test
	public void addressnew21() throws Exception {
		//未登录
		JSONObject address = new JSONObject();
		address.element("receiverName", "张三");
		address.element("cellPhone", "12345678901");
		address.element("addressDetail", "浙江大学");
		address.element("province", "浙江省");
		address.element("city", "杭州区");
		address.element("area", "滨江区");
		String result=HtmlUnit.doPost(url, address);	
		System.out.println(result);
	}
	@Test
	public void addressnew22() throws Exception {
		Set<Cookie> cookie=Common.getLoginCookie();

		JSONObject address = new JSONObject();
		address.element("receiverName", "");
		address.element("cellPhone", "12345678901");
		address.element("addressDetail", "浙江大学");
		address.element("province", "浙江省");
		address.element("city", "杭州市");
		address.element("area", "滨江区");
		String result=HtmlUnit.doPostByCookie(url, address,cookie);	
		System.out.println(result);
	}
	@Test
	public void addressnew23() throws Exception {
		Set<Cookie> cookie=Common.getLoginCookie();

		JSONObject address = new JSONObject();
		address.element("receiverName", "张三");
		address.element("cellPhone", "null");
		address.element("addressDetail", "浙江大学");
		address.element("province", "浙江省");
		address.element("city", "杭州区");
		address.element("area", "滨江区");
		String result=HtmlUnit.doPostByCookie(url, address,cookie);	
		System.out.println(result);
	}

}
