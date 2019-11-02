package trello.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends PageObject
{
   @FindBy(id = "email")
   private WebElementFacade emailInputField;

   @FindBy(id = "signup")
   private WebElementFacade confirmationButton;

   @FindBy(xpath = "//*[@id='error']//*[contains(@class, 'error-message')]")
   private WebElementFacade validationMessage;

   @FindBy(id = "name")
   private WebElementFacade usernameInputField;

   @FindBy(id = "password")
   private WebElementFacade passwordInputField;

   public void typeEmail(final String invalidEmailAddress)
   {
      emailInputField.type(invalidEmailAddress);
   }

   public void clickConfirmationButton()
   {
      confirmationButton.click();
   }

   public void typeUserName(final String userName)
   {
      usernameInputField.type(userName);
   }

   public void typePassword(final String password)
   {
      passwordInputField.type(password);
   }

   public String getValidationMessage()
   {
      return validationMessage.waitUntilVisible().getText();
   }
}
