package lta.actions.navigations;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.DefaultUrl;


public class Navigate extends UIInteractionSteps {


    public void toTheLTAHomePage() {
        getDriver().get("https://www.lta.gov.sg/");
    }

    public void toTheSection(String section) {
        $(TopLevelMenuBar.topLevelMenuItemCalled(section)).click();
    }
}
