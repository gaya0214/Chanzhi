package com.webtest.demo;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import com.webtest.core.*;
import com.webtest.demo.*;
/*作者：刘琪
 * 13.发信设置（站点-语言设置-接口）*/
public class Add_Interface extends BaseTest {
	@Test
	public void addInterface() throws Exception{
		Back_Login.backLogin();
		webtest.click("xpath=//a[contains(.,'站点')]");
		webtest.click("xpath=//a[contains(.,'语言设置')]");
		webtest.click("xpath=//a[contains(.,'接口')]");
		webtest.click("xpath=//a[contains(.,'开发登录')]");
		webtest.type("id=verification","www.xinlang.com");
		webtest.type("id=clientID","******");
		webtest.type("id=clientSecret","******");
		webtest.type("id=widget","无组件");
		webtest.click("id=submit");
	}
}
