package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class AdminPage extends BasePage {
    @FindBy(xpath = "//h1[text() ='Dashboard']")
    private WebElement dashBoardText;
    public AdminPage(WebDriver driver) {
        super(driver);
    }
    public void checkDashBoardVisible(){
        isElementVisible(dashBoardText);
        Assert.assertEquals(getDriver().getCurrentUrl(), "https://phptravels.net/api/admin");
    }
}
