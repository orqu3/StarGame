package com.stargame.pool;

import com.stargame.base.SpritesPool;
import com.stargame.sprite.Bullet;

public class BulletPool extends SpritesPool<Bullet> {

    @Override
    protected Bullet newObject() {
        return new Bullet();
    }
}
