package steps;
import pages.CheckoutAddressPage;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;

import static org.assertj.core.api.Assertions.assertThat;

public class CheckoutAddressPageSteps {
    private final CheckoutAddressPage checkoutAddressPage;

    public CheckoutAddressPageSteps(CheckoutAddressPage checkoutAddressPage) {
        this.checkoutAddressPage = checkoutAddressPage;
    }

    @When("the user opens checkout page")
    public void theUserOpensCheckoutPage() throws InterruptedException {
        checkoutAddressPage.openPage();
        Thread.sleep(3000); // Shame on me
        assertThat(checkoutAddressPage.atPage()).isTrue();
    }

    @And("the user fills checkout form with random data")
    public void theUserFillsCheckoutFormWithRandomData() {
        checkoutAddressPage.fillWithRandomDataAndSubmit();
    }

}
