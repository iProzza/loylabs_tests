package qaguru.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class ContactsPage {

    private final SelenideElement contactsHeader = $x("//div[not(contains(@class, 'nav-text'))][text()='Контакты']");
    private final ElementsCollection contactsList = $$x("//p[contains(@class, 'MuiTypography-root MuiTypography-body1')]");

    public void checkContactsHeaderText(String value) {
        contactsHeader.shouldHave(text(value));
    }

    public void checkContactNameInList(String contactName) {
        contactsList.findBy(text(contactName)).shouldBe(visible);
    }
}
