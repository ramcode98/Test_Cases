package Test_Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import POM_script.Facebook_login;
import Testng_script.Generic1;

public class Facebook extends Generic1 {
@Test
public void Login() throws InterruptedException
{
	Facebook_login f=new Facebook_login(driver);
	f.ClickUN("9632050376");
	Thread.sleep(2000);
	f.ClickPwd("ರಾಮಾಚಾರಿ");
	Thread.sleep(2000);
	f.ClickSub();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//span[.='Photo/video'])[1]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//span[@class='d2edcug0 hpfvmrgz qv66sw1b c1et5uql lr9zc1uh a8c37x1j fe6kdd0r mau55g9w c8b282yb keod5gw0 nxhoafnm aigsh9s9 d3f4x2em mdeji52x a5q79mjw g1cxx5fr ekzkrbhg oo9gr5id hzawbc8m'])[4]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[.='Done']")).click();
	Thread.sleep(2000);
	WebElement ele = driver.findElement(By.xpath("//i[@style='background-image: url(\"https://static.xx.fbcdn.net/rsrc.php/v3/y-/r/yoCftpI9YQX.png\"); background-position: 0px -58px; background-size: auto; width: 20px; height: 20px; background-repeat: no-repeat; display: inline-block;']"));
	Thread.sleep(2000);
	ele.click();
	Thread.sleep(2000);
	ele.sendKeys("C:\\Users\\ramr4\\Downloads\\WhatsApp Image 2021-11-30 at 1.23.40 PM.jpeg");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@class='bp9cbjyn j83agx80 taijpn5t c4xchbtz by2jbhx6 a0jftqn4']")).click();
	Thread.sleep(2000);
}
}
