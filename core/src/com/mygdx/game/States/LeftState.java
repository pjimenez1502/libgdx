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
        player.move();

        if (Controls.isLeftPressed()) {
            if (Controls.isUpPressed()) {
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
