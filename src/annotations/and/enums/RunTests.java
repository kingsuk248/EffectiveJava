package annotations.and.enums;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class RunTests {
	public static void main(String[] args) throws ClassNotFoundException {
		int tests = 0;
		int pass = 0;
		int fail = 0;
		Class<?> sample = Class.forName("annotations.and.enums.Sample2");
		for (Method m : sample.getDeclaredMethods()) {
			if (m.isAnnotationPresent(ExceptionTest.class)) {
				tests++;
				try {
					System.out.println("Method name: " + m.getName());
					m.invoke(null);
					pass++;
					System.out.println(m + " passed");
				} catch (InvocationTargetException ite) {
					Throwable t = ite.getCause();
					Class<? extends Throwable> et = m.getAnnotation(ExceptionTest.class).value();
					if (et.isInstance(t)) {
						System.out.println(m + " passed with Exception");
						pass++;
					} else {
						System.out.println(m + " failed: " + t);
						fail++;
					}
				} catch (Exception e) {
					System.out.println("Invalid Test method: " + m);
				}
			}
		}
		System.out.println("Tests: " + tests + ", Passed: " + pass + ", Fail: " + fail);
	}
}
