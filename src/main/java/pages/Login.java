package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {

    private final WebDriver driver;
    private final By username = By.name("username");
    private final By password = By.name("password");

    public Login(WebDriver driver) {
        this.driver = driver;
    }

    public Overview submit(String user, String pass) {
        driver.findElement(username).sendKeys(user);
        driver.findElement(password).sendKeys(pass);
        driver.findElement(username).submit();
        return new Overview(driver);
    }
}