package org.challenge.computer;

import org.challenge.model.Move;
import org.junit.jupiter.api.Test;

import java.util.EnumSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ComputerMoveGeneratorImplTest {

    @Test
    void allGeneratedMovesAreValid() {
        ComputerMoveGeneratorImpl computerMoveGenerator = new ComputerMoveGeneratorImpl();

        for (int i = 0; i < 100; i++) {
            Move move = computerMoveGenerator.generateComputerMove();
            assertTrue(move == Move.ROCK || move == Move.PAPER || move == Move.SCISSORS);
        }
    }

    @Test
    void allPossibleMovesAreGeneratedOverTime() {
        ComputerMoveGeneratorImpl computerMoveGenerator = new ComputerMoveGeneratorImpl();
        Set<Move> movesAlreadySeen = EnumSet.noneOf(Move.class);

        for (int i = 0; i < 100; i++) {
            movesAlreadySeen.add(computerMoveGenerator.generateComputerMove());
        }

        assertEquals(EnumSet.allOf(Move.class), movesAlreadySeen);
    }
}
