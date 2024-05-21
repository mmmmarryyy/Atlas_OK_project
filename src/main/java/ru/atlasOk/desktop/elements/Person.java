package ru.atlasOk.desktop.elements;

import io.qameta.atlas.webdriver.AtlasWebElement;
import io.qameta.atlas.webdriver.extension.FindBy;
import io.qameta.atlas.webdriver.extension.Name;

public interface Person extends AtlasWebElement, Span {

    @Name("Confirmation message of sending friend request")
    @FindBy(".//*[contains(@class,'lstp-t')]")
    AtlasWebElement confirmationMessage();

    @Name("Button to navigate to user page")
    @FindBy(".//*[contains(@class,'sult_i_t_name')]")
    AtlasWebElement goToUserPageButton();
}
