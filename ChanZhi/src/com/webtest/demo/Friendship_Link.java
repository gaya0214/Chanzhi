package com.webtest.demo;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import com.webtest.core.*;
import com.webtest.demo.*;
/*27.�������ӣ��ƹ�-�������ӣ�*/
public class Friendship_Link  extends BaseTest{
	@Test
	public void friendshipLink()throws Exception{
		Back_Login.backLogin();
		webtest.click("xpath=//a[contains(.,'�ƹ�')]");
		webtest.click("xpath=//a[contains(.,'��������')]");
		webtest.click("xpath=//th[contains(.,'��ҳ����')]");
		webtest.tapClick();
		webtest.tapType("��ҳ����1");
		webtest.click("xpath=//th[contains(.,'��������')]");
		webtest.tapClick();
		webtest.tapType("��������1");
		webtest.click("id=submit");
	}
}
