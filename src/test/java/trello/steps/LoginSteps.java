package trello.steps;

import trello.pages.LoginPage;

public class LoginSteps
{

   private LoginPage loginPage;

   public void login(final String login, final String password)
   {
      loginPage.typeLogin(login);
      loginPage.typePassword(password);
      loginPage.clickConfirmationButton();
   }
}
