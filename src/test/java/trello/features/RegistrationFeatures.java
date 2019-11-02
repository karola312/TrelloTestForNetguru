package trello.features;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import trello.pages.HomePage;
import trello.pages.RegistrationPage;

import static trello.data.Users.VALID_USER;
import static org.assertj.core.api.Assertions.assertThat;

public class RegistrationFeatures
{
   private static final String INVALID_EMAIL_ADDRESS = "test@";

   private HomePage homePage;
   private RegistrationPage registrationPage;

   @Given("^user is on registration page$")
   public void userIsOnRegistrationPage()
   {
      homePage.open();
      homePage.clickRegistrationButton();
   }

   @When("^he tries to register with not correct email$")
   public void heTriesToRegisterWithNotCorrectEmail()
   {
      registrationPage.typeEmail(INVALID_EMAIL_ADDRESS);
      registrationPage.clickConfirmationButton();
      registrationPage.typeUserName(VALID_USER.getName());
      registrationPage.typePassword(VALID_USER.getPassword());
      registrationPage.clickConfirmationButton();
   }

   @Then("^the validation message is displayed$")
   public void theValidationMessageIsDisplayed()
   {
      assertThat(registrationPage.getValidationMessage()).containsIgnoringCase("Invalid email");
   }
}