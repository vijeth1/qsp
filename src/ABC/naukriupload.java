package ABC;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;

public class naukriupload {

	public static void main(String[] args) throws InterruptedException, IOException {
		 WebDriver driver;
		System.setProperty("webdriver.gecko.driver","E:\\geckodriver.exe");
			driver=new FirefoxDriver();
				//driver.get("https://www.google.co.in/?gfe_rd=cr&ei=EFNPWdTqE7Tl8AeXw6WoBw");
			 driver.get("https://login.naukri.com/nLogin/Login.php?msg=0&URL=http%3A%2F%2Fmy.naukri.com");
			 Thread.sleep(5000);
			 driver.findElement(By.id("emailTxt")).sendKeys("vickysv5274@gmail.com");
					 driver.findElement(By.id("pwd1")).sendKeys("9900311836v");
					 
					 driver.findElement(By.xpath("//input[@data-ga-track='NormalLogin_LP|NormalLogin']")).click();
					 System.out.println("Naukri home page dispalayed");//button[@class='w205']
					 Thread.sleep(5000);
					 driver.findElement(By.xpath("//button[@class='w205']")).click();
					 Thread.sleep(5000);
					 driver.findElement(By.id("uploadLink")).click();
					 driver.findElement(By.id("attachCV")).sendKeys("D:\\56681_Vijetha_S_V_3.1 years experience in manual testing.doc");
					 driver.findElement(By.id("attachCV")).click();
					 Thread.sleep(5000);
				 driver.findElement(By.xpath("//button[@type='button']")).click();
					 Runtime.getRuntime().exec("C:\\Users\\win8.1\\Desktop\\res.exe");
					 Thread.sleep(5000);
					 driver.findElement(By.xpath("//button[@type='button']")).click();
	}
	}

