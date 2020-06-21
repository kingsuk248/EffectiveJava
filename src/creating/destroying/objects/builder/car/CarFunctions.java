package creating.destroying.objects.builder.car;

public enum CarFunctions {
	FORWARD("go forward"), BACKWARD("go backward"), LEFT("steer left"), RIGHT("steer right");
	
	private final String doThis;
	
	private CarFunctions(String function) {
		this.doThis = function;
	}
	
	public String doThis() {
		return this.doThis;
	}
}
