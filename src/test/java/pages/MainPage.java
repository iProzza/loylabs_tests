package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

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

    public void openPage() {
        open("/");
        tenderBtn.shouldBe(visible);

    }

    public void checkLogoIsVisible() {
        companyLogo.shouldBe(visible);
    }

    public void checkNewsBlockIsVisible() {
        newsBlock.shouldBe(visible);
    }

    public void clickCasesSection() {
        casesSection.click();
    }

    public void clickNewsSection() {
        newsSection.click();
    }

    public void clickCareerSection() {
        careerSection.click();
    }

    public void clickContactsSection() {
        contactsSection.click();
    }

    public void clickTenderBtn() {
        tenderBtn.click();
    }

    public void clickSubmitFormBtn() {
        submitFormBtn.click();
    }

    public void checkErrorMessagesForFields(String errorText) {
        errorMessagesForField.findBy(text(errorText)).shouldBe(visible);
    }
}
