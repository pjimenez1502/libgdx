package com.mygdx.game.States;

import com.mygdx.game.Controls;
import com.mygdx.game.Objects.Player;

public class DownState extends State {
    public DownState(Player player) {
        super(player);
        player.directionState = Player.DirectionState.DOWN;
    }

    @Override
    public void input() {
        player.move();

        if (!Controls.isDownPressed()){
            player.state = new IdleDownState(player);
        }
        if (Controls.isLeftPressed()){
            player.state = new LeftState(player);
        }
        if (Controls.isRightPressed()){
            player.state = new RightState(player);
        }


    }

    @Override
    public void update() {

    }
}
