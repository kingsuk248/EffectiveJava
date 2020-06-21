package annotations.and.enums;

import java.lang.reflect.Method;

public class RunTests2 {
	public static void main(String[] args) throws ClassNotFoundException {
		int tests = 0;
		int passed = 0;
		int failed = 0;
		Class<?> s2 = Class.forName("annotations.and.enums.Sample2");
		for(Method m : s2.getDeclaredMethods()) {
			if (m.isAnnotationPresent(ExceptionTest2.class)) {
				tests++;
				try {
					m.invoke(null);
					passed++;
				} catch (Exception ex) {
					Throwable throwable = ex.getCause();
					int oldpassed = passed;
					Class<? extends Exception>[] exceptions = m.getAnnotation(ExceptionTest2.class).value();
					for (Class<? extends Exception> e : exceptions) {
						if (e.isInstance(throwable)) {
							passed++;
							break;
						}
					}
					if (oldpassed == passed) {
						System.out.printf("Tests %s failed: %n%s", m, throwable);
					}
				}
			}
		}
		System.out.println("Tests: " + tests + ", Passed: " + passed + ", Fail: " + failed);

	}
}
