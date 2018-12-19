package liuqi;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import com.webtest.core.*;
import com.webtest.demo.*;
/*作者：刘琪
 * 26.版块管理*/
public class Plate_Management extends BaseTest{
	@Test
	public void plateManagement()throws Exception{
		Back_Login.backLogin();
		webtest.click("xpath=//a[contains(.,'会员')]");
		webtest.click("xpath=//a[contains(.,'论坛')]");
		webtest.click("xpath=//a[contains(.,'版块管理')]");
		webtest.type("id=children[]", "版块管理");
		webtest.type("id=alias[]", "别名");
		webtest.click("id=submit");
		
		webtest.click("xpath=//a[contains(.,'版块管理')]");
		webtest.type("id=children[]", "版块管理1");
		webtest.type("id=alias[]", "别名1");
		webtest.click("id=submit");
	}

}
