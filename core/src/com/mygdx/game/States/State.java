package com.mygdx.game.States;


import com.mygdx.game.Objects.Player;

public abstract class State {

    Player player;

    public State(Player player){
        this.player = player;
    }



    public abstract void input();

    public abstract void update();


}


