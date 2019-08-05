package karel;

import stanford.karel.Karel;

public class CheckerboardKarel extends Karel {

    public void run() {
        move();
    }

    public static void main(String[] args) {
        new CheckerboardKarel().start(args);
    }

}
