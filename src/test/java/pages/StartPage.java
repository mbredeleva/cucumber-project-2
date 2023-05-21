package pages;

import static com.codeborne.selenide.Selenide.$;

public class StartPage extends BasePage {

    public StartPage() {
        url = "/";
        pageTitle = "Home Page";
    }

}
