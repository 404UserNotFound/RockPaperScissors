package org.challenge.evaluator;

import org.challenge.evulator.MoveEvaluatorImpl;
import org.challenge.model.Move;
import org.challenge.model.Result;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MoveEvaluatorImplTest {
    private final MoveEvaluatorImpl moveEvaluator = new MoveEvaluatorImpl();

    @Test
    void playerWinsWithRockAgainstScissors() {
        assertEquals(Result.WIN, moveEvaluator.evaluateResult(Move.ROCK, Move.SCISSORS));
    }

    @Test
    void playerLosesWithPaperAgainstScissors() {
        assertEquals(Result.LOSE, moveEvaluator.evaluateResult(Move.PAPER, Move.SCISSORS));
    }

    @Test
    void playerDrawsWithRockAgainstRock() {
        assertEquals(Result.DRAW, moveEvaluator.evaluateResult(Move.ROCK, Move.ROCK));
    }
}
