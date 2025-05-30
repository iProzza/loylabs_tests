package qaguru.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class mainPage {

    private final SelenideElement mainSection = $x("//div[contains(@class, 'nav-text')][text()='Главная']"),
            casesSection = $x("//div[contains(@class, 'nav-text')][text()='Кейсы']"),
            careerSection = $x("//div[contains(@class, 'nav-text')][text()='Свободные специалисты']"),
            newsSection = $x("//div[contains(@class, 'nav-text')][text()='Новости']"),
            contactsSection = $x("//div[contains(@class, 'nav-text')][text()='Контакты']");


    public static mainPage openPage() {
        open("https://loylabs.ru/");
        return new mainPage();
    }

    public void clickMainSection() {
        this.mainSection.click();
    }

    public void clickCasesSection() {
        this.casesSection.click();
    }

    public void clickFreeSpecialistsSection() {
        this.careerSection.click();
    }

    public void clickNewsSection() {
        this.newsSection.click();
    }

    public void clickContactsSection() {
        this.contactsSection.click();
    }


}
