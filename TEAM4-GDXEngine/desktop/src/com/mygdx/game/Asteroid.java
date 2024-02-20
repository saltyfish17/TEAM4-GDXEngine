package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;

public class Asteroid extends GameObject {
    private static final int ASTEROID_SPEED = 2;
    private Texture asteroidTexture; // Define the asteroidTexture variable
    private float width;
    private float height;

    public Asteroid(float startX, float startY, float width, float height, Texture texture) {
        super(startX, startY, texture);
        this.asteroidTexture = texture; // Initialize the asteroidTexture
        this.width = width;
        this.height = height;
    }

    @Override
    public void update() {
        setY(getY() - ASTEROID_SPEED);
    }

    public Texture getAsteroidTexture() {
        return asteroidTexture;
    }

    public float getWidth() {
        return width;
    }

    public float getHeight() {
        return height;
    }
}

