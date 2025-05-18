package org.challenge.game;

import org.challenge.computer.ComputerMoveGenerator;
import org.challenge.evulator.MoveEvaluator;
import org.challenge.input.PlayerInput;
import org.challenge.model.GameResult;
import org.challenge.model.Move;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GameTest {
    @Test
    void gameComputesCorrectResults() {
        List<Move> playerMoves = List.of(Move.PAPER, Move.PAPER, Move.SCISSORS);
        List<Move> computerMoves = List.of(Move.SCISSORS, Move.ROCK, Move.SCISSORS);
        final int[] index = {0};

        PlayerInput playerInput = () -> playerMoves.get(index[0]);
        ComputerMoveGenerator computerGenerator = () -> computerMoves.get(index[0]++);
        MoveEvaluator evaluator = Move::compareMoves;

        Game game = new Game(playerInput, computerGenerator, evaluator, 3);
        game.start();

        GameResult result = game.getResult();

        assertEquals(1, result.playerWins());
        assertEquals(1, result.computerWins());
        assertEquals(1, result.draws());
    }
}
