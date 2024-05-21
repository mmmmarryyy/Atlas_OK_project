package ru.atlasOk.desktop.elements;

import io.qameta.atlas.webdriver.AtlasWebElement;
import io.qameta.atlas.webdriver.extension.FindBy;
import io.qameta.atlas.webdriver.extension.Name;

public interface UserCardPopup extends AtlasWebElement, Span {
    String THEME_SPAN_TEXT = "Тема:";

    @Name("Button to see list of themes")
    @FindBy(".//*[contains(@class,'theme-switcher_btn')]")
    AtlasWebElement themeSwitcherButton();

    @Name("Current theme of site")
    @FindBy(".//*[contains(@class,'theme-switcher_list')]")
    ThemesPopup themesPopup();
}
