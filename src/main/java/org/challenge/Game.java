package org.challenge;

import org.challenge.computer.ComputerMoveGenerator;
import org.challenge.evulator.MoveEvaluator;
import org.challenge.input.PlayerInput;

public class Game {
    private final PlayerInput playerInput;
    private final ComputerMoveGenerator computerMoveGenerator;
    private final MoveEvaluator moveEvaluator;
    private final int numOfRounds;

    public Game(
            PlayerInput playerInput,
            ComputerMoveGenerator computerMoveGenerator,
            MoveEvaluator moveEvaluator,
            int numOfRounds
    ) {

        this.playerInput = playerInput;
        this.computerMoveGenerator = computerMoveGenerator;
        this.moveEvaluator = moveEvaluator;
        this.numOfRounds = numOfRounds;
    }

    public void start() {
        int playerWins = 0;
        int computerWins = 0;
        int draws = 0;

        System.out.printf("%n Final Results: WIN:%d LOSE:%d DRAW:%d %n", playerWins, computerWins, draws);
    }
}
