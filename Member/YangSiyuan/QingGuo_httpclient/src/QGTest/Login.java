package QGTest;


import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Core.HttpDriver;

public class Login {
		static String url="/common/needLoginCaptcha";
	public static String login(String area,String name,String password)throws Exception {
		Map<String, Object> user=new HashMap<String, Object>();
		user.put("phoneArea",area);
		user.put("phoneNumber", name);
		user.put("password", password);
		String result=HttpDriver.doPostByForm(url, user);
		return result;
	}
	
	@BeforeMethod
	public static void Login() throws Exception {
		String res=login("86","2000000003","netease123");
	}
	
	
/*	@Test(description="²âÊÔ³É¹¦µÇÂ¼")
	public  void loginSucces() throws Exception  {
		String res=this.login("86","20000000000","netease123");
		System.out.println(res);
	}
/*	@Test(description="²âÊÔµÇÂ¼Ê§°Ü")
	public void loginFail1() throws Exception {
		String res=this.login("86","2000000000","netease123");
		System.out.println(res);
	}
	@Test(description="²âÊÔµÇÂ¼Ê§°Ü")
	public void loginFail2() throws Exception {
		String res=this.login("86","20000000000"," ");
		System.out.println(res);
	}
	
	@Test(description="²âÊÔµÇÂ¼Ê§°Ü")
	public void loginFail3() throws Exception {
		String res=this.login("86"," ", "netease123");
		System.out.println(res);
	}
	
	@Test(description="²âÊÔµÇÂ¼Ê§°Ü")
	public void loginFail4() throws Exception {
		String res=this.login("86","20000000000", " ");
		System.out.println(res);
	}
	@Test(description="²âÊÔµÇÂ¼Ê§°Ü")
	public void loginFail5() throws Exception {
		String res=this.login("86","200000000001", "netease123");
		System.out.println(res);
	}
	*/
}
