package karel;
import stanford.karel.SuperKarel;

public class JumpOverPole extends SuperKarel{
	public void run() {
		while(frontIsClear()){
			move();
			
			if(frontIsBlocked()) {
				jump();
			}
		}
	}
	
	public void jump() {
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
