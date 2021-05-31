package com.stargame.screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.ScreenUtils;
import com.stargame.base.BaseScreen;

public class MenuScreen extends BaseScreen {

    private static final float VELOCITY = 5.0f;

    private Texture img;
    private Texture bg;
    private Vector2 pos;
    private Vector2 v;
    private Vector2 point;
    private Vector2 tmp;

    @Override
    public void show() {
        super.show();
        img = new Texture("plate.png");
        bg = new Texture("Space.png");
        pos = new Vector2((float) img.getWidth() / 4, (float) img.getHeight() / 4);
        point = new Vector2(pos.x, pos.y);
        v = new Vector2();
        tmp = new Vector2();
    }

    @Override
    public void render(float delta) {
        super.render(delta);
        ScreenUtils.clear(0.33f, 0.45f, 0.68f, 1);
        batch.begin();
        batch.draw(bg, 0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        batch.draw(img, pos.x - (float) img.getWidth() / 2 / 2, pos.y - (float) img.getHeight() / 2 / 2,
                (float) img.getWidth() / 2, (float) img.getHeight() / 2);
        tmp.set(point);
        if (tmp.sub(pos).len() <= v.len()) {
            pos.set(point);
            v.setZero();
        } else {
            pos.add(v);
        }
        batch.end();
    }

    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) {
        point.set(screenX, Gdx.graphics.getHeight() - screenY);
        v.set(point.cpy().sub(pos)).setLength(VELOCITY);
        return false;
    }

    @Override
    public void dispose() {
        super.dispose();
        img.dispose();
        bg.dispose();
        batch.dispose();
    }
}
