package org.challenge.computer;

import org.challenge.model.Move;

import java.util.Random;

public class ComputerMoveGeneratorImpl implements ComputerMoveGenerator {
    private final Random random;

    public ComputerMoveGeneratorImpl() {
        this.random = new Random();
    }

    @Override
    public Move generateComputerMove() {
        Move[] possibleMoves = Move.values();
        int index = random.nextInt(possibleMoves.length);
        return possibleMoves[index];
    }
}
