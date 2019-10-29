package com.company.behavioral.state.example_1;

/**
 * Common interface for all states.
 */

// Контекст передає себе до конструктора стану, щоб стан міг
// звертатися до його даних та методів у майбутньому, якщо
// буде потрібно.

public abstract class State {
    Player player;

    /**
     * Context passes itself through the state constructor. This may help a
     * state to fetch some useful context data if needed.
     */
    public State(Player player) {
        this.player = player;
    }

    public abstract String onLock();

    public abstract String onPlay();

    public abstract String onNext();

    public abstract String onPrevious();
}
