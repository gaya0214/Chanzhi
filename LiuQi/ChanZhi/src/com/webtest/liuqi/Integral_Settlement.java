package liuqi;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import com.webtest.core.*;
import com.webtest.demo.*;
/*作者：刘琪
 * 11.点击积分结算（站点-语言设置-积分）*/
public class Integral_Settlement extends BaseTest{
	@Test
	public void integralSettlement() throws Exception{
		Back_Login.backLogin();
		webtest.click("xpath=//a[contains(.,'站点')]");
		webtest.click("xpath=//a[contains(.,'语言设置')]");
		webtest.click("xpath=//a[contains(.,'积分')]");
		webtest.click("xpath=//a[contains(.,'积分结算')]");
		webtest.click("id=submit");
		
		
	}

}
