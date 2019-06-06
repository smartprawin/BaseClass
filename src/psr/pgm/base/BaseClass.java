package psr.pgm.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass 
{
	static WebDriver driver;
	public static WebDriver getDriver()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\64 bit\\Praveen_selenium\\BaseClass\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		return driver;		
	}
	
	public static void loadUrl(String url)
	{
		driver.get(url);
	}
	
	public static void enter(WebElement element, String name) 
	{
		element.sendKeys(name);
	}
	
	public static void btnClk(WebElement element)
	{
		element.click();
	}
	
	public static void quitBrowser()
	{
		driver.quit();
	}
	
	public static void window()
	{
		driver.manage().window().maximize();
	}
	
	public static WebElement findelement(String x_path) 
	{
		WebElement find = driver.findElement(By.xpath(x_path));
		return find;
	}
	
}
