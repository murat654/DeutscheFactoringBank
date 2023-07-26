package com.dfb.pages;

import com.dfb.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPasswordPage {
    public ForgotPasswordPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "username")
    public WebElement usernameInput;

    @FindBy(xpath = "//*[@id=\"kc-form-buttons\"]/input")
    public WebElement loginButton;

    @FindBy(xpath = "//*[@id=\"kc-content-wrapper\"]/div[1]/span[2]")
    public WebElement errorMessageParagraph;
}