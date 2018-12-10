package com.webtest.demo;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import com.webtest.core.*;
import com.webtest.demo.*;
/*38.备份还原（设置-备份还原)*/
public class Backup_Restore extends BaseTest{
	@Test
	public void backupRestore() throws Exception{
		Back_Login.backLogin();
		webtest.click("xpath=//a[contains(.,'设置')]");
		webtest.click("xpath=//a[contains(.,'备份还原')]");
		webtest.click("id=backupBtn");
		webtest.click("xpath=//button0[contains(.,'确认')]");
	}
}
