package steps;

import io.cucumber.java.en.And;
import pages.CheckoutBillingPage;

public class CheckoutBillingPageSteps {
    private final CheckoutBillingPage checkoutBillingPage;

    public CheckoutBillingPageSteps(CheckoutBillingPage checkoutBillingPage) {
        this.checkoutBillingPage = checkoutBillingPage;
    }

    @And("the user submits default billing info")
    public void theUserSubmitsDefaultBillingInfo() {
        checkoutBillingPage.checkoutWithDefaultParams();
    }
}
