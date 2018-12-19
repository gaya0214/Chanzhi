package com.webtest.demo;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class Style extends BaseTest{
	@Test
	public void style() throws Exception{
		Back_Login.backLogin();
		webtest.click("xpath=//a[contains(.,'设计')]");
		webtest.click("xpath=//a[contains(.,'区块')]");
		webtest.click("class=panel-actions");
		webtest.click("xpath=//a[contains(.,'样式')]");
		webtest.type("id=params[custom][blank][iconColor]","#FF9400" );
		webtest.type("id=params[custom][blank][borderColor]","#FF9400" );
		webtest.type("id=params[custom][blank][paddingTop]","2" );
		webtest.type("id=params[custom][blank][paddingRight]","2" );
		webtest.type("id=params[custom][blank][paddingBottom]","2"  );
		webtest.type("id=params[custom][blank][paddingLeft]","2"  );
		webtest.type("id=params[custom][blank][titleColor]","#FF9400" );
		webtest.type("id=params[custom][blank][titleBackground]","#FF9400" );
		webtest.type("id=params[custom][blank][textColor]","#FF9400" );
		webtest.type("id=params[custom][blank][linkColor]","#FF9400" );
		webtest.type("id=params[custom][blank][backgroundColor]","#FF9400" );
		webtest.type("id=params[class]","tomp,bottom,right,left" );
		webtest.click("id=submit");
	
		
		}
}
