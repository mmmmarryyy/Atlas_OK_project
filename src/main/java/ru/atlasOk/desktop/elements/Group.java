package ru.atlasOk.desktop.elements;

import io.qameta.atlas.webdriver.AtlasWebElement;
import io.qameta.atlas.webdriver.extension.FindBy;
import io.qameta.atlas.webdriver.extension.Name;

public interface Group extends AtlasWebElement {
    @Name("Button to add group")
    @FindBy(".//*[@role='button']")
    AtlasWebElement addGroupButton();

    @Name("Button to navigate to group page")
    @FindBy(".//*[@data-l='t,visit']")
    AtlasWebElement goToGroupPageButton();

    @Name("Message confirms that you join group")
    @FindBy(".//*[contains(@class,'label__gp7y9')]")
    AtlasWebElement confirmationMessage();
}
