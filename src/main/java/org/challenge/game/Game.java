package org.challenge.game;

import org.challenge.computer.ComputerMoveGenerator;
import org.challenge.evulator.MoveEvaluator;
import org.challenge.input.PlayerInput;
import org.challenge.model.Move;
import org.challenge.model.Result;
import org.challenge.model.GameResult;

public class Game {
    private final PlayerInput playerInput;
    private final ComputerMoveGenerator computerMoveGenerator;
    private final MoveEvaluator moveEvaluator;
    private final int numOfRounds;
    private GameResult result;

    /**
     * Constructs a new Game instance.
     *
     * @param playerInput           the player's input
     * @param computerMoveGenerator the computer's generated move
     * @param moveEvaluator         the evaluator to determine the result of a round
     * @param numOfRounds           the number of rounds to play
     */

    public Game(
            PlayerInput playerInput,
            ComputerMoveGenerator computerMoveGenerator,
            MoveEvaluator moveEvaluator,
            int numOfRounds
    ) {
        if (numOfRounds <= 0) {
            throw new IllegalArgumentException("Number of rounds must be greater than 0.");
        }
        this.playerInput = playerInput;
        this.computerMoveGenerator = computerMoveGenerator;
        this.moveEvaluator = moveEvaluator;
        this.numOfRounds = numOfRounds;
        this.result = new GameResult(0, 0, 0);
    }

    public void start() {
        int playerWins = 0;
        int computerWins = 0;
        int draws = 0;

        for (int currentRound = 1; currentRound <= numOfRounds; currentRound++) {
            System.out.printf("%nRound %d/%d: %n", currentRound, numOfRounds);

            Move playerMove = playerInput.getPlayerMove();
            Move computerMove = computerMoveGenerator.generateComputerMove();
            Result result = moveEvaluator.evaluateResult(playerMove, computerMove);

            switch (result) {
                case WIN -> playerWins++;
                case LOSE -> computerWins++;
                case DRAW -> draws++;
            }
            System.out.printf("Player Move: %s, Computer Move: %s, Result: %s%n", playerMove, computerMove, result);
        }
        this.result = new GameResult(playerWins, computerWins, draws);
        System.out.printf("%nFinal Results: WIN:%d LOSE:%d DRAW:%d %n",
                result.playerWins(),
                result.computerWins(),
                result.draws());
    }

    public GameResult getResult() {
        if (result == null) {
            throw new IllegalStateException("Game not yet started.");
        }
        return result;
    }
}
