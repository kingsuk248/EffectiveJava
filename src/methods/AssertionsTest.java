package methods;

public class AssertionsTest {
	public static void main(String[] args) {
		AssertionsTest at = new AssertionsTest();
		at.testIt(10, 0);
	}
	
	void testIt(int a, int b) {
		assert b > 0;
		int result = a/b;
		System.out.println(result);
	}
}
