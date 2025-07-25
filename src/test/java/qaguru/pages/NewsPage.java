package qaguru.pages;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class NewsPage {

    private final SelenideElement newsHeader = $x("//div[not(contains(@class, 'nav-text'))][text()='Новости']");
    private final ElementsCollection newsList = $$x("//a[contains(@class, 'MuiTypography-root MuiTypography-h4')]");

    public NewsPage checkNewsHeaderText(String value) {
        newsHeader.shouldHave(text(value));
        return this;
    }

    public void checkNewsListNotEmpty() {
        newsList.shouldHave(CollectionCondition.sizeGreaterThan(0));
    }
}
