package pages;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;

public class SuccessPage extends StartPage {

    public SuccessPage() {
        url = "/checkout/onepage/success";
        pageTitle = "Success Page";
    }
}
