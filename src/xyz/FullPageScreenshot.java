package xyz;
import java.io.File;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.imageio.ImageIO;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;
 
public class FullPageScreenshot {
 public static void main(String args[]) throws Exception{
     //Modify the path of the GeckoDriver in the below step based on your local system path
            System.setProperty("webdriver.chrome.driver", "/home/ttuser10/Desktop/chromedriver");
            // Instantiation of driver object. To launch Firefox browser
     WebDriver driver = new ChromeDriver();
            // To oepn URL "http://softwaretestingmaterial.com"
    Date d=new Date();
    System.out.println(d);
     long b = System.currentTimeMillis();
     driver.get("https://www.softwaretestingmaterial.com");
     Thread.sleep(2000);
     Screenshot fpScreenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
     ImageIO.write(fpScreenshot.getImage(),"PNG",new File("/home/ttuser10/Desktop/testShots/"+d+".png"));
        }
}