package lta.actions.navigations;

import org.openqa.selenium.By;

public class TopLevelMenuBar {
    private static String TOP_LEVEL_MENU_ENTRY = "//a[normalize-space()='%s']";

    public static By topLevelMenuItemCalled(String menuItemName) {
        return By.xpath(String.format(TOP_LEVEL_MENU_ENTRY,menuItemName));
    }
}
