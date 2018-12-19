package liuqi;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import com.webtest.core.*;
import com.webtest.demo.*;
/*作者：刘琪
 * 39.轮播图添加分组（设计-轮播图）*/
public class Rotary_Graph extends BaseTest{
	@Test
	public void rotaryGraph() throws Exception{
		Back_Login.backLogin();
		webtest.click("xpath=//a[contains(.,'设计')]");
		webtest.click("xpath=//a[contains(.,'组件')]");
		webtest.click("xpath=//i[contains(@class,'icon-plus-sign icon icon-3x')]");
		webtest.click("xpath=//a[contains(.,'添加轮播图')]");
		webtest.type("id=name", "轮播图分组名称一");
		webtest.click("xpath=//input[@value='添加分组']");
		}
}
