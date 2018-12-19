package com.freemark;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;
import com.freemark.FreeMarker;


public class demo1 {

	@Test
	public void test() throws Exception {
		Map<String, Object> mapsuccess=new HashMap<String, Object>();
		mapsuccess.put("1","cheng");
		
		
		Map<String, Object> dataMap =new HashMap<String, Object>();
		dataMap.put("stuname","chanzhi");
		dataMap.put("mapsuccess", mapsuccess);
	
		FreeMarker.freemarker("src/com/freemark/templates","src/com/freemark","report.ftl",dataMap);
	}
	
	
}
