package QGTest;

import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

import Core.HttpDriver;
import Utils.Checker;

public class AddressList {
	Checker check;
	String subUrl="/fgadmin/address/list";
	String result=null;
	
	public String addressList() throws Exception {
		result=HttpDriver.doGet(subUrl);
		check=new Checker(result);
		return result;
	}
	public String addressListById(String id) {
		Map<String, String> map=new HashMap<String, String>();
		map.put("id", id);
		map.put("province", "");
		map.put("city", "");
		map.put("area", "");
		map.put("receiverName", "");
		map.put("cellPhone", "");
		map.put("addressDetail","");
		check=new Checker(result);
		return result;
	}
	@Test
	public void TestAddressList1() throws Exception {
		result=addressList();
		check.verifyTextPresent("message");
	}
	public void TestAddressList2() throws Exception {
		result=addressList();
		check.verifyXpath("message", "success");
	}
	@Test
	public void TestAddressListById() throws Exception {
		result=this.addressListById("1");
		check.verifyXpath("message", "success");
	}
	@Test
	public void TestAddressListByWrongIdType() throws Exception {
		String id=URLEncoder.encode("\"1\"", "utf-8");
		result=this.addressListById(id);
		check.verifyXpath("message","Failed");
	}
}
	
