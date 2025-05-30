package qaguru.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$x;

public class CareerPage {

    private final SelenideElement careerHeader = $x("//div[not(contains(@class, 'nav-text'))][contains(text(), 'Обеспечиваем условия для профессиональ')]");

    public CareerPage checkCareerHeaderText(String value) {
        careerHeader.shouldHave(text(value));
        return this;
    }

}
