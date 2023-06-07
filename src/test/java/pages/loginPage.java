package pages;

import org.openqa.selenium.By;
import base.base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginPage extends base{

    public loginPage(WebDriver driver) {
        super(driver);
    }

    By btningresar = By.name("login");
    By txtUserName = By.id("email");
    By txtPassword = By.id("pass");
    By btnBuscarAmigos = By.xpath("//span[contains(text(),'Buscar amigos')]");
    public void iniciar_sesion(String user, String pwd) {
        wait(10, btningresar);
        type(user, txtUserName);
        type(pwd, txtPassword);
        click(btningresar);
        wait(10, btnBuscarAmigos);
    }

}
