package Amazone.Amazone.com;

import javax.swing.text.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.base.Verify;

public class Amazone {
	static ChromeDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("https://www.amazon.com/");
		 String title = driver.getTitle();
	WebElement el =  driver.findElement(By.xpath("//*[@id='nav-xshop']/a[3]"));
	
	Actions ac = new Actions(driver);
	
	ac.moveToElement(el).click().keyDown(el,Keys.SHIFT).sendKeys(el , "hello").keyUp(el,Keys.SHIFT);
	
		 Verify.verify(title.contains("amz"),"amzone");


	}

}
