package QGTest;

import org.apache.http.client.CookieStore;
import org.testng.annotations.Test;

import Dataprovider.NSDataProvider;

public class submit {
	
	//ʵ��10���û���submit����
	@Test(dataProvider="txt",dataProviderClass=NSDataProvider.class)
	public void submit(String name,String password) throws Exception {
		CookieStore cookieStore=Common.getLoginCookie(name, password);
//	HttpDriver.doPost(url, para, cookie)
	
	
	}

}
