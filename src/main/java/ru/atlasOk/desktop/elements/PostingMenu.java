package ru.atlasOk.desktop.elements;

import io.qameta.atlas.webdriver.AtlasWebElement;
import io.qameta.atlas.webdriver.extension.FindBy;
import io.qameta.atlas.webdriver.extension.Name;

public interface PostingMenu extends AtlasWebElement {

    @Name("Post input")
    @FindBy(".//*[@role='textbox']//div")
    AtlasWebElement textBox();

    @Name("Post submit button")
    @FindBy(".//*[@data-l='t,button.submit']")
    AtlasWebElement submitPost();
}
