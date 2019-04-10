package com.mygdx.game.Objects;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Vector2;
import com.mygdx.game.Assets;
import com.mygdx.game.Controls;
import com.mygdx.game.Gamepad;

public class Player extends Sprite {

    Vector2 position;

    float stateTime;
    float speed = 2.5f;

    TextureRegion frame;

    enum State{
        IDLE_UP,
        IDLE_DOWN,
        IDLE_LEFT,
        IDLE_RIGHT
    }

    //http://www.gameprogrammingpatterns.com/state.html

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

        if (Controls.isDownPressed()){
            moveDown();
        }
        if (Controls.isUpPressed()){
            moveUp();
        }
        if (Controls.isLeftPressed()){
            moveLeft();
        }
        if (Controls.isRightPressed()){
            moveRight();
        }

    }

    private void moveUp() {
        position.y+=speed;
    }

    private void moveDown() {
        position.y-=speed;
    }

    private void moveRight() {
        position.x+=speed;
    }

    private void moveLeft() {
        position.x-=speed;
    }

    private void setFrame(Assets assets) {

        frame = assets.player.getKeyFrame(stateTime, true);

        //switch estados (idle, left...) cambiando sprite
    }

}
