package com.mygdx.game.States;

import com.mygdx.game.Objects.Player;

public class IdleUpState extends IdleState {
    public IdleUpState(Player player) {
        super(player);
        player.directionState = Player.DirectionState.IDLEUP;
    }
}
