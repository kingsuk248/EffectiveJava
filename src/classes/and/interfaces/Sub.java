package classes.and.interfaces;

import java.time.Instant;

public class Sub extends Super {
	private final Instant instant;
	
	Sub() {
		instant = Instant.now();
	}
	
	@Override
	protected void overrideMe() {
		System.out.println("Time is:" + instant);
	}
	
	public static void main(String[] args) {
		Super s = new Sub();
		s.overrideMe();
	}
}
