package net.wouto.simplemongo.update;

public enum PopOption {

    FIRST(-1),
    LAST(1);

    int c;

    private PopOption(int c) {
        this.c = c;
    }
}
