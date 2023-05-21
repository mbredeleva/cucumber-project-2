package steps;

import io.cucumber.java.en.Then;
import pages.SuccessPage;

public class SuccessPageSteps {
    private final SuccessPage successPage;

    public SuccessPageSteps(SuccessPage successPage) {
        this.successPage = successPage;
    }

    @Then("the user sees success page")
    public void theUserSeesSuccessPage() {
        successPage.atPage();
    }
}
