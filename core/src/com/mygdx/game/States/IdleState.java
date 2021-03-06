package com.mygdx.game.States;

import com.mygdx.game.Controls;
import com.mygdx.game.Objects.Player;

public abstract class IdleState extends State {

    public IdleState(Player player) {
        super(player);
    }

    @Override
    public void input() {
        if (Controls.isUpPressed()){
            System.out.println("UPPPPP");
            player.state = new UpState(player);
        }
        if (Controls.isDownPressed()){
            player.state = new DownState(player);
        }
        if (Controls.isLeftPressed()){
            player.state = new LeftState(player);
        }
        if (Controls.isRightPressed()){
            System.out.println("RIGHT");
            player.state = new RightState(player);
        }


    }

    @Override
    public void update() {

    }
}
