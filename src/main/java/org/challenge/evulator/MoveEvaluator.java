package org.challenge.evulator;

import org.challenge.model.Move;
import org.challenge.model.Result;

public interface MoveEvaluator {
    /**
     * @param playerMove   - move made by player
     * @param computerMove - move made by computer
     * @return result of game round
     */

    Result evaluateResult(Move playerMove, Move computerMove);
}
