package com.webtest.demo;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import com.webtest.core.*;
import com.webtest.demo.*;
/*11.������ֽ��㣨վ��-��������-���֣�*/
public class Integral_Settlement extends BaseTest{
	@Test
	public void integralSettlement() throws Exception{
		Back_Login.backLogin();
		webtest.click("xpath=//a[contains(.,'վ��')]");
		webtest.click("xpath=//a[contains(.,'��������')]");
		webtest.click("xpath=//a[contains(.,'����')]");
		webtest.click("xpath=//a[contains(.,'���ֽ���')]");
		webtest.click("id=submit");
		
		
	}

}
