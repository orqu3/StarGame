package com.stargame.sprite;

import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.stargame.base.Sprite;
import com.stargame.math.Rect;

public class GameOver extends Sprite {

    private static final float HEIGHT = 0.08f;

    public GameOver(TextureAtlas atlas) {
        super(atlas.findRegion("message_game_over"));
    }

    @Override
    public void resize(Rect worldBounds) {
        setHeightProportion(HEIGHT);
        setTop(worldBounds.pos.y + 0.1f);
    }
}
