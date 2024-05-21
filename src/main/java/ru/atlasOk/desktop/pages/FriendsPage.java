package ru.atlasOk.desktop.pages;

import io.qameta.atlas.webdriver.AtlasWebElement;
import io.qameta.atlas.webdriver.ElementsCollection;
import io.qameta.atlas.webdriver.WebPage;
import io.qameta.atlas.webdriver.extension.FindBy;
import io.qameta.atlas.webdriver.extension.Name;
import ru.atlasOk.desktop.elements.Person;

public interface FriendsPage extends WebPage {
    String ADD_FRIEND_BUTTON_TEXT = "Добавить в друзья";

    @Name("Input field to enter friend name")
    @FindBy(".//input[@type='search']")
    AtlasWebElement searchField();

    @Name("Header of search query result")
    @FindBy(".//*[contains(@class,'gs_search_h')]")
    AtlasWebElement searchResultHeader();

    @Name("People in search query result")
    @FindBy(".//*[contains(@class,'gs_result_i_w')]")
    ElementsCollection<Person> people();
}
