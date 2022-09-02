package Testng_script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Generic {
public WebDriver driver;
@BeforeMethod
public void openAplln()
{
	System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
	driver=new FirefoxDriver();
	driver.get("https://www.facebook.com");
}
@AfterMethod
public void closeAppln() throws InterruptedException
{
	Thread.sleep(2000);
	driver.quit();
}
}
