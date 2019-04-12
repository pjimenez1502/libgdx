package com.mygdx.game.States;

import com.mygdx.game.Controls;
import com.mygdx.game.Objects.Player;

public class UpState extends State {
    public UpState(Player player) {
        super(player);
        player.directionState = Player.DirectionState.UP;
    }

    @Override
    public void input() {
        if (!Controls.isUpPressed()){
            player.state = new IdleUpState(player);
        }
//        if (Controls.isDownPressed()){
//            player.state = new DownState(player);
//        }
        if (Controls.isLeftPressed()){
            player.state = new LeftState(player);
        }
        if (Controls.isRightPressed()){
            player.state = new RightState(player);
        }

        player.moveUp();
    }

    @Override
    public void update() {

    }


}
