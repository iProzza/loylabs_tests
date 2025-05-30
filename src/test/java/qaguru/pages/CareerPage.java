package qaguru.pages;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$$x;

public class CareerPage {

    private final ElementsCollection vacancyList = $$x("//a[contains(@class, 'MuiTypography-root MuiTypography-inherit')]//h3[contains(@class, 'MuiTypography-root MuiTypography-h3')]");

    public CareerPage checkVacancyListNotEmpty() {
        vacancyList.shouldHave(CollectionCondition.sizeGreaterThan(0));
        return this;
    }

}
