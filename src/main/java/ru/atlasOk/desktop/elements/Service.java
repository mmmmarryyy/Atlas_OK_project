package ru.atlasOk.desktop.elements;

import io.qameta.atlas.webdriver.AtlasWebElement;
import io.qameta.atlas.webdriver.extension.FindBy;
import io.qameta.atlas.webdriver.extension.Name;

public interface Service extends AtlasWebElement {

    @Name("Span")
    @FindBy(".//span")
    AtlasWebElement name();
}
