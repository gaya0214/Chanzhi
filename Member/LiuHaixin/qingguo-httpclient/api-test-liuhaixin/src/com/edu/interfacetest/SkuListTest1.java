package com.edu.interfacetest;


import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

import com.edu.core.HttpDriver;
import com.edu.utils.ReadPro;



public class SkuListTest1 {
	@Test
	public void skulist() throws Exception {

		String result = HttpDriver.doGet(ReadPro.getPropValue("url")+"/common/skuList");
		System.out.println(result);

	}  
	
	@Test
	public void skulist1() throws Exception {

		String result = HttpDriver.doGet(ReadPro.getPropValue("url")+"/common/skuList","goodsId=1");
		System.out.println(result);

	} 
	@Test
	public void skulist2() throws Exception {

		String result = HttpDriver.doGet(ReadPro.getPropValue("url")+"/common/skuList","goodsId=2147483698");
		System.out.println(result);

	}
	@Test
	public void skulist3() throws Exception {

		String result = HttpDriver.doGet(ReadPro.getPropValue("url")+"/common/skuList","goodsId='1'");
		System.out.println(result);

	}
	@Test
	public void skulist4() throws Exception {

		String result = HttpDriver.doGet(ReadPro.getPropValue("url")+"/common/skuList","goodsId=abc1");
		System.out.println(result);

	}
	
	@Test
	public void mapToString() throws IOException, Exception { 
	
				
		Map<String,String> map = new HashMap();
		
		map.put("goodsId", "1");
		map.put("addressDetail", "ºÓ±±Ê¡");
		HttpDriver.doGet(ReadPro.getPropValue("url")+"/common/skuList");

	}
}