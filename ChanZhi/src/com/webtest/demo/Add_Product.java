package com.webtest.demo;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import com.webtest.core.*;
import com.webtest.demo.*;
/*7.添加产品*/
public class Add_Product extends BaseTest{
	@Test
	public void addProduce() throws Exception{
	Back_Login.backLogin();
	webtest.click("xpath=//a[contains(.,'产品')]");
	webtest.click("xpath=//a[contains(.,'添加产品')]");
	webtest.click("xpath=//input[@class='default']");
	webtest.enterClick();
	webtest.type("id=name", "蝉知的网页");
	webtest.tapClick();
	webtest.tapType("#FFB6C1");
	webtest.type("id=alias", "chanzhi");
	webtest.type("id=mall","http://www.taobao.com");
	webtest.type("id=keywords","蝉知");
	webtest.tapClick();
	webtest.tapType("蝉知的网页");
	
	Thread.sleep(3000);
	webtest.click("xpath=//th[contains(.,'详情')]");
	Thread.sleep(3000);
	
	webtest.tapClick();
	webtest.tapType("蝉知的详情");
	
	webtest.type("id=brand", "爱达");
	webtest.type("id=model", "1.0");
	webtest.type("id=color", "pink");
	webtest.type("id=amount", "1000");
	webtest.type("id=origin", "河北石家庄");
	webtest.type("id=unit", "河北师范大学");
	webtest.type("id=price", "150");
	webtest.type("id=promotion", "150");
	webtest.type("id=label[0]", "颜色");
	webtest.type("id=value[0]", "浅粉色");
	
	webtest.tapClick();
	webtest.enterClick();
	Thread.sleep(8000);
	}
}
