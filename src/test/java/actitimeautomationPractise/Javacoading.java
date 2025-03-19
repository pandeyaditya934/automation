package actitimeautomationPractise;

import actitimeautomation.imp1.common.BaseClass;
import actitimeautomation.imp1.common.CommonUtil;
import actitimeautomation.imp1.common.CommonUtil2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import javax.swing.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class Javacoading extends BaseClass
{   WebDriver driver;
    CommonUtil2 commonUtil2;
    Actions actions;
    @BeforeClass
    public void imp()
    {   launchBrowser("chrome");
        driver=super.driver;
        commonUtil2=new CommonUtil2(driver);
        actions =new Actions(driver);
    }

    @Test
    public void launchFlipkart()
    {   driver.get("https://www.flipkart.com/");
        commonUtil2.elementClickable(By.xpath("//input[@class='Pke_EE']"));
        actions.click(driver.findElement(By.xpath("//input[@class='Pke_EE']")))
                .sendKeys("harry Potter books").click(driver.findElement(By.xpath("//button[@class='_2iLD__']"))).build().perform();
        List<WebElement> allatags=driver.findElements(By.tagName("a"));
        for(WebElement tags:allatags)
        {   String url= tags.getAttribute("href");
            System.out.println(url);
        }
    }
}

