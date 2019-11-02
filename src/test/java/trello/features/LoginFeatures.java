package trello.features;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import trello.steps.LoginSteps;
import trello.pages.BoardsListPage;
import trello.pages.HomePage;

import static org.assertj.core.api.Assertions.assertThat;
import static trello.data.Users.VALID_USER;

public class LoginFeatures
{
   private HomePage homePage;

   private BoardsListPage boardsListPage;

   @Steps
   private LoginSteps loginSteps;

   @Given("^user is on login page$")
   public void userIsOnLoginPage()
   {
      homePage.open();
      homePage.clickLoginButton();
   }

   @When("^he logs in with email using valid credentials$")
   public void heLogsInWithEmailUsingValidCredentials()
   {
      loginSteps.login(VALID_USER.getEmailAddress(), VALID_USER.getPassword());
   }

   @Then("^he is logged in$")
   public void heIsLoggedIn()
   {
      assertThat(boardsListPage.isAccountMenuButtonPresent()).isTrue();
   }
}