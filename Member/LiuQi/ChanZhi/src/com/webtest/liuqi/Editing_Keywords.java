package liuqi;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import com.webtest.core.*;
import com.webtest.demo.*;
/*作者：刘琪
 * 46.编辑关键词（推广-关键词-编辑链接）（前提是有关键词）*/
public class Editing_Keywords extends BaseTest{
	@Test
	public void editingKeywords() throws Exception{
		Back_Login.backLogin();
		webtest.click("xpath=//a[contains(.,'推广')]");
		webtest.click("xpath=//a[contains(.,'关键词')]");
		webtest.click("xpath=//a[contains(.,'编辑链接')]");
		webtest.type("id=link","http://www.baidu.com");
		webtest.click("id=submit");
}
}