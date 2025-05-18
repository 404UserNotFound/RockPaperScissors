package org.challenge.model;

public enum Move {
    ROCK,
    PAPER,
    SCISSORS;

    public boolean winCondition(Move move) {
        return switch (this) {
            case ROCK -> move == Move.SCISSORS;
            case PAPER -> move == Move.ROCK;
            case SCISSORS -> move == Move.PAPER;
        };
    }

    public Result compareMoves(Move move) {
        if (this == move) return Result.DRAW;
        return this.winCondition(move) ? Result.WIN : Result.LOSE;
    }
}
