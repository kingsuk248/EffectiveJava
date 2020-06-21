package creating.destroying.objects.singleton;

public class ElvisTwo {
	private ElvisTwo() {
	}
	
	private static final ElvisTwo INSTANCE = new ElvisTwo();
	
	public ElvisTwo getInstance() {
		return INSTANCE;
	}
	
	private Object readResolve() {
		return INSTANCE;
	}
}
