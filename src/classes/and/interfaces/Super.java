package classes.and.interfaces;

public class Super {
	Super() {
		overrideMe();
	}
	
	protected void overrideMe() {
		System.out.println("Super's override");
	}
}
