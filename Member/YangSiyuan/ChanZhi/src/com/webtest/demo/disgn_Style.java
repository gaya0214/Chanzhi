package com.webtest.demo;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class disgn_Style extends BaseTest{
	@Test
	public static void style() {
		Back_Login.backLogin();
		webtest.click("link=设计");
		webtest.pause(3000);
		webtest.click("link=区块");
		webtest.pause(3000);
		webtest.click("link=添加");
		webtest.pause(3000);
		
	}
	@Test
	public void style1() {
		webtest.click("link=样式");
		webtest.click("xpath=//button[contains(.,'图标颜色')]");
		webtest.click("xpath=//div[@data='#333333']");
		//webtest.click("xpath=//div[@data='#000000']");
		//webtest.click("xpath=//div[@data='#CA1407']");
		webtest.typeAndClear("id=params[custom][blank][iconColor]", " ");
		webtest.type("id=params[custom][blank][iconColor]", "#120397");
		webtest.pause(3000);
		webtest.click("xpath=//button[contains(.,'边框颜色')]");
		webtest.click("xpath=/html/body/div/form/div/div[2]/div[1]/div[1]/div[2]/table/tbody/tr[2]/td/div/div/span/div/div[1]");
		//webtest.click("xpath=//div[@data='#000000']");
		//webtest.click("xpath=//div[@data='#CA1407']");
		webtest.typeAndClear("id=params[custom][blank][borderColor]", " ");
		webtest.type("id=params[custom][blank][borderColor]", "#120397");
		webtest.pause(3000);
		webtest.type("id=params[custom][blank][paddingTop]", "3");
		webtest.pause(1000);
		webtest.type("id=params[custom][blank][paddingRight]", "3");
		webtest.pause(1000);
		webtest.type("id=params[custom][blank][paddingLeft]", "3");
		webtest.pause(1000);
		webtest.type("id=params[custom][blank][paddingButtom]", "3");
		webtest.click("xpath=//button[contains(.,'文字颜色')]");
		webtest.click("xpath=/html/body/div/form/div/div[2]/div[1]/div[1]/div[2]/table/tbody/tr[5]/td[1]/div/div/span/div/div[1]");
		//webtest.click("xpath=//div[@data='#000000']");
		//webtest.click("xpath=//div[@data='#CA1407']");
		webtest.typeAndClear("id=params[custom][blank][titleColor]", " ");
		webtest.type("id=params[custom][blank][titleColor]", "#120397");
		webtest.pause(3000);
		webtest.click("xpath=//button[contains(.,'背景颜色')]");
		webtest.click("xpath=/html/body/div/form/div/div[2]/div[1]/div[1]/div[2]/table/tbody/tr[5]/td[2]/div/div/span/div/div[1]");
		//webtest.click("xpath=//div[@data='#000000']");
		//webtest.click("xpath=//div[@data='#CA1407']");
		webtest.typeAndClear("id=params[custom][blank][titleBackground]", " ");
		webtest.type("id=params[custom][blank][titleBackground]", "#120397");
		webtest.pause(3000);
		webtest.click("xpath=//button[contains(.,'链接颜色')]");
		webtest.click("xpath=//div[@data='#333333']");
		//webtest.click("xpath=//div[@data='#000000']");
		//webtest.click("xpath=//div[@data='#CA1407']");
		webtest.typeAndClear("id=params[custom][blank][linkColor]", " ");
		webtest.type("id=params[custom][blank][linkColor]", "#120397");
		webtest.pause(3000);
		webtest.click("xpath=/html/body/div/form/div/div[2]/div[1]/div[1]/div[2]/table/tbody/tr[5]/td[1]/div/div/span");
		webtest.click("xpath=/html/body/div/form/div/div[2]/div[1]/div[1]/div[2]/table/tbody/tr[6]/td/div/div/span/div/div[1]");
		//webtest.click("xpath=//div[@data='#000000']");
		//webtest.click("xpath=//div[@data='#CA1407']");
		webtest.typeAndClear("id=params[custom][blank][textColor]", " ");
		webtest.type("id=params[custom][blank][textColor]", "#120397");
		webtest.pause(3000);
		webtest.click("xpath=/html/body/div/form/div/div[2]/div[1]/div[1]/div[2]/table/tbody/tr[6]/td/div/div/span/button");
		webtest.click("xpath=/html/body/div/form/div/div[2]/div[1]/div[1]/div[2]/table/tbody/tr[5]/td[2]/div/div/span/div/div[1]");
		//webtest.click("xpath=//div[@data='#000000']");
		//webtest.click("xpath=//div[@data='#CA1407']");
		webtest.typeAndClear("id=params[custom][blank][backgroundColor]", " ");
		webtest.type("id=params[custom][blank][backgroundColor]", "#120397");
		webtest.pause(3000);
		webtest.type("id=params[class]","w-80px"+" "+"btn dropdown-toggle");
		webtest.click("id=submit");
	}
}
