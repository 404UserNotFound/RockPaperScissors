package org.challenge.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MoveTest {

    @Test
    public void rockBeatsScissors() {
        assertTrue(Move.ROCK.winCondition(Move.SCISSORS));
    }

    @Test
    public void paperBeatsRock() {
        assertTrue(Move.PAPER.winCondition(Move.ROCK));
    }

    @Test
    public void scissorsBeatsPaper() {
        assertTrue(Move.SCISSORS.winCondition(Move.PAPER));
    }

    @Test
    public void paperDrawsWithPaper() {
        assertEquals(Result.DRAW, Move.PAPER.compareMoves(Move.PAPER));
    }

    @Test
    void throwExceptionWhenInputInvalid() {
        assertThrows(IllegalArgumentException.class, () -> Move.valueOf("INVALID_MOVE"));
    }

    @Test
    void throwNullPointerExceptionWhenInputNull() {
        assertThrows(NullPointerException.class, () -> Move.valueOf(null));
    }
}
