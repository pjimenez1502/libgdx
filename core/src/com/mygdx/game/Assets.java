package com.mygdx.game;

import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class Assets  extends AssetManager {

    public TextureAtlas atlas;
    public Animation<TextureRegion> background, player;


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
        player = new Animation<TextureRegion>(1f, atlas.findRegions("playeridle"));

    }
}
