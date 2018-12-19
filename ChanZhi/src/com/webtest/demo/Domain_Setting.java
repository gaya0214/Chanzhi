package com.webtest.demo;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import com.webtest.core.*;
import com.webtest.demo.*;
/*作者：尹璐
 * 19.域名设置（站点-域名设施）*/
public class Domain_Setting extends BaseTest{
	@Test
	public void newGroup()throws Exception{
		Back_Login.backLogin();
		webtest.click("xpath=//a[contains(.,'站点')]");
		webtest.click("xpath=//a[contains(.,'域名设置')]");
		webtest.type("id=domain", "主域名");
		webtest.type("id=allowedDomain", "可访问域名");
		webtest.click("id=scheme2");
		webtest.click("id=submit");
	}
}
