package com.mygdx.game.States;


import com.mygdx.game.Objects.Player;

public abstract class State {

    Player player;

    enum DirectionState {
        IDLE,
        UP,
        DOWN,
        LEFT,
        RIGHT
    }

    public State(Player player){
        this.player = player;
    }



    public abstract void input();

    public abstract void update();


}


