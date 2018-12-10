package com.webtest.demo;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import com.webtest.core.*;
import com.webtest.demo.*;
/*26.��������Ա-��̳-������*/
public class Plate_Management extends BaseTest{
	@Test
	public void plateManagement()throws Exception{
		Back_Login.backLogin();
		webtest.click("xpath=//a[contains(.,'��Ա')]");
		webtest.click("xpath=//a[contains(.,'��̳')]");
		webtest.click("xpath=//a[contains(.,'������')]");
		webtest.type("id=children[]", "���2");
		webtest.type("id=alias[]", "����2");
		webtest.click("id=submit");
		
		webtest.click("xpath=//a[contains(.,'�Ӱ��')]");
		webtest.type("id=children[]", "�Ӱ��1");
		webtest.type("id=alias[]", "�ӱ���1");
		webtest.click("id=submit");
	}

}
