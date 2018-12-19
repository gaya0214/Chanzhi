package com.edu.interfacetest;

import org.apache.http.client.CookieStore;

import com.edu.core.HttpDriver;

import net.sf.json.JSONObject;

public class DeleteAddress {
public void addAdress() throws Exception {
		
		CookieStore cookie = Common.getLoginCookie();

		String url = "http://study-perf.qa.netease.com/fgadmin/address/delete";

		JSONObject address = new JSONObject();
		address.element("id", "");
		address.element("receiverName", "张三");
		address.element("cellPhone", "18788990011");
		address.element("province", "重庆市");
		address.element("city", "万州区");
		address.element("area", "");
		address.element("addressDetail", "中山路125号");
		String result = HttpDriver.doPost(url, address, cookie);
		System.out.println(result);

	}


}
