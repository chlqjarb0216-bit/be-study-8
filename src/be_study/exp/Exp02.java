package be_study.exp;

public class Exp02 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int[] arr = new int[3];

		//		ArrayIndexOutOfBoundsException
		//		NullPointerException

		//		ArithmeticException

		try {
			int n = 10 / 0;
			//			arr = null;
			arr[5] = 10;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException catch block");
		} catch (NullPointerException e) {
			System.out.println("NullPointerException catch block");
		} catch (Exception e) {
			System.out.println("위에 다 안걸리고 Exception catch block");
		}
	}
}
