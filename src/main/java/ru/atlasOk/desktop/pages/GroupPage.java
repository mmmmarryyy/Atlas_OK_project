package ru.atlasOk.desktop.pages;

import io.qameta.atlas.webdriver.AtlasWebElement;
import io.qameta.atlas.webdriver.WebPage;
import io.qameta.atlas.webdriver.extension.FindBy;
import io.qameta.atlas.webdriver.extension.Name;

public interface GroupPage extends WebPage {
    @Name("Dropdown lead to leave group")
    @FindBy(".//*[contains(@class,'dropdown_ac') and contains(@class,'button-pro')]")
    AtlasWebElement leaveDropdown();

    @Name("Leave group button")
    @FindBy(".//*[contains(@class,'dropdown_i')]")
    AtlasWebElement leaveButton();

    @Name("Leave group confirm button")
    @FindBy(".//*[@data-l='t,confirm']")
    AtlasWebElement leaveConfirmButton();
}