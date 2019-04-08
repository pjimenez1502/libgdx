package com.mygdx.game;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.Objects.Player;

public class World {
    
    Player player;

    int WORLD_WIDTH, WORLD_HEIGHT;
    
    public World(int scene_width, int scene_height) {
        this.WORLD_WIDTH = scene_width;
        this.WORLD_HEIGHT = scene_height;

        player = new Player(WORLD_WIDTH/2);
    }

    public void render(float delta, SpriteBatch spriteBatch, Assets assets) {
        update(delta, assets);

        spriteBatch.begin();
        player.render(spriteBatch);

        spriteBatch.end();
    }

    void update(float delta, Assets assets){

        player.update(delta, assets);

        checkCollisions(assets);
    }

    private void checkCollisions(Assets assets) {

    }
}
