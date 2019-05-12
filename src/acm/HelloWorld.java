package acm;

import acm.graphics.GLabel;
import acm.program.GraphicsProgram;

public class HelloWorld extends GraphicsProgram {

	private static final String HEADLINE = "Hello, World!";

	/** Runs the program */
	public void run() {
		GLabel label = new GLabel(HEADLINE);

		label.setFont("Serif-75");

		println("WIDTH  " + getWidth());
		println("HEIGHT  " + getHeight());
		println("ASCENT " + label.getAscent());

		add(label, 200, 200);

	}
}
