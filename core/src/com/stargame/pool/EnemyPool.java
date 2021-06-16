package com.stargame.pool;

import com.badlogic.gdx.audio.Sound;
import com.stargame.base.SpritesPool;
import com.stargame.math.Rect;
import com.stargame.sprite.EnemyShip;
import com.stargame.sprite.Explosion;

public class EnemyPool extends SpritesPool<EnemyShip> {

    private final Rect worldBounds;
    private final ExplosionPool explosionPool;
    private final BulletPool bulletPool;
    private final Sound bulletSound;

    public EnemyPool(Rect worldBounds, ExplosionPool explosionPool, BulletPool bulletPool, Sound bulletSound) {
        this.worldBounds = worldBounds;
        this.explosionPool = explosionPool;
        this.bulletPool = bulletPool;
        this.bulletSound = bulletSound;
    }

    @Override
    protected EnemyShip newObject() {
        return new EnemyShip(worldBounds, explosionPool, bulletPool, bulletSound);
    }
}
