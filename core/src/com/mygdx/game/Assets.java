package com.mygdx.game;

import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class Assets  extends AssetManager {

    public TextureAtlas atlas;
    public Animation<TextureRegion> background, playerIdleUp, playerUp, playerDown, playerLeft, playerRight, playerIdleDown;


    public void load(){
        load("invaders.atlas", TextureAtlas.class);
    }

    @Override
    public synchronized boolean update() {
        boolean update = super.update();

        if (update){
            atlas = get("invaders.atlas", TextureAtlas.class);

            loadAnimations();
        }

        return update;
    }

    private void loadAnimations() {

        background = new Animation<TextureRegion>(1f, atlas.findRegions("ground"));
        playerIdleUp = new Animation<TextureRegion>(1f, atlas.findRegions("playerIdleUp"));
        playerIdleDown = new Animation<TextureRegion>(1f, atlas.findRegions("playerIdleDown"));
        playerUp = new Animation<TextureRegion>(1f, atlas.findRegions("playerUp"));
        playerDown = new Animation<TextureRegion>(1f, atlas.findRegions("playerDown"));
        playerLeft = new Animation<TextureRegion>(1f, atlas.findRegions("playerLeft"));
        playerRight = new Animation<TextureRegion>(1f, atlas.findRegions("playerRight"));



    }
}
