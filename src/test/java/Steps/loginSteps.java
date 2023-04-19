package Steps;

import Utils.commonMethods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class loginSteps  extends commonMethods {

    @Given("the user navigates to the url")
    public void the_user_navigates_to_the_url() {
        // Write code here that turns the phrase above into concrete actions
        openBrowserAndLaunchApplication();
    }

    @When("user enters a valid email and password")
    public void user_enters_a_valid_email_and_password() {
        // Write code here that turns the phrase above into concrete actions'
        //driver.findElement(By.id("txtUsername")).sendKeys(ConfigReader.getPropertyValue("username"));
        //WebElement logInName = driver.findElement(By.id("txtUsername"));
        //sendText(logInName, ConfigReader.getPropertyValue("username"));
        //driver.findElement(By.id("txtPassword")).sendKeys(ConfigReader.getPropertyValue("password"));
        //WebElement password = driver.findElement(By.id("txtPassword"));
        //sendText(password,ConfigReader.getPropertyValue("password"));
        sendText(login.usernameTextBox,"Admin");
        sendText(login.passwordTextBox,"Hum@nhrm123");
    }

    @When("clicks on Login Button")
    public void clicks_on_login_button() {
        // Write code here that turns the phrase above into concrete actions
        //WebElement loginBtn= driver.findElement(By.id("btnLogin"));
        //doClick(loginBtn);
        doClick(login.loginBtn);
    }
    @Then("the user is logged in")
    public void the_user_is_logged_in() {
        // Write code here that turns the phrase above into concrete actions
        // Assertions
        //System.out.println("You are logged in");
        System.out.println("looged in");
    }

    @When("when user enters a valid email {string} and password {string}")
    public void when_user_enters_a_valid_email_and_password(String username, String password) {
        // Write code here that turns the phrase above into concrete actions
        WebElement logInName1 = driver.findElement(By.id("txtUsername"));
        sendText(logInName1, username);
        //driver.findElement(By.id("txtPassword")).sendKeys(ConfigReader.getPropertyValue("password"));
        WebElement password1 = driver.findElement(By.id("txtPassword"));
        sendText(password1, password);
    }
    @When("user enters the {string} and {string}")
    public void user_enters_the_and(String username, String password) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println(username);
        System.out.println(password);
    }
    @Then("user sees a message {string}")
    public void user_sees_a_message(String errorMsg) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println(errorMsg);

    }




}
