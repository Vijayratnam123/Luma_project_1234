package Aut;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;


public class Base_Class {
    public static WebDriver driver;
    public static JavascriptExecutor js;
    public static void url(WebDriver driver, String a){
        driver.get(a);
    }
    public static void crd(WebElement c, String d){
        c.sendKeys(d);
    }
    public static void btn(WebElement v){
        v.click();
    }
    public static void maxi (WebDriver driver){
        driver.manage().window().maximize();
    }
    public static void todrop(WebElement wl, String st){
        Select s = new Select(wl);
        s.selectByValue(st);
    }
    public static <driver> void scroll(WebDriver driver, WebElement ref) {
        js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true)", ref);
    }
        public static void screenshot(WebDriver driver, String st) throws IOException {
            TakesScreenshot ts = (TakesScreenshot)driver;
            File src =ts.getScreenshotAs(OutputType.FILE);
            File des = new File("C:\\Users\\hp\\IdeaProjects\\Luma_automate\\src\\test\\sshot"+st+".Png");
            FileUtils.copyFile(src,des);

        }
    }
