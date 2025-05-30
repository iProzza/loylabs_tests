package qaguru.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$x;

public class NewsPage {

    private final SelenideElement newsHeader = $x("//div[not(contains(@class, 'nav-text'))][text()='Новости']");

    public NewsPage checkNewsHeaderText(String value) {
        newsHeader.shouldHave(text(value));
        return this;
    }
}
