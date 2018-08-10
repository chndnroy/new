package xyz;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FlightBookOneWay {
	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.gecko.driver","/home/ttuser10/Downloads/geckodriver");
//		WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "/home/ttuser10/Desktop/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://192.168.1.229:8080/satguruportal/login/loginForm");
		Thread.sleep(5000);
		
	    driver.findElement(By.id("Agency Code")).sendKeys("AGN110");
	    driver.findElement(By.id("userAlias")).sendKeys("tt@gmail.com");
	    driver.findElement(By.id("password")).sendKeys("n6xjh%r7");
	    driver.findElement(By.xpath("//input[@value='Login']")).click();
	    driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//img[@alt='flight-icon']")).click();
	    driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
	    driver.findElement(By.id("startingFrom_1")).sendKeys("DEL");
	    driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
	    driver.findElement(By.id("startingFrom_1")).sendKeys(Keys.ENTER);
	    driver.findElement(By.id("goingTo_1")).sendKeys("BOM");
	   Thread.sleep(2000);
	   driver.findElement(By.id("goingTo_1")).sendKeys(Keys.ENTER);
	    driver.findElement(By.id("datePicker_1")).click();
	   //driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
	   Select month= new Select(driver.findElement(By.xpath("//select[@data-handler='selectMonth']")));
	   month.selectByIndex(1);
	   driver.findElement(By.xpath("//a[contains(text(),'20')]")).click();
	    driver.findElement(By.xpath("// div[@id='one-way']//input[@value='SEARCH']")).click();
	    driver.manage().timeouts().implicitlyWait(90000, TimeUnit.SECONDS);
	    //driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("(//a[contains(text(),'Book Now')])[1]")).click();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	    driver.findElement(By.xpath("//a[contains(text(),'NO THANKS')]")).click();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//a[contains(text(),'Continue')]")).click();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   Select title=new Select(driver.findElement(By.id("passengerTitle_0")));
	   title.selectByIndex(1);
	   driver.findElement(By.id("passengerFirstName_0")).sendKeys("abc");
	   driver.findElement(By.id("passengerLastName_0")).sendKeys("xyz");
	   driver.findElement(By.xpath("//img[@class='ui-datepicker-trigger']")).click();
	   Select year= new Select(driver.findElement(By.xpath("//select[@data-handler='selectYear']")));
	   year.selectByIndex(1);
	   Select month1= new Select(driver.findElement(By.xpath("//select[@data-handler='selectMonth']")));
	   month1.selectByIndex(1);
	   driver.findElement(By.xpath("//a[contains(text(),'19')]")).click();
	   driver.findElement(By.id("passengerEmail_0")).sendKeys("abc@xyz.com");
	   driver.findElement(By.id("passengerMobile_0")).sendKeys("9999999999");
	   Select gender= new Select(driver.findElement(By.id("passengerGender_0")));
	   gender.selectByIndex(1);
	   driver.findElement(By.id("passengerPassport_0")).sendKeys("abcxyz123");
	   driver.findElement(By.id("passengerPassExp_0")).click();
	   //driver.findElement(By.xpath("//option[@value='2018']")).click();
	   Select year1= new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-year']")));
	   year1.selectByIndex(3);
	   Select month2= new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-month']")));
	   month2.selectByIndex(2);
	   driver.findElement(By.xpath("//a[contains(text(),'19')]")).click();
	   driver.findElement(By.id("flagstrap-drop-down-0")).click();
	   driver.findElement(By.xpath("//a[@data-val='IN']")).click();
	   
//	   Select nationality= new Select(driver.findElement(By.id("flagstrap-drop-down-0")));
//	   nationality.selectByIndex(1);
	   
	   driver.findElement(By.xpath("//input[@value='Book']")).click();
	   Thread.sleep(5000);
	   driver.findElement(By.xpath("//input[@value='Pay']")).click();
	   
	}

}