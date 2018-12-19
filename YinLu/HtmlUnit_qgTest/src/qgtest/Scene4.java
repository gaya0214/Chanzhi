package qgtest;

import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.util.Cookie;

import net.sf.json.JSONObject;

public class Scene4 {

//已登录，有收货地址
	@Test(priority=0)
	public void addresslist() throws Exception {
		Set<Cookie> cookie=Common.getLoginCookie();
		
		String result=HtmlUnit.doGetByCookie("http://study-perf.qa.netease.com/fgadmin/address/list",cookie);
		System.out.println(result);
		JSONObject json=JSONObject.fromObject(result);
		Assert.assertEquals(json.getString("message"), "success");
	}
	@Test(priority=1)
	public void fee() throws Exception {
		String url="http://study-perf.qa.netease.com/common/getTransportFee?id=1&addressDetail=浙江省_杭州市_滨江区";
		String result=HtmlUnit.doGet(url);
		System.out.println(result);
	}
	@Test(priority=2)
	public void submit() throws Exception {
		String url="http://study-perf.qa.netease.com/fgadmin/orders/submit";
		Set<Cookie> cookie=Common.getLoginCookie();
		JSONObject submit = new JSONObject();
		submit.element("skuIds", "2,3");
		submit.element("skuNumbers", "1,1");
		submit.element("stockIds", "74966312,74966313");
		submit.element("receiverName", "测试用户42");
		submit.element("cellPhone", "15868470172");
		submit.element("addressDetail", "网商路599");		
		submit.element("province", "浙江省");
		submit.element("city", "杭州市");
		submit.element("area", "滨江区");		
		submit.element("voiceStatus", 0);
		submit.element("needInvoice", 0);
		submit.element("invoiceHead","" );
		submit.element("transportFee", 0);
		submit.element("logisticsCompanyId", 1);
		submit.element("accessSource", "noSource");
		submit.element("accessDevice", 0);
		String result=HtmlUnit.doPostByCookie(url, submit, cookie);
		System.out.println(result);
	}
}
