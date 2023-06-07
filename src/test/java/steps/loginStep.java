package steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.loginPage;

import java.util.List;

public class loginStep extends testBase{

    @Given("que realizo el login de facebook")
    public void queRealizoElLoginDeFacebook(DataTable table) {

        List<List<String>> data = table.asLists(String.class);
        String user = data.get(1).get(0);
        String pwd = data.get(1).get(1);
        _loginpage.iniciar_sesion(user,pwd);
    }

}
