package com.edu.interfacetest;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

import com.edu.core.BaseTest;
import com.edu.core.HttpDriver;
import com.edu.utils.Checker;

public class HttpclientTestDemo1 extends BaseTest{
	Checker check;
	String subUrl = "/common/skuList/";
	String result=null;

	public String skuList() throws Exception {
		 result = HttpDriver.doGet(subUrl);
		check = new Checker(result);
		return result;
	}
	
	public String skuListById(String goodsId) throws Exception {
	
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("goodsId", goodsId);
		map.put("addressDetail", "");
		String result = HttpDriver.doGet(subUrl,map);
		check = new Checker(result);
		return result;
	}
	@Test
	public void TestSkuList1() throws Exception {
		result = skuList();
		check.verifyTextPresent("mesage");
	}
	public void TestSkuList2() throws Exception {
		result = skuList();
		check.verifyTextPresent("mesage");
	}
	public void TestSkuList3() throws Exception {
		result = skuList();
		check.verifyTextPresent("mesage");
	}
}
