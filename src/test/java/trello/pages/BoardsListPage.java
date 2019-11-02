package trello.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class BoardsListPage extends PageObject
{
   @FindBy(xpath = "//*[@data-test-id='header-member-menu-button']")
   private WebElementFacade accountMenuButton;

   public boolean isAccountMenuButtonPresent()
   {
      return accountMenuButton.isPresent();
   }
}
