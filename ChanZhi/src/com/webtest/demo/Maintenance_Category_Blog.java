package com.webtest.demo;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import com.webtest.core.*;
import com.webtest.demo.*;
/*作者：尹璐
 * 21.维护类目（内容-博客）*/
public class Maintenance_Category_Blog extends BaseTest{
	@Test
	public void maintenancecategoryEssay()throws Exception{
		Back_Login.backLogin();
		webtest.click("xpath=//a[contains(.,'内容')]");
		webtest.click("xpath=//a[contains(.,'博客')]");
		webtest.type("id=children[]", "维护类目");
		webtest.type("id=alias[]", "别名");
		webtest.click("id=submit");
	}
	
}
