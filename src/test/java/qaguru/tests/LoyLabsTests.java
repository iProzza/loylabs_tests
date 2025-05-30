package qaguru.tests;

import org.junit.jupiter.api.BeforeEach;
import qaguru.pages.*;

public class LoyLabsTests extends TestBase {

    private CasesPage casesPage;
    private NewsPage newsPage;
    private CareerPage careerPage;
    private ContactsPage contactsPage;

    @BeforeEach
    public void getPreconditions() {

        mainPage.openPage();
        casesPage = new CasesPage();
        newsPage = new NewsPage();
        careerPage = new CareerPage();
        contactsPage = new ContactsPage();
    }

}
