package com.mygdx.game.States;

import com.mygdx.game.Objects.Player;

public class IdleDownState extends IdleState {
    public IdleDownState(Player player) {
        super(player);
        player.directionState = Player.DirectionState.IDLEDOWN;
    }
}
