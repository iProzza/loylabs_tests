package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

public class CareerPage {

    private final SelenideElement
            whatAwaitsYouBlock = $x("//h2[text()='Что вас ждет']"),
            employeeBonusesBlock = $x("//h2[text()='Бонусы для сотрудников']"),
            vacancyBlock = $x("//h2[text()='Вакансии']"),
            sendResumeBtn = $x("//button[@type= 'button'][text()='Отправить резюме']"),
            sendResumeForm = $x("//div[@id= 'form']");

    public void whatAwaitsYouBlockIsVisible() {
        whatAwaitsYouBlock.shouldBe(visible);
    }

    public void employeeBonusesBlockIsVisible() {
        employeeBonusesBlock.shouldBe(visible);
    }

    public void vacancyBlockIsVisible() {
        vacancyBlock.shouldBe(visible);
    }

    public void clickSendResumeBtn() {
        sendResumeBtn.click();
    }

    public void sendResumeFormIsVisible() {
        sendResumeForm.shouldBe(visible);
    }
}
