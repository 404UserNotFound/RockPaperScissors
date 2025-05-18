package org.challenge.input;

import org.challenge.model.Move;

public interface PlayerInput {
    /**
     * Gets player's input.
     * @return player's move
     */

    Move getPlayerMove();
}