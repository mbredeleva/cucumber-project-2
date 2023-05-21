package steps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;

import pages.StartPage;
import pages.WomenClothesPage;

import static org.assertj.core.api.Assertions.assertThat;

public class WomenClothesPageSteps {

    private final WomenClothesPage womenClothesPage;

    public WomenClothesPageSteps(WomenClothesPage womenClothesPage) {
        this.womenClothesPage = womenClothesPage;
    }

    @Given("the user opens women cloth page")
    public void theUserOpensWomenClothPage() {
        womenClothesPage.openPage();
        assertThat(womenClothesPage.atPage()).isTrue();
    }

    @When("the user adds one cloth item to cart")
    public void theUserAddsOneClothItemToCart() {
        womenClothesPage.addRandomItemToCart();
    }

    @Then("dummy")
    public void dummy() {
        System.out.println();
    }
}
