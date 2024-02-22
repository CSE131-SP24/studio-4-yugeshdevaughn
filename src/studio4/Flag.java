package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.setPenColor(0, 0, 0);
		 StdDraw.filledRectangle(.5, .75, .28, .140);
		 StdDraw.filledRectangle(.5, .5, .28, .140);
		 
		 StdDraw.setPenColor(0, 0, 255);
		 StdDraw.filledRectangle(.5, .75, .25, .125);
		 
		 StdDraw.setPenColor(255, 255, 0);
		 StdDraw.filledRectangle(.5, .5, .25, .125);
	}
}