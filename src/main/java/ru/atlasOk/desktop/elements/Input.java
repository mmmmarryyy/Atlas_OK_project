package ru.atlasOk.desktop.elements;

import io.qameta.atlas.webdriver.AtlasWebElement;
import io.qameta.atlas.webdriver.extension.FindBy;
import io.qameta.atlas.webdriver.extension.Name;
import io.qameta.atlas.webdriver.extension.Param;

public interface Input extends AtlasWebElement {

    @Name("Input with text {{ value }}")
    @FindBy(".//input[contains(., '{{ value }}')]")
    AtlasWebElement button(@Param("value") String value);
    @Name("Input by exact text {{ value }}")
    @FindBy(".//input[. = '{{ value }}']")
    AtlasWebElement buttonText(@Param("value") String value);
}
