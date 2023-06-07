package steps;

import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import pages.loginPage;
import org.openqa.selenium.chrome.ChromeDriver;

public class testBase {

    protected WebDriver _driver = hook.getdriver();

    protected loginPage _loginpage = new loginPage(_driver);
}
