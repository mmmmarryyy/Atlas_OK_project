package ru.atlasOk.desktop.elements;

import io.qameta.atlas.webdriver.AtlasWebElement;
import io.qameta.atlas.webdriver.ElementsCollection;
import io.qameta.atlas.webdriver.extension.FindBy;
import io.qameta.atlas.webdriver.extension.Name;

public interface SelfInfoSection extends AtlasWebElement {

    @Name("Text instances")
    @FindBy(".//div[@class = 'tico']")
    ElementsCollection<TextInstance> textInstances();
}
