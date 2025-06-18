package org.example;

public class Score {
    private int applesEaten = 0;

    public void increment() {
        applesEaten++;
    }

    public void incrementByVal(int val) {
        applesEaten += val;
    }

    public int getScore() {
        return applesEaten;
    }

    public void reset() {
        applesEaten = 0;
    }
}
