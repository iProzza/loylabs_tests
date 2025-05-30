package qaguru.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$x;

public class CasesPage {

    private final SelenideElement casesHeader = $x("//div[not(contains(@class, 'nav-text'))][text()='Кейсы']");


    public CasesPage checkCasesHeaderText(String value) {
        casesHeader.shouldHave(text(value));
        return this;
    }

}
