package qaguru.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import qaguru.pages.*;

public class ContactsTests extends TestBase {

    MainPage mainPage = new MainPage();
    ContactsPage contactsPage = new ContactsPage();

    @Test
    @DisplayName("Открываем страницу Контакты и отображается заголовок Контакты")
    void contactsPageTest() {
        mainPage.openPage();
        mainPage.clickContactsSection();
        contactsPage.checkContactsHeaderText("Контакты");
    }

}
