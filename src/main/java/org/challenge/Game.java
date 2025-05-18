package org.challenge;

import org.challenge.computer.ComputerMoveGenerator;
import org.challenge.evulator.MoveEvaluator;
import org.challenge.input.PlayerInput;
import org.challenge.model.Move;
import org.challenge.model.Result;

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

        for (int currentRound = 1; currentRound <= numOfRounds; currentRound++) {
            System.out.printf("%n Round %d/%d %n", currentRound, numOfRounds);

            Move playerMove = playerInput.getPlayerMove();
            Move computerMove = computerMoveGenerator.generateComputerMove();
            Result result = moveEvaluator.evaluateResult(playerMove, computerMove);

            switch (result) {
                case WIN -> playerWins++;
                case LOSE -> computerWins++;
                case DRAW -> draws++;
            }
        }
        System.out.printf("%n Final Results: WIN:%d LOSE:%d DRAW:%d %n", playerWins, computerWins, draws);
    }
}
