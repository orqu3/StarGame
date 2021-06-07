package com.stargame;

import com.badlogic.gdx.Game;
import com.stargame.screen.MenuScreen;

public class StarGame extends Game {

    @Override
    public void create() {
        setScreen(new MenuScreen(this));
    }
}
