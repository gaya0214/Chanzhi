package com.webtest.demo;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class disgn_CSS extends BaseTest{
	@Test
	public void disgncss() {
		disgn_Style.style();
		webtest.click("link=CSS");
		webtest.type("id=css-editor", "这是CSS");
		webtest.pause(5000);
		webtest.click("id=submit");
		
	}
	@Test
	public void isgnjs() {
		disgn_Style.style();
		webtest.click("link=Javascript");
		webtest.type("id=JS-editor", "这是JS");
		webtest.pause(5000);
		webtest.click("id=submit");
	}
}
