package com.webtest.demo;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class Product extends BaseTest{
	@Test
	public void product() throws Exception{
		/*登陆系统后台*/
		Back_Login.backLogin();
		/*选择目标*/
		webtest.click("xpath=//a[contains(.,'商城')]");
		webtest.click("xpath=//a[contains(.,'产品')]");
		webtest.click("class=icon-plus");
		
		/*添加类目*/
		webtest.type("class=children[1]", "衣");
		webtest.type("class=alias[1]", "穿");
		webtest.type("class=children[2]", "食");
		webtest.type("class=alias[2]", "吃");
		webtest.type("class=children[3]", "住");
		webtest.type("class=alias[3]", "睡");
		webtest.type("class=children[4]", "行");
		webtest.type("class=alias[4]", "走");
		webtest.click("id=submit");
		
		/*返回添加产品*/
		webtest.click("class=icon icon-reply");
		webtest.click("class=icon-plus");
		
		/*添加产品过程*/
		webtest.type("class=default","食");
		webtest.type("id=name","面条");
		webtest.type("id=titleColor","#000000");
		webtest.type("id=order","");
		webtest.type("id=alias","noodles");
		webtest.type("id=mall","www.taobao.com");
		webtest.type("id=keywords","杂粮");
		webtest.type("class=article-content","面条");
		webtest.type("class=ke-edit-iframe","全国各地杂粮面条");
		webtest.type("id=brand","康师傅");
		webtest.type("id=model","正常");
		webtest.type("id=color","白色");
		webtest.type("id=amount","10000");
		webtest.type("id=origin","河北");
		webtest.type("id=uint","师范大学");
		webtest.type("id=price","100");
		webtest.type("id=promotion","60");
		webtest.type("id=label[0]","颜色");
		webtest.type("id=value[0]","棕褐色");
		webtest.click("class=icon-plus");
		webtest.type("id=lobel[1]","价格");
		webtest.type("id=value[1]","86");
		webtest.click("id=submit");
		
		}
}
