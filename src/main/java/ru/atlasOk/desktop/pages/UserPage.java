package ru.atlasOk.desktop.pages;

import io.qameta.atlas.webdriver.AtlasWebElement;
import io.qameta.atlas.webdriver.WebPage;
import io.qameta.atlas.webdriver.extension.FindBy;
import io.qameta.atlas.webdriver.extension.Name;

public interface UserPage extends WebPage {

    @Name("Notes")
    @FindBy(".//*[@data-l='t,userStatuses']")
    AtlasWebElement notes();
}
