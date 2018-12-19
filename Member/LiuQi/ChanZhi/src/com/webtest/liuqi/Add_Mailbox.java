package liuqi;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import com.webtest.core.*;
import com.webtest.demo.*;
/*作者：刘琪
 * 12.添加开放登录（站点-语言设置-接口）*/
public class Add_Mailbox extends BaseTest{
	@Test
	public void addMailbox() throws Exception{
		Back_Login.backLogin();
		webtest.click("xpath=//a[contains(.,'站点')]");
		webtest.click("xpath=//a[contains(.,'语言设置')]");
		webtest.click("xpath=//a[contains(.,'接口')]");
		webtest.click("xpath=//a[contains(.,'发信设置')]");
		webtest.type("id=fromAddress", "1138322644@qq.com");
		webtest.click("id=submit");
		Thread.sleep(3000);
		webtest.type("id=password", "WOSHILIUQI0214");
		webtest.click("id=submit");
	}
}
