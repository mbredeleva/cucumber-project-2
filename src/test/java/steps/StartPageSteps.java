package steps;

import pages.StartPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;

import static java.lang.Integer.parseInt;
import static org.assertj.core.api.Assertions.assertThat;

public class StartPageSteps {
    private final StartPage startPage;

    public StartPageSteps(StartPage startPage) {
        this.startPage = startPage;
    }

    @Then("the user sees {string} items in minicart")
    public void theUserSeesItemsInMinicart(String arg0) throws InterruptedException {
        assertThat(startPage.getItemsInMinicartNumber()).isEqualTo(parseInt(arg0));
    }
}
