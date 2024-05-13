package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\hp\\IdeaProjects\\Luma_automate\\src\\test\\Mag\\Luma_Feature.feature",
        glue = "Stepdef",dryRun = false)
public class Sign_runner {
    public static WebDriver driver;
    @BeforeClass

    public static void browse(){
        driver = new ChromeDriver();
    }
}
