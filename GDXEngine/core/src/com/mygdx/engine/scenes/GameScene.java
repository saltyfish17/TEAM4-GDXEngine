package com.mygdx.engine.scenes;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public interface GameScene {
    void create();
    void update(float dt);
    void render(SpriteBatch batch);
    void dispose();
}