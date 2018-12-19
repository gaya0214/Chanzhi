package liuqi;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.dataprovider.NSDataProvider;
//作者：刘琪
//后台登录（输入用户名、密码、点击登录）
public class Back_Login extends BaseTest{
	//@Test(dataProvider="excel",dataProviderClass=NSDataProvider.class)

	//public static void backLogin(String u_name,String u_pwd) throws Exception  {
	@Test
	public static void backLogin() throws Exception  {
		webtest.open("http://localhost:8032/chanzhi/www/admin.php/");
		webtest.type("id=account", "admin");
		webtest.type("id=password", "123456");
		webtest.click("id=submit");
		}
}


