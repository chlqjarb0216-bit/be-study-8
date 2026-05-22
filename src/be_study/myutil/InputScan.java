package be_study.myutil;

import java.util.Scanner;

public class InputScan {
	public static Scanner SC = new Scanner(System.in);

	//	쓰레기 코드
	//	public static void flush() {
	//		if (SC.hasNextLine()) {
	//			SC.nextLine();
	//		}
	//	}

	public static void clear() {
		SC = new Scanner(System.in);
	}
}
