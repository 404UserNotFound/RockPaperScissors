package org.challenge.input;

import org.challenge.model.Move;

public sealed interface PlayerInput permits PlayerInputImpl {
    /**
     * Gets player's input.
     * @return player's move
     */

    Move getPlayerMove();
}