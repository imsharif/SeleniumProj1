package sampleTestPackage;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScreenshotClass {
WebDriver driver;
public static void main(String[] args)throws IOException  {
		// TODO Auto-generated method stub
		
   System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yousuf Paru\\Downloads\\Automation\\chromedriver_win32/chromedriver.exe");
   WebDriver driver = new ChromeDriver();
   driver.manage().window().maximize();
   driver.get("https://www.myntra.com/");
   WebElement from = driver.findElement(By.className("desktop-userIconsContainer"));
   Actions acc = new Actions(driver);
   acc.moveToElement(from).perform();
   driver.findElement(By.linkText("LOGIN")).click();
   driver.findElement(By.name("email")).sendKeys("imsharif@ymail.com");
   driver.findElement(By.name("password")).sendKeys("chaingang");
   driver.findElement(By.xpath("//button[@class='login-login-button']")).click();

}	
}
 