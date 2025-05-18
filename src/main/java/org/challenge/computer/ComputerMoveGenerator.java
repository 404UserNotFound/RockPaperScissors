package org.challenge.computer;

import org.challenge.model.Move;

public interface ComputerMoveGenerator {
    /**
     * Generates a randomised move for the computer.
     *
     * @return randomised move
     */

    Move generateComputerMove();
}