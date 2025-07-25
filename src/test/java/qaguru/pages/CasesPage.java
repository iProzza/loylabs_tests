package qaguru.pages;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class CasesPage {

    private final SelenideElement
            casesHeader = $x("//div[not(contains(@class, 'nav-text'))][text()='Кейсы']"),
            loyaltyProgramToggleBtn = $x("//button[@aria-label= 'loyalty-program']");

    private final ElementsCollection caseBannersList = $$x("//h6[contains(@class,  'MuiTypography-root MuiTypography-subtitle2')]/ancestor::div[contains(@class, 'MuiBox-root mui-')]//a[contains(@class, 'MuiBox-root mui-')]");

    private ElementsCollection toggleButtonsInsideCaseBannerList(SelenideElement caseBanners) {
        return caseBanners.$$x(".//button[contains(@class,  'MuiButtonBase-root MuiButton-root MuiButton-text')]");
    }


    public void checkCasesHeaderText(String value) {
        casesHeader.shouldHave(text(value));
    }

    public void clickLoyaltyProgramToggleBtn() {
        loyaltyProgramToggleBtn.click();
    }

    public void checkBannersFiltration(String filterName) {
        caseBannersList.shouldHave(CollectionCondition.sizeGreaterThan(0)).
                forEach(caseBannersList -> {
                    ElementsCollection filterTags = toggleButtonsInsideCaseBannerList(caseBannersList);

                    filterTags.shouldHave(CollectionCondition.anyMatch("В баннере не найдена метка: " + filterName,
                            tag -> tag.getText().equals(filterName)));
                });
    }
}
