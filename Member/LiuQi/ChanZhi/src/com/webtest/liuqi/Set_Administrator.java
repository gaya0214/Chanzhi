package liuqi;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
/*作者：刘琪
 * 42.设计管理员权限（设置-安全-分组权限-编辑）*/
public class Set_Administrator extends BaseTest{
	@Test
	 public void setAdmin() throws Exception {
		Back_Login.backLogin();
		Thread.sleep(1000);

		webtest.click("xpath=//a[contains(.,'设置')]");
		webtest.click("xpath=//a[contains(.,'安全')]");
		webtest.click("xpath=//a[contains(.,'分组权限')]");
		webtest.click("xpath=//a[@href='/chanzhi/www/admin.php?m=group&f=edit&groupID=1']");
		Thread.sleep(1000);
		webtest.typeAndClear("xpath=//input[@class='form-control']","测试1");
		webtest.typeAndClear("xpath=//textarea[@class='form-control']", "测试1");
		webtest.click("id=submit");
	}
}
