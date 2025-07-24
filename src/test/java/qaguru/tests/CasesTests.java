package qaguru.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import qaguru.pages.*;

public class CasesTests extends TestBase {

    MainPage mainPage = new MainPage();
    CasesPage casesPage = new CasesPage();

    @Test
    @DisplayName("Открываем страницу Кейсы и отображается заголовок Кейсы")
    void casesPageTest() {
        mainPage.openPage();
        mainPage.clickCasesSection();
        casesPage.checkCasesHeaderText("Кейсы");
    }

}
