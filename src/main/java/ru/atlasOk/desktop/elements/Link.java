package ru.atlasOk.desktop.elements;

import io.qameta.atlas.webdriver.AtlasWebElement;
import io.qameta.atlas.webdriver.extension.FindBy;
import io.qameta.atlas.webdriver.extension.Name;

public interface Link extends AtlasWebElement {

    @Name("Link")
    @FindBy(".//a")
    AtlasWebElement link();
}
