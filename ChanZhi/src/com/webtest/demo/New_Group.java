package com.webtest.demo;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import com.webtest.core.*;
import com.webtest.demo.*;
/*18.�������飨վ��-��������-��ȫ��*/
public class New_Group extends BaseTest{
	@Test
	public void newGroup()throws Exception{
		Back_Login.backLogin();
		webtest.click("xpath=//a[contains(.,'��ȫ')]");
		webtest.click("xpath=//a[contains(.,'����Ȩ��')]");
		webtest.click("xpath=//a[contains(.,'��������')]");
		webtest.type("id=name","����1");
		webtest.type("id=desc", "����1������");
		webtest.click("id=submit");
}
}