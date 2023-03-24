package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Overview {

    private final WebDriver driver;
    private final By smallTxt = By.className("smallText");
    private final By logoutBtn = By.linkText("Log Out");

    public Overview(WebDriver driver) {
        this.driver = driver;
    }

    public String getSmallText() {
        return driver.findElement(smallTxt).getText();
    }

    public void logOut() {
        driver.findElement(logoutBtn).click();
    }
}