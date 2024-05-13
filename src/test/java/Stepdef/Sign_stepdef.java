package Stepdef;

import Aut.Base_Class;
import Aut.Sign_pom;
import Runner.Sign_runner;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class Sign_stepdef extends Base_Class {

    WebDriver driver = Sign_runner.driver;
    Sign_pom sp = new Sign_pom(driver);

    @Given("Launching the URL link")
    public void launching_the_url_link() {
        url(driver,"https://magento.softwaretestingboard.com/");
        driver.manage().window().maximize();
    }
    @Given("Clik the Signin link")
    public void clik_the_signin_link() {
        btn(sp.getSign_click());
    }
    @Given("User Enter the valid Email {string} and valid password {string}")
    public void user_enter_the_valid_email_and_valid_password(String string, String string2) {
          crd(sp.getUname(),string);
          crd(sp.getPwd(),string2);
    }
    @Given("Enter the Signin Button")
    public void enter_the_signin_button() {
        btn(sp.getSign_btn());
    }
    @Given("Take the screenshot of the curretnt page")
    public void take_the_screenshot_of_the_curretnt_page() throws IOException, InterruptedException {
        Thread.sleep(3000);
        screenshot(driver,"login");
    }
    @Given("User Signin Successfully")
    public void user_signin_successfully() {
       String act = driver.findElement(By.xpath("(//span[text()='Welcome, vijay ratnam!'])[1]")).getText();
        String expect = "Welcome, vijay ratnam!";
        assertEquals(expect,act);
        System.out.println("Expected Text:" +expect);
        System.out.println(".....................................");

        System.out.println("actual" +act);
    }


    @Given("User select the downarrow link")
    public void user_select_the_downarrow_link() throws InterruptedException {
        Thread.sleep(5000);
        btn(sp.getDown_arrow());
    }
    @Given("Clik the Signout button")
    public void clik_the_signout_button() throws InterruptedException {
        Thread.sleep(5000);
        btn(sp.getSign_out());

        }
    @And("User enter the Invalid Email {string} and valid password {string}")
    public void userEnterTheInvalidEmailAndValidPassword(String string, String string2) {
        crd(sp.getUname(),string);
        crd(sp.getPwd(),string2);
    }

    @Given("User user login failed")
    public void user_user_login_failed() {
        String actual = driver.findElement(By.xpath("//div[text()=\"The account sign-in was incorrect or your account is disabled temporarily. Please wait and try again later.\"]")).getText();
        String exp = "The account sign-in was incorrect or your account is disabled temporarily. Please wait and try again later.";
        assertEquals(actual,exp);
        System.out.println("exp" +exp);
        System.out.println("actual" +actual);

    }

    @Given("Take the screenshot of the Error page")
    public void take_the_screenshot_of_the_error_page() throws IOException {
        screenshot(driver,"invalid");
    }



}
