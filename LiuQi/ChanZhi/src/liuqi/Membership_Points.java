package liuqi;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import com.webtest.core.*;
import com.webtest.demo.*;
/*作者：刘琪
 * 35.会员奖励积分（会员-操作-积分）（前提有会员）*/
public class Membership_Points extends BaseTest{
	@Test
	public void menbershipPoints() throws Exception{
		Back_Login.backLogin();
		webtest.click("xpath=//a[contains(.,'会员')]");
		webtest.click("xpath=//input[@value='gaya']");
		webtest.tapClick();
		webtest.tapClick();
		webtest.tapClick();
		webtest.tapClick();
		webtest.enterClick();
		webtest.click("xpath=//a[contains(.,'奖励积分')]");
		webtest.type("id=count", "1");
		webtest.type("id=note", "备份");
		webtest.click("id=submit");
	}

}
