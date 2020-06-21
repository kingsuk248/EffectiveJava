package annotations.and.enums;

public class Sample2 {

	@ExceptionTest(ArithmeticException.class)
	public static void me1() {
		int i = 0;
		i /= i;
	}

	@ExceptionTest(ArithmeticException.class)
	public static void me2() {
		int[] arr = new int[0];
		int x = arr[1];
		x += x;
	}

	@ExceptionTest(ArithmeticException.class)
	public static void me3() {
		int x = 1;
		int y = 2;
		x += y;
		y += x;
	}
}
