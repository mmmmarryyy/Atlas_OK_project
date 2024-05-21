package ru.atlasOk.desktop.pages;

import io.qameta.atlas.webdriver.AtlasWebElement;
import io.qameta.atlas.webdriver.ElementsCollection;
import io.qameta.atlas.webdriver.WebPage;
import io.qameta.atlas.webdriver.extension.FindBy;
import io.qameta.atlas.webdriver.extension.Name;
import ru.atlasOk.desktop.elements.Group;

public interface GroupsPage extends WebPage {
    @Name("Input field to enter group name")
    @FindBy(".//input[@type='search']")
    AtlasWebElement searchField();

    @Name("Number of groups in search query result")
    @FindBy(".//*[@class='portlet_h_count']")
    AtlasWebElement groupsCount();

    @Name("Groups in search query result")
    @FindBy(".//*[contains(@class,'group-big-card') and contains(@class,'ucard-v')]")
    ElementsCollection<Group> groups();
}