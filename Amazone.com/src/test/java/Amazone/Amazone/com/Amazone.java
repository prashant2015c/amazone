package Amazone.Amazone.com;

import org.openqa.selenium.chrome.ChromeDriver;

public class Amazone {
	static ChromeDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("https://www.amazon.com/");

	}

}
