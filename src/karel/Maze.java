package karel;
import stanford.karel.SuperKarel;

public class Maze extends SuperKarel {
	public void run() {
		while (true) {
			if (frontIsClear()) {
				move();
			}

			if (frontIsBlocked() && rightIsBlocked() && leftIsClear()) {
				turnLeft();
			}

			if (frontIsBlocked() && leftIsBlocked() && rightIsClear()) {
				turnRight();
			}

		}

	}
}
