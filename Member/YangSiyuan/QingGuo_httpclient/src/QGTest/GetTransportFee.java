 package QGTest;

import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

import Core.BaseTest;
import Core.HttpDriver;
import Utils.Checker;

public class GetTransportFee extends BaseTest{
	Checker check;
	String subUrl="/common/getTransportFee";
	String result=null;
	
	public String getTransportFee() throws Exception{
		result=HttpDriver.doGet(subUrl);
		check=new Checker(result);
		return result;
	}
	public String getFee(String id) {
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("id",id);
		String result=HttpDriver.doGet(subUrl,map);
		check=new Checker(result);
		return result;
	}
	@Test
	public void TestGetFee1() throws Exception {
		result=getFee("1");
		check.verifyTextPresent("message");
	}
	@Test
	public void TestGetFee() throws Exception{
		result=getFee("1");
		check.verifyXpath("message","success");
	}
	@Test
	public void TestGetFeeById() throws Exception {
		result=this.getFee("1");
		check.verifyXpath("message", "success");
		
	}
	@Test
	public void TestSkuListByWrongIdType() throws Exception {
		String goodsId=URLEncoder.encode("\"1\"","utf-8");
		result=this.getFee(goodsId);
		check.verifyXpath("message", "Failed");
	}
}
	
