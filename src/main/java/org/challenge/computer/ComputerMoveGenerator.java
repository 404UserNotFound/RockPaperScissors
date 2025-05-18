package org.challenge.computer;

import org.challenge.model.Move;

public sealed interface ComputerMoveGenerator permits ComputerMoveGeneratorImpl {
    /**
     * Generates a randomised move for the computer.
     *
     * @return randomised move
     */

    Move generateComputerMove();
}