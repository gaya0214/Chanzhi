package com.webtest.demo;

//import org.junit.Test;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class add_Essay extends BaseTest{
	@Test
	
		
	public void addessay() {
		Back_Login.backLogin();
		webtest.click("link=文章");
		webtest.pause(3000);
		webtest.click("link=发布文章");
		webtest.pause(3000);
		webtest.click("id=categories_chosen");
		webtest.enter();
		webtest.typeAndClear("id=author", "佚名");
		webtest.click("id=source_chosen");
		webtest.selectByValue("id=source","original");
		webtest.type("id=title", "第一篇文章");
		webtest.type("id=alias", "这就是别名");
		webtest.type("id=keywords", "第一，文章");
		webtest.type("xpath=/html/body/div[1]/div[2]/div/div[2]/form/table/tbody[5]/tr[1]/td/div[2]/div[2]/iframe", "这是第一篇文章");
		webtest.click("id=status2");
		webtest.click("id=submit");
	}
}
