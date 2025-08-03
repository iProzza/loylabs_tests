package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

public class CareerPage {

    private final SelenideElement
            whatAwaitsYouBlock = $x("//h2[text()='Что вас ждет']"),
            employeeBonusesBlock = $x("//h2[text()='Бонусы для сотрудников']"),
            vacancyBlock = $x("//h2[text()='Вакансии']"),
            sendResumeBtn = $x("//button[@type= 'button'][text()='Отправить резюме']"),
            sendResumeForm = $x("//div[@id= 'form']");

    @Step("Проверяем наличия блока 'Что вас ждет'")
    public void whatAwaitsYouBlockIsVisible() {
        whatAwaitsYouBlock.shouldBe(visible);
    }

    @Step("Проверяем наличия блока 'Бонусы для сотрудников'")
    public void employeeBonusesBlockIsVisible() {
        employeeBonusesBlock.shouldBe(visible);
    }

    @Step("Проверяем наличия блока 'Вакансии'")
    public void vacancyBlockIsVisible() {
        vacancyBlock.shouldBe(visible);
    }

    @Step("Нажимаем на кнопку 'Отправить резюме'")
    public void clickSendResumeBtn() {
        sendResumeBtn.click();
    }

    @Step("Проверяем, что форма 'Не нашли вакансию?' отображается")
    public void sendResumeFormIsVisible() {
        sendResumeForm.shouldBe(visible);
    }
}
