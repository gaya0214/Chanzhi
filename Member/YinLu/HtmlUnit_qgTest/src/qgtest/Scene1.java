package qgtest;

import org.testng.Assert;
import org.testng.annotations.Test;

import net.sf.json.JSONObject;

public class Scene1 {
	String url="http://study-perf.qa.netease.com";

	@Test
	public void skulist() throws Exception {
		String result=HtmlUnit.doGet(url+"/common/skuList");
		System.out.println("skulist1"+result);

		JSONObject json=JSONObject.fromObject(result);
		Assert.assertEquals(json.getString("message"), "success");
	}
	@Test
	public void skulist1() throws Exception {
		String result=HtmlUnit.doGet(url+"/common/skuList","goodsId=1");
		System.out.println("skulist1"+result);

		JSONObject json=JSONObject.fromObject(result);
		Assert.assertEquals(json.getString("message"), "success");
	}
	@Test
	public void skulist2() throws Exception {
		String result=HtmlUnit.doGet(url+"/common/skuList","goodsId=2");
		System.out.println("skulist1"+result);

		JSONObject json=JSONObject.fromObject(result);
		Assert.assertEquals(json.getString("message"), "success");
	}
	@Test
	public void skulist3() throws Exception {
		String result=HtmlUnit.doGet(url+"/common/skuList","goodsId=3");
		System.out.println("skulist1"+result);

		JSONObject json=JSONObject.fromObject(result);
		Assert.assertEquals(json.getString("message"), "success");
	}
}
