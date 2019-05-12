package karel;

import stanford.karel.*;

public class AllTheDots extends SuperKarel {
	public void run() {
		putAndMove();
		putBeeper();
		
		turnLeft();
		move();
		turnLeft();

		putAndMove(); 
        putBeeper();
        
        turnRight();
        move();
        turnRight();
        
        putAndMove(); 
        putBeeper();
        
        turnLeft();
		move();
		turnLeft();

		putAndMove(); 
        putBeeper();
        
        turnRight();
        move();
        turnRight();
        
        putAndMove(); 
        putBeeper();
        
        turnLeft();
		move();
		turnLeft();
		
        putAndMove(); 
        putBeeper();
        
        turnRight();
        move();
        turnRight();
        
        putAndMove(); 
        putBeeper();
        
        turnLeft();
		move();
		turnLeft();
		
        putAndMove(); 
        putBeeper();
        
        turnRight();
        move();
        turnRight();
        
        putAndMove(); 
        putBeeper();
        
        turnLeft();
		move();
		turnLeft();
		
        putAndMove(); 
        putBeeper();
        
        
	}

	

	public void putAndMove() {
		for (int i = 0; i < 9; i++) {
							putBeeper();
				move();
			}
		}
	}
