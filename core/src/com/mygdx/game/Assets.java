package com.mygdx.game;

import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class Assets  extends AssetManager {

    public TextureAtlas atlas;
    public Animation<TextureRegion> player;


    public void load(){
        load("",TextureAtlas.class);
    }

    @Override
    public synchronized boolean update() {
        boolean update = super.update();

        if (update){
            atlas = get("", TextureAtlas.class);

            loadAnimations();
        }

        return update;
    }

    private void loadAnimations() {

        player = new Animation<TextureRegion>(1f, atlas.findRegion("player_idle"));

    }
}
