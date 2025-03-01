package stepdefinitions;

import factory.DriverFactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.OrderPage;

public class OrderSteps {
    OrderPage orderPage = new OrderPage(DriverFactory.getPage());

    @When("user clicks first add to cart button")
    public void clickFirstAddToCartButton() {
        orderPage.clickFirstAddToCartButton();
    }

    @When("user clicks cart button")
    public void clickCartButton() {
        orderPage.clickCartButton();
    }

    @When("user inputs {string} into {string} field")
    public void fillCheckoutTextField(String text, String field) {
        orderPage.fillCheckoutTextField(text, field);
    }

    @When("user click {string} text")
    public void userClicksString(String text) {
        orderPage.userClicksString(text);
    }
}
