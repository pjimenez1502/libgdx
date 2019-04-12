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
        player.move();

        if (Controls.isRightPressed()) {
            if(Controls.isUpPressed()){
                //player.moveUp();
            } else if (Controls.isDownPressed()) {
                //player.moveDown();
            }
        } else {
            player.state = new IdleUpState(player);
        }
    }

    @Override
    public void update() {

    }
}
