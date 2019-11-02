package trello.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageObject
{
   @FindBy(id = "user")
   private WebElementFacade loginInputField;

   @FindBy(id = "password")
   private WebElementFacade passwordInputField;

   @FindBy(id="login")
   private WebElementFacade confirmationButton;

   public void typeLogin(final String emailAddress)
   {
      loginInputField.type(emailAddress);
   }

   public void typePassword(final String password)
   {
      passwordInputField.type(password);
   }

   public void clickConfirmationButton()
   {
      confirmationButton.click();
   }
}
