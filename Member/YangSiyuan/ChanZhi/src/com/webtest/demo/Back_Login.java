package com.webtest.demo;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class Back_Login extends BaseTest{
	@Test
	public static void backLogin() {
		webtest.open("http://localhost:8032/chanzhi/www/admin.php");
		webtest.click("id=account");
		webtest.type("id=account","YSY");
		webtest.type("id=password", "3927");
		webtest.click("id=submit");
		webtest.pause(3000);
	}
	
//	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.gecko.driver","E:\\Junior\\Test\\geckodriver.exe");
//		WebDriver driver=new FirefoxDriver();
//		driver.get("http://localhost:8032/chanzhi/www/admin.php");
//		Thread.sleep(3000);
//		WebElement account=driver.findElement(By.id("account"));
//		account.sendKeys("YSY");
//		WebElement password=driver.findElement(By.id("password"));
//		password.sendKeys("3927");
//		WebElement sub=driver.findElement(By.id("submit"));
//		sub.click();
//		
//	}
	
}
