package pages;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class NewsPage {

    private final SelenideElement newsHeader = $x("//div[not(contains(@class, 'nav-text'))][text()='Новости']");
    private final ElementsCollection newsList = $$x("//a[contains(@class, 'MuiTypography-root MuiTypography-h4')]");

    @Step("Проверяем заголовок 'Новости'")
    public void checkNewsHeaderText(String value) {
        newsHeader.shouldHave(text(value));
    }

    public void checkNewsListNotEmpty() {
        newsList.shouldHave(CollectionCondition.sizeGreaterThan(0));
    }
}
