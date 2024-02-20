package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.Texture;

public class Player extends GameObject {
    private static final int PLAYER_SPEED = 5;
    private static final int PLAYER_START_X = 200;
    private static final int PLAYER_START_Y = 50;
    private static final int PLAYER_HEALTH = 3;
    private float width;
    private float height;
    private SimulationLifecycleManagement simulationLifecycleManagement;
    private int health;
    private Texture bulletTexture; // Add bulletTexture as a member variable

    public Player(float width, float height,Texture texture, Texture bulletTexture) {
        super(PLAYER_START_X, PLAYER_START_Y, texture);
        this.bulletTexture = bulletTexture; // Initialize bulletTexture
        health = PLAYER_HEALTH;
        this.width = width;
        this.height = height;
    }

    @Override
    public void update() {
    	SimulationLifecycleManagement simulationLifecycleManagement = new SimulationLifecycleManagement();
        if (Gdx.input.isKeyPressed(Keys.LEFT)) {
            setX(getX() - PLAYER_SPEED);
        }
        if (Gdx.input.isKeyPressed(Keys.RIGHT)) {
            setX(getX() + PLAYER_SPEED);
        }
        if (health <= 0) {
        	simulationLifecycleManagement.endSimulation();
        }
    }
    public float getWidth() {
        return width;
    } 

    public float getHeight() {
        return height;
    }

    public Bullet shoot() {
        float bulletWidth = 10; // Set the desired width of the bullet
        float bulletHeight = 10; // Set the desired height of the bullet
        return new Bullet(getX(), getY() - bulletHeight, bulletWidth, bulletHeight);
    }


    public void hit() {
        health--;
    }

    public int getHealth() {
        return health;
    }
}
