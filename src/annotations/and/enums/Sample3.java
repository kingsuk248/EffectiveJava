package annotations.and.enums;

public class Sample3 {

	@ExceptionTest2({ArithmeticException.class, NullPointerException.class})
	public void doubleExcep() {
		int[] integers = new int[5];
		integers[6] = 100;
	}
}
