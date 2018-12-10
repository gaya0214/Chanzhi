package com.webtest.demo;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import com.webtest.core.*;
import com.webtest.demo.*;
/*21.ά����Ŀ������-���ͣ�*/
public class Maintenance_Category_Blog extends BaseTest{
	@Test
	public void maintenancecategoryEssay()throws Exception{
		Back_Login.backLogin();
		webtest.click("xpath=//a[contains(.,'����')]");
		webtest.click("xpath=//a[contains(.,'ά����Ŀ')]");
		webtest.type("id=children[]", "��Ŀ����1");
		webtest.type("id=alias[]", "����");
		webtest.click("id=submit");
	}
	
}
