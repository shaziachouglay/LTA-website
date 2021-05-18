package lta.stepdefinitions;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class TitleBanner extends PageObject {
    public static final String TITLE_HEADER = "//div[@class='title-banner']/..//h3";
    public String title() {
       return $(TITLE_HEADER).getText();
    }
}
