package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
//import org.openqa.selenium.edge.EdgeDriver;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class hook {


    @Managed
    private static WebDriver driver;
    @Before
    public void SetUp() {
        //System.setProperty("webdriver.edge.driver","./src/main/resources/drivers/win/msedgedriver.exe");
        System.setProperty("webdriver.chrome.driver","./src/main/resources/drivers/win/chromedriver.exe");
        //driver = new EdgeDriver();

        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.facebook.com/");
    }

    @After
    public void TearDownTest() {
        if (driver != null){
            driver.quit();
        }

    }

    public static WebDriver getdriver(){
        return driver;
    }
}
