package com.freemark;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import freemarker.template.Configuration;
import freemarker.template.Template;

public class FreeMarker {
	static Configuration configuration =null;
	
	public static void freemarker(String TEMPLATE_PATH,String CLASS_PATH,String template_name,Map<String, Object> mapname) throws Exception {
		 // step1 创建freeMarker配置实例
		StringBuilder sBuilder =new StringBuilder();
		int size =mapname.size();
		for(Entry<String, Object> entry :mapname.entrySet()) {
			sBuilder.append(entry.getKey()+"="+entry.getValue());
			size--;
			if(size>=1) {
				sBuilder.append("&");
			}
			
		}	
		configuration= new Configuration();
	     Writer out = null;
	  // step2 获取模版路径
	     configuration.setDirectoryForTemplateLoading(new File(TEMPLATE_PATH));        
	  // step3 创建数据模型
//	     mapname = new HashMap<String, Object>();
	  // step4 加载模版文件
	      Template template = configuration.getTemplate(template_name);
	   // step5 生成数据
	      File docFile = new File(CLASS_PATH + "\\" + "test.html");
	      out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(docFile)));
	   // step6 输出文件
	      template.process(mapname, out);
	      System.out.println("success");

	}
}
