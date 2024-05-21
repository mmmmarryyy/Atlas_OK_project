package ru.atlasOk.desktop.elements;

import io.qameta.atlas.webdriver.AtlasWebElement;
import io.qameta.atlas.webdriver.extension.FindBy;
import io.qameta.atlas.webdriver.extension.Name;

public interface MusicPopup extends AtlasWebElement {

    @Name("Music player")
    @FindBy(".//header")
    MusicPlayer musicPlayer();

    @Name("Music content")
    @FindBy(".//div[@class = 'content-container']")
    MusicContainer musicContainer();
}
