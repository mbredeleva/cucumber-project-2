package pages;

import static com.codeborne.selenide.Selenide.*;
import com.codeborne.selenide.SelenideElement;
import com.github.javafaker.Faker;

import static com.codeborne.selenide.Selectors.*;

public class CheckoutAddressPage extends StartPage {
    Faker faker = new Faker();

    SelenideElement emailInput = $(byId("customer-email"));
    SelenideElement firstNameInput = $(byName("firstname"));
    SelenideElement lastNameInput = $(byName("lastname"));
    SelenideElement streetFirstLineInpit = $(byName("street[0]"));
    SelenideElement cityInput = $(byName("city"));
    SelenideElement stateSelector = $(byName("region_id"));
    SelenideElement zipCode = $(byName("postcode"));
    SelenideElement phoneNumber = $(byName("telephone"));

    SelenideElement submitButton = $(byCssSelector("button[data-role=\"opc-continue\"]"));

    public CheckoutAddressPage() {
        url = "/checkout/#shipping";
        pageTitle = "Checkout";
    }

    public void fillWithRandomDataAndSubmit() {
        emailInput.sendKeys(faker.internet().emailAddress());
        firstNameInput.sendKeys(faker.name().firstName());
        lastNameInput.sendKeys(faker.name().lastName());
        streetFirstLineInpit.sendKeys(faker.address().streetAddress());
        cityInput.sendKeys(faker.address().city());
        stateSelector.selectOption(faker.address().state());
        zipCode.sendKeys(faker.address().zipCode());
        phoneNumber.sendKeys(faker.phoneNumber().phoneNumber());

        $(byCssSelector("td.col-method > input")).click();
        submitButton.scrollIntoView(false);
        submitButton.click();

    }
}
