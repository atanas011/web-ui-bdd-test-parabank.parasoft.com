package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import pages.Login;

public class Steps {

    private WebDriver driver;

    @Before
    public void setUp() {
        driver = new EdgeDriver();
        driver.manage().window().maximize();
    }

    @Given("User is on the Login page of the ParaBank app")
    public void user_is_on_the_login_page_of_the_para_bank_app() {
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
    }

    @When("User submits valid {string} and {string}")
    public void user_submits_valid_credentials(String username, String password) {
        new Login(driver).submit(username, password);
    }

    @Then("Overview page is displayed")
    public void overview_page_is_displayed() {
        Assert.assertTrue(driver.getCurrentUrl().contains("overview"));
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}