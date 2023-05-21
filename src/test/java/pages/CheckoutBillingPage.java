package pages;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selectors.*;
public class CheckoutBillingPage extends StartPage {

    SelenideElement buttonCheckout = $(byTitle("Place Order"));
    public CheckoutBillingPage() {
        url = "/checkout/#payment";
        pageTitle = "Checkout";
    }

    public void checkoutWithDefaultParams() {
        buttonCheckout.click();
    }
}
