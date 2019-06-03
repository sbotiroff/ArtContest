
/*
* @ This file draws a warrior 
* @ Author: Sardor Botirov
* @ Professor: Syeda Daniya Nizami
* @ Class: Java C SCI 142
* @ Date: 11/30/2018
* @ file CanvasBoard.java
*
*/

import java.awt.Color;
import acm.program.*;
import acm.graphics.*;

// class fields
public class CanvasBoard extends GraphicsProgram {

	private GPen pen;
	// setup applet size for 800x600
	public final int APPLET_WIDTH = 800;
	public final int APPLET_HEIGHT = 600;
	// set up colors for future uses
	public static final Color VERY_LIGHT_BLUE = new Color(207, 236, 252);// creating color very light blue
	public static final Color COLOR_SILVER = new Color(204, 204, 204);

	// set up the state of the window
	public void init() {

		setSize(APPLET_WIDTH, APPLET_HEIGHT); // set the initial window size
	}

	public void run() {

		// declare a variable for our GPen
		// and initialized to a new GPen object

		pen = new GPen();
		add(pen); // adds the pen object to our applet

// background color of the sky __________________________________________________________________
		pen.setFillColor(VERY_LIGHT_BLUE); // set the sky color to very light blue
		pen.startFilledRegion(); // start the background fill
		pen.drawLine(800, 0);
		pen.drawLine(0, 450);
		pen.drawLine(-800, 0);
		pen.drawLine(0, -450);
		pen.endFilledRegion(); // end the background fill
//______________________________________________________________________________________________

//background color of the ground_______________________________________________________________
		pen.setFillColor(Color.decode("#3a2a12"));// set texture of the ground to dark brown
		pen.startFilledRegion();
		pen.drawLine(0, 450);
		pen.drawLine(800, 0);
		pen.drawLine(0, 150);
		pen.drawLine(-800, 0);
		pen.endFilledRegion();

//______________________________________________________________________________________________

		// set the locations and calling functions to draw a warrior

		pen.setLocation(550, 250);
		drawHead();
		pen.setLocation(528, 405);
		drawLegs();
		pen.setLocation(570, 385);
		drawHips();
		pen.setLocation(575, 316);
		drawLeftHand();
		pen.setLocation(523, 317);
		drawRightHand();
		pen.setLocation(380, 280);
		drawSword();
		pen.setLocation(543, 322);
		drawBody();
		pen.setLocation(630, 330);
		drawShield();

	} // end of run()

	public void drawHead() {
		// head warrior
		pen.setFillColor(COLOR_SILVER);// set sword color to silver
		pen.startFilledRegion();
		pen.drawLine(-30, 8);
		pen.drawLine(-4, 25);
		pen.drawLine(4, 30);
		pen.drawLine(20, -6);
		pen.drawLine(2, -10);
		pen.drawLine(9, -2);
		pen.drawLine(0, -44);
		pen.endFilledRegion();
		// -----------------------------------
		// eye of the warrior
		pen.move(-20, 18);
		pen.setFillColor(Color.BLACK);// eye color
		pen.startFilledRegion();
		pen.drawLine(-10, 3);
		pen.drawLine(0, 4);
		pen.drawLine(10, -3);
		pen.drawLine(0, -4);
		pen.endFilledRegion();
		// -----------------------------------
		// mouth of the warrior
		pen.move(-15, 13);
		pen.setFillColor(Color.decode("#5c5c5c"));
		pen.startFilledRegion();
		pen.drawLine(15, 1);
		pen.drawLine(0, 20);
		pen.drawLine(-10, 8);
		pen.endFilledRegion();

		pen.move(5, -4);
		pen.drawLine(0, -25);
		pen.drawLine(0, 25);
		pen.move(-5, 4);

		pen.move(0, -4);
		pen.drawLine(0, -25);
		// -----------------------------------

		// neck of the warrior
		pen.move(10, 26);
		pen.setFillColor(Color.decode("#090909"));// eye color to lighter black
		pen.startFilledRegion();
		pen.drawLine(0, 15);
		pen.drawLine(22, 0);
		pen.drawLine(-4, -30);
		pen.endFilledRegion();
		// -----------------------------------
	}

	public void drawBody() {
		// warrior body
		pen.setFillColor(COLOR_SILVER);// set body color to silver or light gray
		pen.startFilledRegion();
		pen.drawLine(-5, -5);
		pen.drawLine(-25, 0);
		pen.drawLine(-8, 20);
		pen.drawLine(15, 60);
		pen.drawLine(22, 0);
		pen.drawLine(4, -4);
		pen.drawLine(4, 4);
		pen.drawLine(20, -1);
		pen.drawLine(10, -40);
		pen.drawLine(-6, -20);
		pen.drawLine(6, -20);
		pen.drawLine(-30, 0);
		pen.endFilledRegion();
		pen.drawLine(-5, 5);
		pen.drawLine(-5, 15);
		pen.drawLine(5, 20);

	}

