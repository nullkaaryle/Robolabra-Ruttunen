package org.lejos.example;

import lejos.nxt.*;

/**
 * Example leJOS Project with an ant build file
 * 
 */
public class HelloWorld {

	public static void main(String[] args) {

		Motor.A.forward();
		Motor.B.forward();

		Button.ENTER.waitForPressAndRelease();

	}
}
