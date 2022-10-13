package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		//background of flag
		StdDraw.setPenColor(135, 206, 250);
		StdDraw.filledRectangle(.5, .5, .45, .25);
		StdDraw.setPenColor(255,255,0);
		StdDraw.filledCircle(.15, .65, .08);
		StdDraw.setPenColor(128,128,128);
		double[] x = {.05, .3, .175};
		double[] y = {.25, .25, .45};
		StdDraw.filledPolygon(x, y);
		StdDraw.setPenColor(183,146,104);
		StdDraw.filledEllipse(.6,.6,.3,.1);
	}
}