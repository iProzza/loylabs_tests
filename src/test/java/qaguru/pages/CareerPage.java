package qaguru.pages;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class CareerPage {

    private final SelenideElement
            whatAwaitsYouBlock = $x("//h2[text()='Что вас ждет']"),
            employeeBonusesBlock = $x("//h2[text()='Бонусы для сотрудников']"),
            vacancyBlock = $x("//h2[text()='Вакансии']");

    private final ElementsCollection vacancyList = $$x("//a[contains(@class, 'MuiTypography-root MuiTypography-inherit')]//h3[contains(@class, 'MuiTypography-root MuiTypography-h3')]");

    public void checkWhatAwaitsYouBlockIsVisible() {
        whatAwaitsYouBlock.shouldBe(visible);
    }

    public void checkEmployeeBonusesBlockIsVisible() {
        employeeBonusesBlock.shouldBe(visible);
    }

    public void checkVacancyBlockIsVisible() {
        vacancyBlock.shouldBe(visible);
    }

    public void checkVacancyListNotEmpty() {
        vacancyBlock.hover();
        vacancyList.shouldHave(CollectionCondition.sizeGreaterThan(0));
    }
}