	public void drawLeftHand() {
		pen.setFillColor(COLOR_SILVER);// set color to the silver
		pen.startFilledRegion();
		pen.drawLine(30, 30);
		pen.drawLine(-40, 0);
		pen.endFilledRegion();
	}

	public void drawShield() {
		pen.setFillColor(Color.DARK_GRAY);// set shield color to dark gray
		pen.startFilledRegion();
		pen.drawLine(-70, 20);
		pen.drawLine(11, 60);
		pen.drawLine(40, 40);
		pen.drawLine(35, -8);
		pen.drawLine(8, -55);
		pen.drawLine(-23, -56);
		pen.endFilledRegion();

		pen.move(-26, 80);// moved the pen to draw a circle inside of the shield
		pen.setFillColor(Color.ORANGE);// set sword color to silver
		pen.startFilledRegion();
		drawCircle(0.5, 360);
		pen.endFilledRegion();

	}

	public void drawRightHand() {
		pen.setFillColor(COLOR_SILVER);// set arm color to silver same color with body
		pen.startFilledRegion();
		pen.drawLine(-45, 40);
		pen.drawLine(-30, -10);
		pen.drawLine(-10, 10);
		pen.drawLine(40, 20);
		pen.drawLine(10, 0);
		pen.drawLine(50, -30);
		pen.endFilledRegion();
		pen.move(-90, 0);
		pen.setFillColor(Color.decode("#333333"));// set palm color to black
		pen.startFilledRegion();
		pen.drawLine(-25, 0);
		pen.drawLine(-3, 15);
		pen.drawLine(28, 0);
		pen.endFilledRegion();

	}

	public void drawSword() {
		pen.setFillColor(Color.decode("#ecfcfd"));// set sword color to silver
		pen.startFilledRegion();
		pen.drawLine(0, 16);
		pen.drawLine(30, 50);
		pen.drawLine(0, -16);
		pen.drawLine(-30, -50);
		pen.drawLine(16, 4);
		pen.drawLine(30, 50);
		pen.drawLine(-19, -7);
		pen.endFilledRegion();
		// moved the pen to draw a handle for sword
		pen.move(30, 2);
		pen.setFillColor(Color.decode("#333333"));// set sword handle color to black
		pen.startFilledRegion();
		pen.drawLine(-40, 23);
		pen.drawLine(3, 6);
		pen.drawLine(40, -23);
		pen.drawLine(-3, -6);
		pen.endFilledRegion();
		// moved the pen to continue to draw handle
		pen.move(-12, 13);
		pen.setFillColor(Color.decode("#333333"));// set sword handle color to black
		pen.startFilledRegion();
		pen.drawLine(11, 19);
		pen.drawLine(-10, 4);
		pen.drawLine(-11, -19);
		pen.endFilledRegion();

	}

	public void drawHips() {
		// warrior hips
		pen.setFillColor(Color.decode("#090909"));// black
		pen.startFilledRegion();
		pen.drawLine(-43, 8);
		pen.drawLine(-3, 30);
		pen.drawLine(49, -10);
		pen.drawLine(-3, -30);
		pen.endFilledRegion();

	}

	public void drawLegs() {
		// legs
		pen.setFillColor(COLOR_SILVER);// set sword color to silver
		pen.startFilledRegion();
		pen.drawLine(-30, 60);
		pen.drawLine(5, 40);
		pen.drawLine(19, 0);
		pen.drawLine(5, -42);
		pen.drawLine(20, -30);
		pen.drawLine(10, 30);
		pen.drawLine(0, 40);
		pen.drawLine(25, 0);
		pen.drawLine(-10, -100);
		pen.drawLine(-40, 2);
		pen.endFilledRegion();
		// left toe started
		pen.move(-30, 100);
		pen.setFillColor(Color.decode("#090909"));// left toe set the color to black
		pen.startFilledRegion();
		pen.drawLine(-20, 8);
		pen.drawLine(0, 10);
		pen.drawLine(40, 0);
		pen.drawLine(-1, -18);
		pen.drawLine(-20, 0);
		pen.endFilledRegion();
		// right toe started
		pen.move(55, -2);
		pen.setFillColor(Color.decode("#090909")); // right toe set the color to black
		pen.startFilledRegion();
		pen.drawLine(-4, 20);
		pen.drawLine(30, 0);
		pen.drawLine(0, -15);
		pen.drawLine(-2, -5);
		pen.drawLine(-25, 0);
		pen.endFilledRegion();

	}

	// this function, I used when I was drawing circle in the shield
	public void drawCircle(double radius, int segment) {

		for (int i = 0; i < segment; i++) {

			pen.drawPolarLine(radius, i);
		}
	}

}
