package com.webtest.demo;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import com.webtest.core.*;
import com.webtest.demo.*;
/*37.更新检索（设置-更新检索）*/
public class Update_Search extends BaseTest{
	@Test
	public void updateSearch() throws Exception{
		//Back_Login.backLogin();
		webtest.click("xpath=//a[contains(.,'设置')]");
		webtest.click("xpath=//a[contains(.,'全文检索')]");
		webtest.click("id=execButton");
	}
}
