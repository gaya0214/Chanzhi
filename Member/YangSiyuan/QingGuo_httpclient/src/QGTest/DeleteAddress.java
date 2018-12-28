package QGTest;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

import Core.HttpDriver;

public class DeleteAddress {
	String url="/fgadmin/address/delete";
	
	public String deleteaddress(String id ) {
		
		String res=HttpDriver.doPostByForm(url,id);
		return res;
		
	}
	@Test
	public String  delete1() {
		String res=this.deleteaddress("77243286");
		return res;
	}
}
