package lv.rvt;

import lv.rvt.decreasingCounter.DecreasingCounter;

public class MainProgram {
    public static void main(String[] args) {
        DecreasingCounter counter = new DecreasingCounter(10);

        counter.printValue();

        counter.decrement();
        counter.printValue();

        counter.decrement();
        counter.printValue();
    }
}
