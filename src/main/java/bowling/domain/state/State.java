package bowling.domain.state;

import bowling.domain.score.Score;

public interface State {
    int MIN_LEFT_TRY = 1;

    State record(int pins);

    default Score getScore() {
        return null;
    }

    default boolean isFinished() {
        return false;
    }
}
