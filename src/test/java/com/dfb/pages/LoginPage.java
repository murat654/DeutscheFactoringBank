package com.dfb.pages;

import com.dfb.utilities.Driver;
import com.dfb.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id=\"kc-form-login\"]/div[3]/div[2]/span/a")
    public WebElement forgotYourPassLink;
}
