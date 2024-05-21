package ru.atlasOk.desktop.elements;

import io.qameta.atlas.webdriver.AtlasWebElement;
import io.qameta.atlas.webdriver.extension.FindBy;
import io.qameta.atlas.webdriver.extension.Name;

public interface MusicPlayer extends AtlasWebElement {

    @Name("Non-active play icon")
    @FindBy(".//wm-icon[@icon = 'play']")
    AtlasWebElement nonActivePlayIcon();

    @Name("Active play icon")
    @FindBy(".//wm-icon[@icon = 'pause']")
    AtlasWebElement activePlayIcon();
}
