package com.mygdx.game.States;

import com.mygdx.game.Controls;
import com.mygdx.game.Objects.Player;

public class LeftState extends State {
    public LeftState(Player player) {
        super(player);
        player.directionState = Player.DirectionState.LEFT;
    }

    @Override
    public void input() {
        if (!Controls.isLeftPressed()){
            player.state = new IdleUpState(player);
        }
        if (Controls.isUpPressed()){
            player.state = new UpState(player);
        }
        if (Controls.isDownPressed()){
            player.state = new DownState(player);
        }
//        if (Controls.isRightPressed()){
//            player.state = new RightState(player);
//        }

        player.moveLeft();
    }

    @Override
    public void update() {

    }
}
