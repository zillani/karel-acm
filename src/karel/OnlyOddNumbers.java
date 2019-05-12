package karel;
import stanford.karel.SuperKarel;

public class OnlyOddNumbers extends SuperKarel {
	public void run() {
		String s = "test";
		Integer i = 2;
		int j = 3;
		
		putAndMove();
		turnLeft();

		putAndMove();

		turnRight();
		move();
		turnRight();

		putAndMove();

		turnLeft();
		move();
		turnLeft();

		putAndMove();

		turnRight();
		move();
		turnRight();

		putAndMove();

		turnLeft();
		move();
		turnLeft();

		putAndMove();

		turnRight();
		move();
		turnRight();

		putAndMove();

		turnLeft();
		move();
		turnLeft();

		putAndMove();

		turnRight();
		move();
		turnRight();

		putAndMove();

		turnLeft();
		move();
		turnLeft();

		putAndMove();

	}

	public void putAndMove() {
		for (int i = 0; i < 9; i++) {
			if (i % 2 != 0) {

				move();
			} else {
				putBeeper();
				move();
			}
		}
	}

	public void putAndMove2() {
		for (int i = 0; i < 9; i++) {
			if (i % 2 != 0) {
				putBeeper();
				move();
			} else {
				move();
			}
		}
	}
}
