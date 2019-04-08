package com.mygdx.game.Objects;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Vector2;
import com.mygdx.game.Assets;

public class Player {

    Vector2 position;

    float stateTime;
    float speed = 5;

    TextureRegion frame;

    public Player(int initialPosition){
        position = new Vector2(initialPosition, 10);

        stateTime = 0;
    }

    public void render(SpriteBatch batch){
        batch.draw(frame, position.x, position.y);

    }

    public void update(float delta, Assets assets){
        stateTime += delta;

        setFrame(assets);
    }

    private void setFrame(Assets assets) {

        frame = assets.player.getKeyFrame(stateTime, true);

        //switch estados (idle, left-...) cambiando sprite
    }

}
