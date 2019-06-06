package psr.pgm.base;

import org.openqa.selenium.WebElement;

public class SampleBaseUse extends BaseClass
{

	public static void main(String[] args) 
	{
		getDriver();
		window();
		loadUrl("https://www.facebook.com/");
		WebElement email = findelement("//input[@id = 'email']");
		WebElement password = findelement("//input[@id = 'pass']");
		WebElement btnClick = findelement("//input[@value = 'Log In']");
		enter(email, "praveenkrce@gmail.com");
		enter(password, "praveenkumar");
		btnClk(btnClick);
	}

}
