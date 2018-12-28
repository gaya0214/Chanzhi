package QGTest;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

import Core.HttpDriver;
 
public class OrderSubmit {
	
	String url="/fgadmin/orders/submit";//url=http://study-perf.qa.netease.com/fgadmin/orders/submit
	public String odersubmit(String skuIds,String skuNumbers,String stockIds) {
		Map<String,Object>submit=new HashMap<String,Object>();
		submit.put("skuIds", skuIds);
		submit.put("skuNumbers", skuNumbers);
		submit.put("stockIds", stockIds);
		String result=HttpDriver.doPostByForm(url, submit);
		return result;
		}
	@Test
	public void submitTest() {
		String res=this.odersubmit("2,3", "1,1", "74966312,74966313");
		System.out.println(res);
	} 
}
