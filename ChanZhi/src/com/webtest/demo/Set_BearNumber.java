package com.webtest.demo;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import com.webtest.core.*;
import com.webtest.demo.*;
/*作者：王得润
 * 36.批量提交资源（推广-熊掌号-批量提交）*/
public class Set_BearNumber extends BaseTest{
	@Test
	public void setBearNumber()throws Exception{
		Back_Login.backLogin();
		webtest.click("xpath=//a[contains(.,'推广')]");
		webtest.click("xpath=//a[contains(.,'熊掌号')]");
//		webtest.click("xpath=//a[contains(.,'设置')]");
		webtest.selectByValue("id=type","2");
		webtest.type("id=name", "熊掌号名称1");
		webtest.type("id=appID", "appID1");
		webtest.type("id=token", "token1");
		webtest.click("id=autoSync1");
		webtest.click("id=submit");
	}
}
