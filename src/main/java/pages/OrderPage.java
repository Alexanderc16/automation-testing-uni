package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

public class OrderPage {
    private Page page;
    private final Locator CHECKOUT_NAME_FIELD;
    private final Locator CHECKOUT_LAST_NAME_FIELD;
    private final Locator CHECKOUT_ZIP_FIELD;
    private final Locator FIRST_ADD_TO_CART_BUTTON;
    private final Locator CART_BUTTON;

    public OrderPage(Page page) {
        this.page = page;
        this.CHECKOUT_NAME_FIELD = page.locator("#first-name");
        this.CHECKOUT_LAST_NAME_FIELD = page.locator("#last-name");
        this.CHECKOUT_ZIP_FIELD = page.locator("#postal-code");
        this.FIRST_ADD_TO_CART_BUTTON = page.locator("#add-to-cart-sauce-labs-backpack");
        this.CART_BUTTON = page.locator("#shopping_cart_container > a");
    }

    public void clickFirstAddToCartButton() {
        FIRST_ADD_TO_CART_BUTTON.click();
    }

    public void clickCartButton() {
        CART_BUTTON.click();
    }

    public void userClicksString(String text) {
        page.getByText(text).click();
    }

    public void fillCheckoutTextField(String text, String field) {
        switch (field) {
            case "Name":
                this.CHECKOUT_NAME_FIELD.fill(text);
            case "Last Name":
                this.CHECKOUT_LAST_NAME_FIELD.fill(text);
            case "Zip":
                this.CHECKOUT_ZIP_FIELD.fill(text);

        }
    }
}
