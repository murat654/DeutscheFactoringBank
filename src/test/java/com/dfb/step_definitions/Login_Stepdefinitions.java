package com.dfb.step_definitions;

import com.dfb.pages.ForgotPasswordPage;
import com.dfb.pages.LoginPage;
import com.dfb.utilities.ConfigurationReader;
import com.dfb.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class Login_Stepdefinitions {
    LoginPage loginPage = new LoginPage();
    ForgotPasswordPage forgotPasswordPage = new ForgotPasswordPage();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("loginPageUrl"));
    }

    @Given("user clicks to forgot password link")
    public void user_clicks_to_forgot_password_link() {
        loginPage.forgotYourPassLink.click();
    }

    @Given("user enters username {string} on the ForgotPasswordPage")
    public void user_enters_username_on_the_forgot_password_page(String username) {
        if (username.equals("[blank]")) {
            forgotPasswordPage.usernameInput.sendKeys(" ");
        } else {
            forgotPasswordPage.usernameInput.sendKeys(username);
        }
    }

    @Given("user clicks to the send button on the ForgotPasswordPage")
    public void user_clicks_to_the_send_button_on_the_forgot_password_page() {
        forgotPasswordPage.loginButton.click();
    }

    @Then("user sees Identity not registered message")
    public void user_sees_identity_not_registered_message() {
        Assert.assertEquals(ConfigurationReader.getProperty("forgotPasswordErrorMessageInEnglish"), forgotPasswordPage.errorMessageParagraph.getText());
    }
}
