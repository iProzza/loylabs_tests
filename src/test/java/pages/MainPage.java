package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class MainPage {

    private final SelenideElement companyLogo = $x("//img[@alt='Loyalty Labs logo']");

    private final SelenideElement
            casesSection = $x("//div[contains(@class, 'nav-text')][text()='Кейсы']"),
            careerSection = $x("//div[contains(@class, 'nav-text')][text()='Карьера']"),
            newsSection = $x("//div[contains(@class, 'nav-text')][text()='Новости']"),
            contactsSection = $x("//div[contains(@class, 'nav-text')][text()='Контакты']"),
            newsBlock = $x("//h2[contains(@class, 'MuiTypography-root')][text()='Новости']"),
            submitFormBtn = $x("//button[contains(@class, 'MuiButtonBase-root')][@type='submit']"),
            tenderBtn = $x("//button[contains(@class, 'MuiButtonBase-root')][text()='Пригласить в тендер']");

    private final ElementsCollection errorMessagesForField = $$x("//p[contains(@class, 'MuiFormHelperText-root MuiFormHelperText-sizeMedium')]");

    @Step("Открываем главную страницу")
    public void openMainPage() {
        open("/");
        tenderBtn.shouldBe(visible);

    }

    @Step("Проверяем видимость логотипа компании")
    public void checkLogoIsVisible() {
        companyLogo.shouldBe(visible);
    }

    @Step("Проверяем наличия блока 'Новости'")
    public void checkNewsBlockIsVisible() {
        newsBlock.shouldBe(visible);
    }

    @Step("Переходим в раздел 'Кейсы'")
    public void clickCasesSection() {
        casesSection.click();
    }

    @Step("Переходим в раздел 'Новости'")
    public void clickNewsSection() {
        newsSection.click();
    }

    @Step("Переходим в раздел 'Карьера'")
    public void clickCareerSection() {
        careerSection.click();
    }

    @Step("Переходим в раздел 'Контакты'")
    public void clickContactsSection() {
        contactsSection.click();
    }

    @Step("Нажимаем на кнопку 'Пригласить в тендер'")
    public void clickTenderBtn() {
        tenderBtn.click();
    }

    @Step("Нажимаем на кнопку 'Отправить'")
    public void clickSubmitFormBtn() {
        submitFormBtn.click();
    }

    @Step("Проверяем сообщения об ошибках для обязательных полей")
    public void checkErrorMessagesForFields(String errorText) {
        errorMessagesForField.findBy(text(errorText)).shouldBe(visible);
    }
}
