package main.java.ruttunen;

import lejos.nxt.*;

public class Main {

	public static void main(String[] args) {

		Motor.A.forward();
		Motor.B.forward();

		Button.ENTER.waitForPressAndRelease();

	}
}
