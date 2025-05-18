package org.challenge.model;

public enum Move {
    ROCK,
    PAPER,
    SCISSORS;

    public boolean winCondition(Move move) {
        return switch (this) {
            case ROCK -> move == Move.ROCK;
            case PAPER -> move == Move.PAPER;
            case SCISSORS -> move == Move.SCISSORS;
        };
    }

    public Result compareMoves(Move move) {
        if (this == move) return Result.DRAW;
        return this.winCondition(move) ? Result.WIN : Result.LOSE;
    }
}
