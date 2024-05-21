package ru.atlasOk.desktop.elements;

import io.qameta.atlas.webdriver.AtlasWebElement;
import io.qameta.atlas.webdriver.extension.FindBy;
import io.qameta.atlas.webdriver.extension.Name;

public interface ThemesPopup extends AtlasWebElement {
    @Name("Switch theme to dark button")
    @FindBy(".//*[@data-theme='dark']")
    AtlasWebElement darkThemeButton();

    @Name("Switch theme to light button")
    @FindBy(".//*[@data-theme='light']")
    AtlasWebElement lightThemeButton();
}