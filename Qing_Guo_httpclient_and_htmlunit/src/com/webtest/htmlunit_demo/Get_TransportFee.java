package com.webtest.htmlunit_demo;

import org.testng.annotations.Test;

import com.webtest.core.HtmlUnit;
import com.webtest.utils.ReadPro;
/*作者：王得润*/
public class Get_TransportFee {
	@Test
	public void transportfee_success() throws Exception {
		String result = HtmlUnit.doGet(ReadPro.getProValue("url")+"/common/getTransportFee?id=1&addressDetail=浙江省_杭州市_滨江区");
		System.out.println(result);
	}
	@Test
	public void transportfee_fail1() throws Exception {
		String result = HtmlUnit.doGet(ReadPro.getProValue("url")+"/common/getTransportFee?id=\'1\'&addressDetail=浙江省_杭州市_滨江区");
		System.out.println(result);
	}
	@Test
	public void transportfee_fail2() throws Exception {
		String result = HtmlUnit.doGet(ReadPro.getProValue("url")+"/common/getTransportFee?id=null&addressDetail=浙江省_杭州市_滨江区");
		System.out.println(result);
	}
	@Test
	public void transportfee_fail3() throws Exception {
		String result = HtmlUnit.doGet(ReadPro.getProValue("url")+"/common/getTransportFee?id=1&addressDetail=123");
		System.out.println(result);
	}
/*  @Test
	public void transportfee_fail4() throws Exception {
		String result = HtmlUnit.doGet(ReadPro.getProValue("url")+"/common/getTransportFee?id=1&addressDetail=吉林省_通化市_东昌区");
		System.out.println(result);
	}

	@Test
	public void transportfee_fail5() throws Exception {
		String result = HtmlUnit.doGet(ReadPro.getProValue("url")+"/common/getTransportFee?id=1&addressDetail=杭州市_滨江区");
		System.out.println(result);
	}
	@Test
	public void transportfee_fail6() throws Exception {
		String result = HtmlUnit.doGet(ReadPro.getProValue("url")+"/common/getTransportFee?id=1&addressDetail=浙江省_杭州市_西青区");
		System.out.println(result);
	}
	@Test
	public void transportfee_fail7() throws Exception {
		String result = HtmlUnit.doGet(ReadPro.getProValue("url")+"/common/getTransportFee?id=1&addressDetail=浙江省_天津市_西青区");
		System.out.println(result);
	}
	@Test
	public void transportfee_fail8() throws Exception {
		String result = HtmlUnit.doGet(ReadPro.getProValue("url")+"/common/getTransportFee?id=1&addressDetail=江苏省_杭州市_西青区");
		System.out.println(result);
	}
	*/
}
