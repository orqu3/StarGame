package com.stargame.sprite;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.stargame.base.ScaledButton;
import com.stargame.math.Rect;
import com.stargame.screen.GameScreen;

public class PlayButton extends ScaledButton {

    private static final float HEIGHT = 0.165f;
    private static final float PADDING = 0.045f;

    private final Game game;

    public PlayButton(TextureAtlas atlas, Game game) {
        super(atlas.findRegion("start"));
        this.game = game;
    }

    @Override
    public void resize(Rect worldBounds) {
        super.resize(worldBounds);
        setHeightProportion(HEIGHT);
        setBottom(worldBounds.getBottom() + PADDING);
        setLeft(worldBounds.getLeft() + PADDING);
    }

    @Override
    protected void action() {
        game.setScreen(new GameScreen());
    }
}
