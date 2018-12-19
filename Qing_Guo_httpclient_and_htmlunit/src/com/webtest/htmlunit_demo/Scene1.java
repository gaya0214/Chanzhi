package com.webtest.htmlunit_demo;
import org.testng.annotations.Test;

import com.webtest.core.HtmlUnit;
import com.webtest.utils.ReadPro;
/*×÷Õß£ºÎ¤Óî½Ü*/
public class Scene1 {
	@Test
	public void skulist() throws Exception {
		String result = HtmlUnit.doGet(ReadPro.getProValue("url")+"/common/skuList");
		System.out.println(result);
	}
	@Test
	public void skulist_goodsId1() throws Exception {
		String result = HtmlUnit.doGet(ReadPro.getProValue("url")+"/common/skuList","goodsId=1");
		System.out.println(result);
	}
	@Test
	public void skulist_goodsId2() throws Exception {
		String result = HtmlUnit.doGet(ReadPro.getProValue("url")+"/common/skuList","goodsId=2");
		System.out.println(result);
	}
	@Test
	public void skulist_goodsId3() throws Exception {
		String result = HtmlUnit.doGet(ReadPro.getProValue("url")+"/common/skuList","goodsId=3");
		System.out.println(result);
	}
}
