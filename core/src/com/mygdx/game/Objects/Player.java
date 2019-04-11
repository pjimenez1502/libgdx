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

    enum DirectionState {
        UP,
        DOWN,
        LEFT,
        RIGHT
    }

    enum ActionState {
        IDLE, ATTACK, RUN, SHOOT, SHIELD, DODGE
    }

    DirectionState directionState;
    ActionState actionState;

    //http://www.gameprogrammingpatterns.com/state.html

    public Player(int initialPosition){
        position = new Vector2(initialPosition, 10);

        stateTime = 0;

        directionState = DirectionState.UP;
        actionState = ActionState.IDLE;
    }

    public void render(SpriteBatch batch){
        batch.draw(frame, position.x, position.y);

    }

    public void update(float delta, Assets assets){
        stateTime += delta;

        setFrame(assets);

        stateMachine();

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

    private void stateMachine() {
        switch (directionState){
            case UP:
                switch (actionState){
                    case RUN:

                        break;
                    case IDLE:
                        break;
                    case DODGE:
                        break;
                    case SHOOT:
                        break;
                    case ATTACK:
                        break;
                    case SHIELD:
                        break;
                }
                break;
            case DOWN:
                switch (actionState){
                    case RUN:

                        break;
                    case IDLE:
                        break;
                    case DODGE:
                        break;
                    case SHOOT:
                        break;
                    case ATTACK:
                        break;
                    case SHIELD:
                        break;
                }
                break;
            case LEFT:
                switch (actionState){
                    case RUN:

                        break;
                    case IDLE:
                        break;
                    case DODGE:
                        break;
                    case SHOOT:
                        break;
                    case ATTACK:
                        break;
                    case SHIELD:
                        break;
                }
                break;
            case RIGHT:
                switch (actionState){
                    case RUN:

                        break;
                    case IDLE:
                        break;
                    case DODGE:
                        break;
                    case SHOOT:
                        break;
                    case ATTACK:
                        break;
                    case SHIELD:
                        break;
                }
                break;


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
