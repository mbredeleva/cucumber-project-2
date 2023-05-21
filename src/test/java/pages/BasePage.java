package pages;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static java.lang.Integer.parseInt;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

public abstract class BasePage {
    static String pageTitle;
    static String url;

    SelenideElement minicart = $(byCssSelector("div.minicart-wrapper"));

    public BasePage() {
    }

    public String getTitle() {
        return pageTitle;
    }
    public boolean atPage() {
        return (title().equals(pageTitle));
    }
    public void openPage() {
        open(url);
        assert atPage();
    }
    public int getItemsInMinicartNumber() throws InterruptedException {
        SelenideElement num = minicart.find(byClassName("counter-number"));
        //Empty text is valid when the cart is empty
        //So I have to use stupid wait (((
        Thread.sleep(3000);
        int ret = 0;
        if(!num.getText().equals("")) {
            ret = parseInt(num.getText());
        }
        return ret;
    }
}
