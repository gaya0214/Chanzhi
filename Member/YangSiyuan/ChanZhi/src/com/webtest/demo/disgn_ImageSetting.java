package com.webtest.demo;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class disgn_ImageSetting extends BaseTest{
	@Test
	public void imagesetting() {
		disgn_ListSetting.disgnsetting();
		webtest.click("link=缩略图设置");
		webtest.typeAndClear("id=thumbs[s][width]", "65");
		webtest.typeAndClear("id=thumbs[s][height]", "80");
		webtest.pause(3000);
		webtest.typeAndClear("id=thumbs[m][width]", "150");
		webtest.typeAndClear("id=thumbs[m][height]", "250");
		webtest.pause(3000);
		webtest.typeAndClear("id=thumbs[l][width]", "300");
		webtest.typeAndClear("id=thumbs[l][height]", "450");
		webtest.click("id=thumbExecButton");
		webtest.pause(5000);
		webtest.click("id=submit");
	}
}
