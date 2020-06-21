package generics;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class PickTwo {
	static <T> List<T> pickTwo(T a, T b, T cs) {
		switch(ThreadLocalRandom.current().nextInt(3)) {
			case 0:
				break;
			case 1:
				break;
			case 2:
				break;
		}
		return null;
	}
}
