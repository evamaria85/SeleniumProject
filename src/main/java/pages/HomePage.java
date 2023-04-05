package pages;

import browser.Browser;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static browser.Browser.getPropertyValue;



public class HomePage {
    @FindBy(css = "txtUsername") private WebElement userNameElement;
    @FindBy(css = "txtPassword") private WebElement passwordElement;
    @FindBy(id="btnlogin") private WebElement loginButton;

    public void logIn(){
        userNameElement.sendKeys(getPropertyValue("username"));
        passwordElement.sendKeys(getPropertyValue("password"));
        loginButton.click();
    }



}
