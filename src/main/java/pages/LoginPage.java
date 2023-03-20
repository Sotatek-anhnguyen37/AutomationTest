package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class LoginPage extends BasePage {
    @FindBy(xpath = "//input[@type='password']/parent::label/parent::div/preceding-sibling::div//input")
    private WebElement emailTextBox;
    private final String spanEmailTextBox = "//input[@type='password']/parent::label/parent::div/preceding-sibling::div//input/following-sibling::span";
    private final String spanPasswordText =  "//input[@type='password']/following-sibling::span";
    @FindBy(xpath = "//input[@type='password']")
    private WebElement passwordTextBox;
    @FindBy(xpath = "//span[text() ='Login']")
    private WebElement loginBtn;
    @FindBy(xpath = "//label[normalize-space()='Remember me']/div")
    private WebElement checkboxRememberMe;
    public LoginPage(WebDriver driver) {
        super(driver);
    }
    public void clickEmailTextBox(){
        clickElement(emailTextBox);
    }
    public void clickPasswordTextBox(){
        clickElement(passwordTextBox);
    }
    public void sendKeyEmailTextBox(String value){
        sendKeyElement(emailTextBox, value);
    }
    public void sendKeyPasswordTextBox(String value){
        sendKeyElement(passwordTextBox, value);
    }
    public void clickLoginBtn (){
        clickElement(loginBtn);
    }
    public void checkPlaceHolderEmail(){
        Assert.assertEquals(driver.findElement(By.xpath(spanEmailTextBox)).getText(), "Email");
//        Assert.assertEquals(emailTextBox.getAttribute("placeholder"), "Email");
    }
    public void checkPlaceHolderPassword(){
        Assert.assertEquals(driver.findElement(By.xpath(spanPasswordText)).getText(), "Password");
//        Assert.assertEquals(passwordTextBox.getAttribute("placeholder"), "Password");
    }
    public void clickRememeberMe(){
        clickElement(checkboxRememberMe);
    }
    public void checkStatusRememberMe(){
        Assert.assertTrue(checkboxRememberMe.getAttribute("class").toUpperCase().contains("CHECKED"));
    }
}
