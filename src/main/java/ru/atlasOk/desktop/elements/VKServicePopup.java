package ru.atlasOk.desktop.elements;

import io.qameta.atlas.webdriver.AtlasWebElement;
import io.qameta.atlas.webdriver.ElementsCollection;
import io.qameta.atlas.webdriver.extension.FindBy;
import io.qameta.atlas.webdriver.extension.Name;
import io.qameta.atlas.webdriver.extension.Param;

public interface VKServicePopup extends AtlasWebElement {
    String MAIL_RU_ATTRIBUTE = "t,portal";
    String MAIL_RU = "Mail.ru";

    @Name("Service link}")
    @FindBy(".//a")
    ElementsCollection<Service> services();
}
