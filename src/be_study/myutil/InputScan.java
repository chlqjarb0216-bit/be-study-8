package be_study.myutil;

import java.util.Scanner;

public class InputScan {
	public static final Scanner SC = new Scanner(System.in);

	public static void flush() {
		if (SC.hasNextLine()) {
			SC.nextLine();
		}
	}

	public static void clear() {
		try {
			if (System.in.available() > 0) {
				System.in.skip(System.in.available());
			}
		} catch (Exception ignored) {
		}
	}
}
