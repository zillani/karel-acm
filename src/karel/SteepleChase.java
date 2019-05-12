package karel;
import stanford.karel.SuperKarel;

public class SteepleChase extends SuperKarel {
	public void run() {

		while (frontIsClear()) {
			putBeeper();
			if(beepersPresent())
			move();
			if (frontIsBlocked()) {
				jump();
				turnLeft();
			}
		}
	}

	public void jump() {

		print("inside jump");
		turnLeft();
		
		while (rightIsBlocked()) {
			if(frontIsBlocked()) {
				System.exit(0);
			}
			//moveup
			move();
		}
		
		println("turn right");
		turnRight();
		println("move it");
		move();
		println("turn right again");
		turnRight();
		println("and again");
		//moving down the pole
		while (frontIsClear()) {
			println("inside while loop");
			move();
		}
	}
}