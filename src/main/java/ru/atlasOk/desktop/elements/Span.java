package ru.atlasOk.desktop.elements;

import io.qameta.atlas.webdriver.AtlasWebElement;
import io.qameta.atlas.webdriver.extension.FindBy;
import io.qameta.atlas.webdriver.extension.Name;
import io.qameta.atlas.webdriver.extension.Param;

public interface Span extends AtlasWebElement {
    @Name("Span with text {{ value }}")
    @FindBy(".//span[contains(., '{{ value }}')]")
    AtlasWebElement spanButton(@Param("value") String value);
}
