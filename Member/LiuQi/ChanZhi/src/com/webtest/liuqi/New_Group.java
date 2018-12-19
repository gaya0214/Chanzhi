package liuqi;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import com.webtest.core.*;
import com.webtest.demo.*;
/*作者：刘琪
 * 18.新增分组（站点-语言设置-安全）*/
public class New_Group extends BaseTest{
	@Test
	public void newGroup()throws Exception{
		Back_Login.backLogin();
		webtest.click("xpath=//a[contains(.,'安全')]");
		webtest.click("xpath=//a[contains(.,'分组权限')]");
		webtest.click("xpath=//a[contains(.,'新增风阻')]");
		webtest.type("id=name","名字");
		webtest.type("id=desc", "管理后台所有权限");
		webtest.click("id=submit");
}
}