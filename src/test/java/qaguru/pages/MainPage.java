package qaguru.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class MainPage {

    private final SelenideElement companyLogo = $x("//img[@alt='Loyalty Labs logo']");

    private final SelenideElement mainSection = $x("//div[contains(@class, 'nav-text')][text()='Главная']"),
            casesSection = $x("//div[contains(@class, 'nav-text')][text()='Кейсы']"),
            careerSection = $x("//div[contains(@class, 'nav-text')][text()='Карьера']"),
            newsSection = $x("//div[contains(@class, 'nav-text')][text()='Новости']"),
            contactsSection = $x("//div[contains(@class, 'nav-text')][text()='Контакты']");


    public void openPage() {
        open("https://loylabs.ru/");
    }

    public void checkLogoIsVisible() {
        companyLogo.shouldBe(visible);
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


}
