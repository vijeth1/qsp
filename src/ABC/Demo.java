package ABC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Demo {
public WebDriver driver;
@BeforeMethod
public void Openbrowser(){
	System.setProperty("webdriver.gecko.driver","E:\\geckodriver.exe");
	driver=new FirefoxDriver();
}
@Test
public void testA() throws InterruptedException{
	driver.get("http://localhost/login.do");
	String actual=driver.getTitle();
	SoftAssert sa=new SoftAssert();
	sa.assertEquals(actual, "invalid");
	Thread.sleep(5000);
	driver.findElement(By.id("username")).sendKeys("viju");
	sa.assertAll();
}
	@AfterMethod
	public void closebrowser(){
		driver.quit();
	}

}

