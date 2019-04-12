package com.mygdx.game.States;

import com.mygdx.game.Controls;
import com.mygdx.game.Objects.Player;

public class RightState extends State {
    public RightState(Player player) {
        super(player);
        player.directionState = Player.DirectionState.RIGHT;
    }

    @Override
    public void input() {
        if (!Controls.isRightPressed()){
            player.state = new IdleUpState(player);
        }
        if (Controls.isUpPressed()){
            player.state = new UpState(player);
        }
        if (Controls.isDownPressed()){
            player.state = new DownState(player);
        }
//        if (Controls.isLeftPressed()){
//            player.state = new LeftState(player);
//        }

        player.moveRight();
    }

    @Override
    public void update() {

    }
}
