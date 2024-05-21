package ru.atlasOk.desktop.test.music;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.atlasOk.desktop.test.baseInstances.BaseTestWithLogin;

import static ru.atlasOk.desktop.elements.NavigationBar.MUSIC;
import static ru.yandex.qatools.matchers.webdriver.DisplayedMatcher.displayed;

@DisplayName("Pause music")
public class MusicPauseTest extends BaseTestWithLogin {

    @DisplayName("Playing icon changes when music is paused")
    @Test
    public void checkMusicPlayer() {
        site.onMainPage().navigationBar().buttonLabel(MUSIC).waitUntil(displayed()).click();
        site.onMainPage().musicPopup().waitUntil(displayed());
        site.onMainPage().musicPopup().musicPlayer().nonActivePlayIcon().waitUntil(displayed());
        site.onMainPage().musicPopup().musicContainer().track().get(0).waitUntil(displayed()).click();
        site.onMainPage().musicPopup().musicPlayer().activePlayIcon().waitUntil(displayed()).click();

        site.onMainPage().musicPopup().musicPlayer().nonActivePlayIcon().should(displayed());
    }
}
