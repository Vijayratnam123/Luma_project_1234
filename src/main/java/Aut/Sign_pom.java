package Aut;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sign_pom {
    public static WebDriver driver;
    @FindBy(linkText="Sign In")
    private WebElement sign_click;

    @FindBy(xpath = "//input[@name=\"login[username]\"]")
    private WebElement uname;

    @FindBy(xpath = "//input[@name=\"login[password]\"]")
    private WebElement pwd;

    @FindBy(xpath = "(//button[@type=\"submit\"])[2]")
    private WebElement sign_btn;
    @FindBy(xpath = "(//button[@class=\"action switch\"])[1]")
    private WebElement down_arrow;

    @FindBy(linkText= "Sign Out")
    private WebElement sign_out;

    public WebElement getSign_click() {
        return sign_click;
    }

    public WebElement getUname() {
        return uname;
    }

    public WebElement getPwd() {
        return pwd;
    }

    public WebElement getSign_btn() {
        return sign_btn;
    }

    public WebElement getDown_arrow() {
        return down_arrow;
    }

    public WebElement getSign_out() {
        return sign_out;
    }

    public Sign_pom(WebDriver driver1){
        this.driver=driver1;
        PageFactory.initElements(driver,this);
    }


}
