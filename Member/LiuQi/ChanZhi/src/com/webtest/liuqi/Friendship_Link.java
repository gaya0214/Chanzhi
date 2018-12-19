package liuqi;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import com.webtest.core.*;
import com.webtest.demo.*;
/*作者：刘琪
 * 27.友情链接（推广-友情链接）*/
public class Friendship_Link  extends BaseTest{
	@Test
	public void friendshipLink()throws Exception{
		Back_Login.backLogin();
		webtest.click("xpath=//a[contains(.,'推广')]");
		webtest.click("xpath=//a[contains(.,'友情链接')]");
		webtest.click("xpath=//th[contains(.,'首页链接')]");
		webtest.tapClick();
		webtest.tapType("123");
		webtest.click("xpath=//th[contains(.,'所有链接')]");
		webtest.tapClick();
		webtest.tapType("所有链接");
		webtest.click("id=submit");
	}
}
