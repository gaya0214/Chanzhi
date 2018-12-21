package com.webtest.demo;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class AddCompanyMessage extends BaseTest {
	@Test
	public void addMessage() throws InterruptedException {
		Back_Login.backLogin();
		Thread.sleep(1000);
		webtest.click("xpath=//a[contains(.,'Õ¾µã')]");
		webtest.click("xpath=//a[contains(.,'ÓïÑÔÉèÖÃ')]");
		webtest.click("xpath=//a[contains(.,'¹«Ë¾')]");
		webtest.type("xpath=//*[@id=\"name\"]","²âÊÔ1");
		webtest.enterFrame(0);
		webtest.type("xpath=//html[@spellcheck='false']", "²âÊÔ1µÄ¼ò½é");
		webtest.leaveFrame();
		webtest.enterFrame(1);
		webtest.type("xpath=//html[@spellcheck='false']", "²âÊÔ1µÄÄÚÈİ");
		webtest.leaveFrame();
		webtest.click("xpath=//*[@id=\"submit\"]");
	}
}
