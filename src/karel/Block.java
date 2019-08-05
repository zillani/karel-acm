package karel;

import stanford.karel.SuperKarel;

public class Block extends SuperKarel {
    public void run() {
        while (frontIsClear()) {
            move();
            //condition if frontisBlocked
            jump();
        }

    }

    public static void main(String[] args) {
        new Block().start(args);
    }

    public void jump() {
        if (frontIsBlocked()) {
            turnLeft();

            while (rightIsBlocked()) {
                move();
            }

            turnRight();
            move();
            turnRight();

            while (rightIsBlocked()) {
                if (frontIsClear()) {
                    move();
                }

                turnLeft();
            }

        }
    }
}