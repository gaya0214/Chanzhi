package com.webtest.demo;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import com.webtest.core.*;
import com.webtest.demo.*;
/*作者：韦宇杰
 * 44.站点设置（设置-站点设置）*/
public class Site_Setting extends BaseTest{
	@Test
	public void siteSetting() throws Exception{
		//Back_Login.backLogin();
		webtest.click("xpath=//a[contains(.,'设置')]");
		webtest.click("xpath=//a[contains(.,'站点设置')]");
		webtest.click("id=status1");
		webtest.click("id=type2");
		webtest.click("id=mobileTemplate1");
		webtest.click("id=gzipOutput2");
		webtest.type("id=name", "新");
		webtest.type("id=copyright", "1998年");
		webtest.click("id=modules1");
		webtest.type("id=keywords","蝉知");
		webtest.type("id=indexKeywords", "蝉知首页");
		webtest.type("id=slogan", "蝉知做最好的蝉");
		webtest.type("id=meta", "meta口号");
		webtest.type("id=desc","站点描述");
		webtest.type("id=icpSN", "****");
		webtest.type("id=policeSN", "****");
		webtest.tapClick();
		webtest.tapClick();
		webtest.enterClick();
	}

}
