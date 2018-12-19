package liuqi;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import com.webtest.core.*;
import com.webtest.demo.*;
/*作者：刘琪
 * 20.维护类目（内容-文章）*/
public class Maintenance_Category_Essay extends BaseTest{
	@Test
	public void maintenancecategoryEssay()throws Exception{
		Back_Login.backLogin();
		webtest.click("xpath=//a[contains(.,'文章')]");
		webtest.click("xpath=//a[contains(.,'维护类目')]");
		webtest.type("id=children[]", "类目名称1");
		webtest.type("id=alias[]", "别名");
		webtest.click("id=submit");
	}
	
}
