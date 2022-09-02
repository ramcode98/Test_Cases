package POM_script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facebook_login {
	@FindBy(xpath="//input[@id='email']")
	private WebElement UN;
	@FindBy(xpath="//input[@id='pass']")
	private WebElement Pwd;
	@FindBy(xpath="//button[@type='submit']")
	private WebElement Sub;
	
	public Facebook_login(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void ClickUN(String un)
	{
		UN.sendKeys(un);
	}
	public void ClickPwd(String pwd)
	{
		 Pwd.sendKeys(pwd);
	}
	public void ClickSub()
	{
		Sub.click();
	}


}
