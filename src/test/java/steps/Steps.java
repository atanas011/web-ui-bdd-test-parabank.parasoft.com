package steps;

import base.BaseUtil;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import pages.Login;
import pages.Overview;

import static org.junit.Assert.assertTrue;

public class Steps extends BaseUtil {

    private WebDriver driver;
    private final BaseUtil baseutil;
    private Overview overview;

    public Steps(BaseUtil util) {
        baseutil = util;
    }

    @Before
    public void setUp() {
        driver = new EdgeDriver();
        driver.manage().window().maximize();
    }

    @Given("User is on the Login page of the ParaBank app")
    public void user_is_on_the_login_page_of_the_para_bank_app() {
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
    }

    @When("User enters valid {string} and {string} with {string}")
    public void user_submits_valid_credentials(String username, String password, String fullName) {
        baseutil.fullName = fullName;
        overview = new Login(driver).submit(username, password);
    }

    @Then("Overview page is displayed")
    public void overview_page_is_displayed() {
        assertTrue(overview.getSmallText().contains(baseutil.fullName));
        overview.logOut();
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}