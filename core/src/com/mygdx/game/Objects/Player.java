package com.mygdx.game.Objects;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Vector2;
import com.mygdx.game.Assets;
import com.mygdx.game.Controls;
import com.mygdx.game.States.IdleState;
import com.mygdx.game.States.IdleUpState;
import com.mygdx.game.States.State;

public class Player extends Sprite {

    public State state;

    Vector2 position;

    float stateTime;
    float speed = 2.5f;

    TextureRegion frame;

    public enum DirectionState {
        IDLEUP,
        IDLEDOWN,
        //
        UP,
        DOWN,
        LEFT,
        RIGHT
    }

    enum ActionState {
        IDLE, ATTACK, RUN, SHOOT, SHIELD, DODGE
    }

    public DirectionState directionState;
    ActionState actionState;

    //http://www.gameprogrammingpatterns.com/state.html

    public Player(int initialPosition){
        position = new Vector2(initialPosition, 10);

        stateTime = 0;

        state = new IdleUpState(this);


//        directionState = DirectionState.UP;
//        actionState = ActionState.IDLE;
    }

    public void render(SpriteBatch batch){
        batch.draw(frame, position.x, position.y);

    }

    public void update(float delta, Assets assets){
        stateTime += delta;

        setFrame(assets);

        stateMachine();

//        if (Controls.isDownPressed()){
//            moveDown();
//        }
//        if (Controls.isUpPressed()){
//            moveUp();
//        }
//        if (Controls.isLeftPressed()){
//            moveLeft();
//        }
//        if (Controls.isRightPressed()){
//            moveRight();
//        }

        state.input();

    }

    private void stateMachine() {
        /*
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


        }*/
    }

    public void moveUp() {
        position.y+=speed;
    }

    public void moveDown() {
        position.y-=speed;
    }

    public void moveRight() {
        position.x+=speed;
    }

    public void moveLeft() {
        position.x-=speed;
    }

    private void setFrame(Assets assets) {

        switch (directionState){
            case IDLEUP:
                frame = assets.playerIdleUp.getKeyFrame(stateTime, true);
                break;
            case IDLEDOWN:
                frame = assets.playerIdleDown.getKeyFrame(stateTime, true);
                break;
            case UP:
                frame = assets.playerUp.getKeyFrame(stateTime, true);
                break;
            case DOWN:
                frame = assets.playerDown.getKeyFrame(stateTime, true);
                break;
            case LEFT:
                frame = assets.playerLeft.getKeyFrame(stateTime, true);
                break;
            case RIGHT:
                frame = assets.playerRight.getKeyFrame(stateTime, true);
                break;
        }


        //switch estados (idle, left...) cambiando sprite
    }

}
