package com.webtest.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class AddEssayclass {
	@Test
    public void addclass() throws InterruptedException {
    	System.setProperty("webdriver.gecko.driver", "E:\\SoftwareTesting\\geckodriver.exe");
    	WebDriver driver=new FirefoxDriver();
    	driver.get("http://localhost:8032/chanzhi/www/admin.php");
    	driver.findElement(By.id("account")).sendKeys("admin");
    	driver.findElement(By.id("password")).sendKeys("123456");
    	driver.findElement(By.id("submit")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.linkText("文章")).click();
    	Thread.sleep(1000);
    	driver.findElement(By.linkText("维护类目")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//*[@id=\"children[]\"]")).sendKeys("类1");
    	driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
    	Thread.sleep(2000);
    }
}
