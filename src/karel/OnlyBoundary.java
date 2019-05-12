package karel;
import stanford.karel.*;

public class OnlyBoundary extends Karel {
	public void run() {
		putAndMove();
		putBeeper();
		
		turnLeft();
		move();
		
		putAndMove2();
        putBeeper();

		turnLeft();
		move();
		
		putAndMove2();
        putBeeper();
		
		turnLeft();
		move();
		
		putAndMove3();
        putBeeper();	
	
	}

	public void turnRight() {
		turnLeft();
		turnLeft();
		turnLeft();
	}

	public void putAndMove() {
		for (int i = 0; i < 9; i++) {
				putBeeper();
				move();
			}
	}
	public void putAndMove2() {
		for (int i = 0; i < 8; i++) {
				putBeeper();
				move();
			}
	}	
	public void putAndMove3() {
				for (int i = 0; i < 7; i++) {
					putBeeper();
					move();
			}		
		}
	}
