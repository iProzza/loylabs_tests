package qaguru.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Selenide.$x;

public class CareerPage {

    private final SelenideElement resumeBtn = $x("//button[contains(@class, 'MuiButtonBase-root MuiButton-root MuiButton-contained')][text()='Отправить резюме']");

    public CareerPage resumeBtnIsVisible() {
        resumeBtn.shouldBe(visible, enabled);
        return this;
    }

}
