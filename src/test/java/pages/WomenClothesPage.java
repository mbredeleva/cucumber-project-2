package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selectors.*;

public class WomenClothesPage extends StartPage {

    Faker faker = new Faker();

    public WomenClothesPage() {
        url = "/women.html";
        pageTitle = "Women";
    }

    ElementsCollection hotSellers = $$(By.cssSelector("li.product-item"));

    public void addRandomItemToCart() {
        SelenideElement targetItem = hotSellers.get(faker.number().numberBetween(0, hotSellers.size() - 1));
        targetItem.scrollIntoView(true);
        selectRandomSize(targetItem);
        selectRandomColor(targetItem);
        targetItem.find(byCssSelector("button.tocart")).click();
    }

    public void selectRandomSize(SelenideElement item) {
        ElementsCollection allSizeButtons = item.findAll(By.cssSelector("div.swatch-option.text"));
        allSizeButtons.get(faker.number().numberBetween(0, allSizeButtons.size() - 1)).click();
    }

    public void selectRandomColor(SelenideElement item) {
        ElementsCollection allColorButtons = item.findAll(By.cssSelector("div.swatch-option.color"));
        allColorButtons.get(faker.number().numberBetween(0, allColorButtons.size() - 1)).click();
    }
}
