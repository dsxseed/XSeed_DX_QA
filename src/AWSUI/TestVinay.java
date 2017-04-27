package AWSUI;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class TestVinay {
	
	public static void main(String [] args){
		
	
	//System.setProperty("webdriver.gecko.driver", "C://Users//Admin//Downloads//geckodriver-v0.15.0-win64//geckodriver.exe");
	 //System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
	System.setProperty("webdriver.chrome.driver","D://Chrome//chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	//WebDriver driver1 =new FirefoxDriver();
	
	driver.get("http://www.google.com");
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	try{
	WebElement e1= driver.findElement(By.id("lst-ib"));
	
	WebElement e2= driver.findElement(By.xpath(".//*[@id='lst-ib']"));
	/*driver.findElement(By.name("btnI")).click();
	{
		driver.findElement(By.id("searchinput")).sendKeys("hiiii");;
		driver.findElement(By.id("searchbtn")).click();
		
	}
	*/
	e1.sendKeys("hello");
    WebDriverWait wait = new WebDriverWait(driver,20);
    driver.findElement(By.id("_fZl")).click();
    
    List<WebElement> links = driver.findElements(By.tagName("h3"));
    System.out.println(links);
	System.out.println(links.size());

	for (int i = 1; i<=links.size(); i++)

	{

		System.out.println(links.get(i).getText());

	}
	/*List <WebElement> l1 =  driver.findElements(By.className("sbqs_c"));
	for (WebElement webElement : l1) {
	    if (webElement.getText().equalsIgnoreCase("your item to select"))
	        webElement.click();
	}*/
	/*List<WebElement> allOptions = driver.findElements(By.className("sbsb_b"));
	
	for (int i = 0; i < allOptions.size
	(); i++) {
		String option = allOptions.get(i).getText();
		System.out.println(option);
		
		
		
	}*/
	//*[@id="sbse0"]/div[2]	
	/*Iterator<WebElement> i1 = l1.iterator();
		while (i1.hasNext()){
			System.out.println(i1.next().getText());
		}*/
	}
	
	catch(Exception e){
		System.out.println(e.getMessage());
	}
	//.sendKeys(String.valueOf(30));
	finally{
	//driver.quit();
	}
	
		
	}
}