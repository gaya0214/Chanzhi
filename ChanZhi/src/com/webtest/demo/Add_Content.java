package com.webtest.demo;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import com.webtest.core.*;
import com.webtest.demo.*;
/*作者：王得润
 * 29.自定义添加内容（设计-区块-添加-内容）*/
public class Add_Content extends BaseTest{
	@Test
	public void setBearNumber()throws Exception{
		Back_Login.backLogin();
		webtest.click("xpath=//a[contains(.,'设计')]");
		webtest.click("xpath=//a[contains(.,'区块')]");
		webtest.click("xpath=//a[contains(.,'添加')]");
		webtest.type("id=title", "名称1");
		webtest.click("xpath=//th[contains(.,'内容')]");
		webtest.tapClick();
		webtest.tapType("内容1");
		webtest.click("id=submit");
		
	}
}
