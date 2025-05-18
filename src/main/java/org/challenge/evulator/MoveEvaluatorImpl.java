package org.challenge.evulator;

import org.challenge.model.Move;
import org.challenge.model.Result;

public final class MoveEvaluatorImpl implements MoveEvaluator {
    @Override
    public Result evaluateResult(Move playerMove, Move computerMove) {
        return playerMove.compareMoves(computerMove);
    }
}
