package actitimeautomation.imp1.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Properties;

public class MainImplement implements PropertyHandling2 , BaseClassInter{
    public WebDriver driver;
    String filePath = System.getProperty("user.dir")+ "/config.properties";
    //2. access the config.properties file
    FileInputStream inputStream= new FileInputStream(filePath);
    //3. create an object of Properties class
    Properties properties = new Properties();
    public MainImplement() throws FileNotFoundException {
    }

    @Override
    public String getProperty(String key)
    {   return properties.getProperty(key);
    }

    public void launchBrowser(String browserName) {
        if (browserName.equals("chrome")) {
            driver = new ChromeDriver();
        } else if (browserName.equals("firefox")) {
            driver = new FirefoxDriver();
        }
        driver.manage().window().maximize();
    }


}
