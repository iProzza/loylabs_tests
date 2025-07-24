package qaguru.pages;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class CareerPage {

    private final SelenideElement vacancyHeader = $x("//h2[text()='Вакансии']");
    private final ElementsCollection vacancyList = $$x("//a[contains(@class, 'MuiTypography-root MuiTypography-inherit')]//h3[contains(@class, 'MuiTypography-root MuiTypography-h3')]");

    public void checkVacancyListNotEmpty() {
        vacancyHeader.hover();
        vacancyList.shouldHave(CollectionCondition.sizeGreaterThan(0));
    }

}
