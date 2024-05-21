package ru.atlasOk.desktop.pages;

import io.qameta.atlas.webdriver.AtlasWebElement;
import io.qameta.atlas.webdriver.ElementsCollection;
import io.qameta.atlas.webdriver.WebPage;
import io.qameta.atlas.webdriver.extension.FindBy;
import io.qameta.atlas.webdriver.extension.Name;
import ru.atlasOk.desktop.elements.Div;
import ru.atlasOk.desktop.elements.Post;
import ru.atlasOk.desktop.elements.PostingMenu;

public interface NotesPage extends WebPage, Div {

    String EMPTY_POSTS_TEXT = "Поделитесь с друзьями чем-нибудь интересным!";

    @Name("Click to post")
    @FindBy(".//*[@class='pf-head_itx_a']")
    AtlasWebElement posting();

    @Name("Post popup menu")
    @FindBy("//div[@id='mtLayer']")
    PostingMenu postingMenu();

    @Name("Post container")
    @FindBy(".//div[@tsid='userStatusShares']")
    ElementsCollection<Post> posts();

    @Name("Post actions")
    @FindBy(".//*[@class='new_topic_icodown']")
    AtlasWebElement actions();

    @Name("Delete post")
    @FindBy(".//*[@id='hook_Block_ShortcutMenu']//ul//li[3]")
    AtlasWebElement delete();
}
