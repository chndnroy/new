package xyz;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launchChromew {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/home/ttuser10/Desktop/chromedriver");
		WebDriver driver=new ChromeDriver();
	}

}
