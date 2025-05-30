package qaguru.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class mainPage {

    private final SelenideElement companyLogo = $x("//img[@alt='Loyalty Labs logo']");

    private final SelenideElement mainSection = $x("//div[contains(@class, 'nav-text')][text()='Главная']"),
            casesSection = $x("//div[contains(@class, 'nav-text')][text()='Кейсы']"),
            careerSection = $x("//div[contains(@class, 'nav-text')][text()='Свободные специалисты']"),
            newsSection = $x("//div[contains(@class, 'nav-text')][text()='Новости']"),
            contactsSection = $x("//div[contains(@class, 'nav-text')][text()='Контакты']");


    public mainPage openPage() {
        open("https://loylabs.ru/");
        return new mainPage();
    }

    public void checkLogoIsVisible() {
        this.companyLogo.shouldBe(visible);
    }

    public void clickMainSection() {
        this.mainSection.click();
    }

    public void clickCasesSection() {
        this.casesSection.click();
    }

    public void clickNewsSection() {
        this.newsSection.click();
    }

    public void clickCareerSection() {
        this.careerSection.click();
    }

    public void clickContactsSection() {
        this.contactsSection.click();
    }


}
