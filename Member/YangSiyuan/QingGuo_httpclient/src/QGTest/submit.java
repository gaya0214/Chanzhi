package QGTest;

import org.apache.http.client.CookieStore;
import org.testng.annotations.Test;

import Dataprovider.NSDataProvider;

public class submit {
	
	//实现10个用户的submit操作
	@Test(dataProvider="txt",dataProviderClass=NSDataProvider.class)
	public void submit(String name,String password) throws Exception {
		CookieStore cookieStore=Common.getLoginCookie(name, password);
//	HttpDriver.doPost(url, para, cookie)
	
	
	}

}
