package QGTest;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.apache.http.client.CookieStore;
import org.apache.http.cookie.Cookie;
import org.testng.annotations.Test;

//import com.gargoylesoftware.htmlunit.util.Cookie;

import Core.BaseTest;
import Core.HttpDriver;

public class AddAddress extends BaseTest{
	
	String url="/fgadmin/address/new";
	
	
	public String addAddress(String province,String city,String area,String receiverName,String cellPhone,String addressDetail)throws Exception {
		Map<String, Object> address=new HashMap<String, Object>();
		Set<Cookie> cookie=Common.getLoginCookie2();
		address.put("province", province);
		address.put("city", city);
		address.put("area", area);
		address.put("receiverName", receiverName);
		address.put("cellPhone", cellPhone);
		address.put("addressDetail", addressDetail);
		String result=HttpDriver.doPostByForm(url, address);
		return result;
	}
		
	@Test(priority=1 , description="添加地址成功")
	public void loginSuccess() throws Exception {
		String res=this.addAddress("云南省","昆明市","五华区","YSY","12345678911","电力小区");
		System.out.println(res);
	}
	@Test(priority=2, description="添加地址失败") 
	public void loginFail() throws Exception {
		Login.Login();
		String res=this.addAddress("","昆明市","五华区","YSY","12345678911","电力小区");
		System.out.println(res);
	}
}
