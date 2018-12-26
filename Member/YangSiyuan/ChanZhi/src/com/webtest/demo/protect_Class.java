package com.webtest.demo;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class protect_Class extends BaseTest{
	@Test
	public void addClass(){
		Back_Login.backLogin();
		webtest.click("link=内容");
		webtest.click("link=文章");
		webtest.click("link=维护类目");
		webtest.type("name=children[6]", "第二个类目");
		webtest.type("name=alias[6]", "第二次测试");
		webtest.click("id=submit");
		
	}
	@Test
	public void deleteClass(){
		webtest.click("link=ɾ��");
		webtest.click("class=btn btn-primary");
		
	}
	@Test
	public void editeClass() {
		webtest.click("link=�༭");
		webtest.click("id=parent_chosen");
		webtest.pause(3000);
		webtest.click("class=active-result result-selected");
		webtest.pause(3000);
		webtest.typeAndClear("id=name", " ");
		webtest.pause(3000);
		webtest.type("id=name", "这就是第一篇文章");
		webtest.pause(3000);
		webtest.typeAndClear("id=abbr", " ");
		webtest.pause(3000);
		webtest.type("id=abbr","第一篇文章");
		webtest.pause(3000);
		webtest.typeAndClear("id=alias", " ");
		webtest.type("id=alias","第一篇文章");
		webtest.typeAndClear("id=keywords", " ");
		webtest.type("id=keywords", "文章");
		webtest.pause(3000);
		webtest.type("xpath=//html[contains(@spellcheck,'false')]","啧，测试");
		webtest.pause(3000);
		webtest.click("id=submit");
	}
	
	@Test
	public void childrenClass() {
		
		webtest.click("xpath=//a[contains(@href,'/chanzhi/www/admin.php?m=tree&f=children&type=article&category=5')]");
		webtest.pause(3000);
		webtest.type("name=children[1]", "第一个子目录");
		webtest.pause(3000);
		webtest.type("name=alias[1]", "�第一次测试");
		webtest.pause(3000);
		webtest.click("id=submit");
	}
	@Test
	public void layout() {
		webtest.click("link=布局");
		webtest.click("link=上部通栏");
	}
}
