package com.company.behavioral.state.example_1;

/**
 * Concrete states provide the special implementation for all interface methods.
 */
public class LockedState extends State {

    LockedState(Player player) {
        super(player);
        player.setPlaying(false);
    }

    // При розблокуванні програвача із заблокованими клавішами,
    // він може прийняти один з двох станів.
    @Override
    public String onLock() {
        if (player.isPlaying()) {
            player.changeState(new ReadyState(player));
            return "Stop playing";
        } else {
            return "Locked...";
        }
    }

    @Override
    public String onPlay() {
        player.changeState(new ReadyState(player));
        return "Ready";
    }

    // Нічого не робити.
    @Override
    public String onNext() {
        return "Locked...";
    }

    // Нічого не робити.
    @Override
    public String onPrevious() {
        return "Locked...";
    }
}