package qgtest;

import org.testng.Assert;
import org.testng.annotations.Test;

import qgtest.HtmlUnit;


import net.sf.json.JSONObject;

public class SkuListTest {
	String url="http://study-perf.qa.netease.com";
	
	@Test
	public void skulist1() throws Exception {
		String result=HtmlUnit.doGet(url+"/common/skuList");
		System.out.println("skulist1"+result);

		JSONObject json=JSONObject.fromObject(result);
		Assert.assertEquals(json.getString("message"), "success");
	}
	
	@Test
	public void skulist2() throws Exception {
		String result = HtmlUnit.doGet(url+"/common/skuList","goodsId=1");
		System.out.println("skulist2"+result);

		JSONObject json=JSONObject.fromObject(result);
		Assert.assertEquals(json.getString("message"), "success");
	}
	
	@Test
	public void skulist3() throws Exception {
		String result = HtmlUnit.doGet(url+"/common/skuList","goodsId=2147483648");
		System.out.println("skulist3"+result);

		JSONObject json=JSONObject.fromObject(result);
		Assert.assertEquals(json.getString("code"), "200");
	}
	
	@Test
	public void skulist4() throws Exception {
		String result = HtmlUnit.doGet(url+"/common/skuList","goodsId=9999");
		System.out.println("skulist4"+result);

		JSONObject json=JSONObject.fromObject(result);
		Assert.assertEquals(json.getString("code"), "200");
	}
	
	@Test
	public void skulist5() throws Exception {
		String result = HtmlUnit.doGet(url+"/common/skuList","goodsId=\"'1'\"");
		System.out.println("skulist5"+result);

		JSONObject json=JSONObject.fromObject(result);
		Assert.assertEquals(json.getString("code"), "400");
	}
}
