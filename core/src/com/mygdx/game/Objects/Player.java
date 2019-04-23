package com.mygdx.game.Objects;

import com.badlogic.gdx.controllers.Controller;
import com.badlogic.gdx.controllers.Controllers;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Vector2;
import com.mygdx.game.Assets;
import com.mygdx.game.Controls;
import com.mygdx.game.Gamepad;
import com.mygdx.game.States.IdleUpState;
import com.mygdx.game.States.State;

public class Player extends Sprite {

    public State state;

    private Vector2 position;

    private float stateTime;
    public float maxSpeed = 2.5f;
    public Vector2 speed = new Vector2();

    private TextureRegion frame;

    Gamepad gamepad = new Gamepad(this);



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

        state.input();





    }


    public void move(){

        position.x += speed.x;
        position.y += speed.y;

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
