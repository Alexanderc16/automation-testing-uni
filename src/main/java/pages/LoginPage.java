package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import utils.WebActions;

public class LoginPage {
    private Page page;
    private final Locator USERNAME_FIELD;
    private final Locator PASSWORD_FIELD;
    private final Locator LOGIN_BUTTON;

    public LoginPage(Page page) {
        this.page = page;
        this.USERNAME_FIELD = page.locator("#user-name");
        this.PASSWORD_FIELD = page.locator("#password");
        this.LOGIN_BUTTON = page.locator("#login-button");
    }

    public void navigateToUrl(String url) {
        this.page.navigate(WebActions.getProperty(url));
    }

    public void enterUsername(String username) {
        USERNAME_FIELD.fill(WebActions.getProperty(username));
    }

    public void enterPassword(String password) {
        PASSWORD_FIELD.fill(WebActions.getProperty(password));
    }

    public void clickLogin() {
        LOGIN_BUTTON.click();
    }

    public boolean verifyTextPresence(String text) {
        return page.getByText(text).isVisible();
    }

    public String getCurrentUrl() {
        page.waitForLoadState();
        return page.url();
    }
}
