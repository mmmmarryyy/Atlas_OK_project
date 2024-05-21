package ru.atlasOk.desktop.pages;

import io.qameta.atlas.webdriver.AtlasWebElement;
import io.qameta.atlas.webdriver.ElementsCollection;
import io.qameta.atlas.webdriver.extension.FindBy;
import io.qameta.atlas.webdriver.extension.Name;
import ru.atlasOk.desktop.elements.TextInstance;

public interface SelfInfoSection extends AtlasWebElement {

    @Name("Text instances")
    @FindBy(".//div[@class = 'tico']")
    ElementsCollection<TextInstance> textInstances();
}
