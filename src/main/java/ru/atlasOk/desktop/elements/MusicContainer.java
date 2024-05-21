package ru.atlasOk.desktop.elements;

import io.qameta.atlas.webdriver.AtlasWebElement;
import io.qameta.atlas.webdriver.ElementsCollection;
import io.qameta.atlas.webdriver.extension.FindBy;
import io.qameta.atlas.webdriver.extension.Name;

public interface MusicContainer extends AtlasWebElement {
    @Name("Track")
    @FindBy(".//wm-track")
    ElementsCollection<MusicCard> track();
}
