package qaguru.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$x;

public class ContactsPage {

    private final SelenideElement contactsHeader = $x("//div[not(contains(@class, 'nav-text'))][text()='Контакты']");

    public ContactsPage checkContactsHeaderText(String value) {
        contactsHeader.shouldHave(text(value));
        return this;
    }
}
