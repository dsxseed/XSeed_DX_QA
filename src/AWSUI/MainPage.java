package AWSUI;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class MainPage {
	
	public static void main(String [] args){
		
	
	//System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
	 //System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
	System.setProperty("webdriver.chrome.driver","D://Chrome//chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("http://54.169.104.165/");
	
	driver.findElement(By.xpath("//button//span[contains(text(),'SignIn')]")).click();
	 WebDriverWait wait = new WebDriverWait(driver, 80);
	 WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='myModal-1']//div//span[contains(text(),'Admin SignIn')]")));
	 ele.click();
	 driver.findElement(By.xpath("//*[@id='myModal-1']//div//following-sibling::div[@class='form-login']//input[@type='text']")).sendKeys("renjith.ponnappan@xseededucation.com");
	 
	 WebElement chkbox= driver.findElement(By.xpath("//*[@id='myModal-1']//div//following-sibling::div[@class='form-login']//input[@type='checkbox']"));
	 boolean bval = chkbox.isSelected();
	 if (!bval) chkbox.click();
	 driver.findElement(By.xpath("//*[@id='myModal-1']//div//following-sibling::div[@class='form-login']//button[contains(text(),'Login')]")).click();
	 driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	 driver.findElement(By.xpath("//*[@id='myModal-1']//div//following-sibling::div[@class='form-login']//input[@type='password' and @name='password']")).sendKeys("12345678");
	 driver.findElement(By.xpath("//*[@id='myModal-1']//div//following-sibling::div[@class='form-login']//button[contains(text(),'Submit')]")).click();
	 driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	 driver.findElement(By.xpath("//div[@class='top_nav row']//span[@class='fa fa-angle-down']")).click();
	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 driver.findElement(By.xpath("//div[@class='top_nav row']//ul//li//ul//li[4]")).click();
	 //driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
	//driver.findElement(By.name("emailphone")).sendKeys("Hello");;
	//driver.findElement(By.xpath("//*[@id='myModal-1']//div//span[contains(text(),'Admin SignIn')]")).click();
	//*[@id='myModal-1']/div/div/div[2]/div/div/ul/li[2]/a
//	driver.findElement(By.xpath("//*[@id=\"myModal-1\"]/div/div/div[2]/div/div/ul/li[2]/a/span")).click();
	//*[@id="myModal-1"]/div/div/div[2]/div/div/ul/li[2]/a/span
	//*[@id='myModal-1']//a//span[contains(text(),'Admin SignIn')]"
	//*[@id="myModal-1"]/div/div/div[2]/div/form/div/div/div/div/div[5]/button
	//li[contains(@class,'panel with-nav-tabs panel-default')/a
	
	}
}
