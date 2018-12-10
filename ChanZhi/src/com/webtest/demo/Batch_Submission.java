package com.webtest.demo;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import com.webtest.core.*;
import com.webtest.demo.*;
/*28.熊掌号设置（推广-熊掌号-设置）*/
public class Batch_Submission extends BaseTest{
	@Test
	public void batchSubmission() throws Exception{
		Back_Login.backLogin();
		webtest.click("xpath=//a[contains(.,'推广')]");
		webtest.click("xpath=//a[contains(.,'熊掌号')]");
		webtest.click("xpath=//a[contains(.,'批量提交')]");
		webtest.click("id=execButton");
	}

}
