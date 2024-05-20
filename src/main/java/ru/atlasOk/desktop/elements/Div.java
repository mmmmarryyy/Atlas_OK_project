package ru.atlasOk.desktop.elements;

import io.qameta.atlas.webdriver.AtlasWebElement;
import io.qameta.atlas.webdriver.extension.FindBy;
import io.qameta.atlas.webdriver.extension.Name;
import io.qameta.atlas.webdriver.extension.Param;

public interface Div extends AtlasWebElement {

    @Name("Div with text {{ value }}")
    @FindBy(".//div[contains(., '{{ value }}')]")
    AtlasWebElement div(@Param("value") String value);
    @Name("Div by exact text {{ value }}")
    @FindBy(".//div[. = '{{ value }}']")
    AtlasWebElement divText(@Param("value") String value);
}
