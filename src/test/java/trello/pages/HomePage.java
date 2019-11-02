package trello.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageObject
{
   @FindBy(xpath = "//*[@data-analytics-event=\"clickedSignupHeaderButton\"]")
   private WebElementFacade registrationButton;

   @FindBy(xpath = "//*[contains(@href, 'login')]")
   private WebElementFacade loginButton;

   public void clickRegistrationButton()
   {
      registrationButton.waitUntilEnabled().click();
   }

   public void clickLoginButton()
   {
      loginButton.waitUntilVisible().click();
   }
}
