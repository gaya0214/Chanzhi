package com.edu.interfacetest;


import static org.testng.Assert.assertEquals;

import org.apache.http.client.CookieStore;
import org.testng.annotations.Test;

import com.edu.core.HttpDriver;
import com.edu.interfacetest.Common;

import net.sf.json.JSONObject;

public class Newaddress {
	String url = "http://study-perf.qa.netease.com/fgadmin/address/new";
	String result=null;
    public String addAdsTest(String id,String receiverName,String cellPhone,String province,String city,String area,String addressDetail) throws Exception {
    	JSONObject para=new JSONObject();
    	CookieStore cookie=Common.getLoginCookie();
    	para.element("id",id);
    	para.element("receiverName", receiverName);
    	para.element("cellPhone", cellPhone);
    	para.element("province",province);
    	para.element("city", city);
    	para.element("area", area);
    	para.element("addressDetail", addressDetail);

    	result=HttpDriver.doPost(url, para,cookie);
    	System.out.println(result);
		return result;
    	
    }
	@Test
	public void addAdress_fail() throws Exception {
		result = this.addAdsTest("","Õ½Èý","1878866330011","ÖØÇì","wan","123","shkn");
		assertEquals("message","success");
	}	
}
