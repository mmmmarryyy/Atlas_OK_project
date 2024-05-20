package ru.atlasOk.desktop.elements;

import io.qameta.atlas.webdriver.AtlasWebElement;
import io.qameta.atlas.webdriver.extension.FindBy;
import io.qameta.atlas.webdriver.extension.Name;

public interface Post extends AtlasWebElement {

    @Name("Open post")
    @FindBy(".//a[@class='media-text_a']")
    AtlasWebElement openPostLink();

    @Name("Text of post")
    @FindBy(".//div[@link-class='media-text_lnk']")
    AtlasWebElement text();
}
