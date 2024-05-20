package ru.atlasOk.desktop.elements;

import io.qameta.atlas.webdriver.AtlasWebElement;
import io.qameta.atlas.webdriver.extension.FindBy;
import io.qameta.atlas.webdriver.extension.Name;
import io.qameta.atlas.webdriver.extension.Param;

public interface Button extends AtlasWebElement {

    @Name("Button with text {{ value }}")
    @FindBy(".//button[contains(., '{{ value }}')]")
    AtlasWebElement button(@Param("value") String value);
    @Name("Button by exact text {{ value }}")
    @FindBy(".//button[. = '{{ value }}']")
    AtlasWebElement buttonText(@Param("value") String value);

    @Name("Button by aria-label {{ value }}")
    @FindBy(".//button[@aria-label = '{{ value }}']")
    AtlasWebElement buttonLabel(@Param("value") String value);
}
