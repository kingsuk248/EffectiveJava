package creating.destroying.objects.singleton;

public class ElvisOne {
	private ElvisOne() {
	}
	
	public static final ElvisOne INSTANCE = new ElvisOne();
	
	private Object readResolve() {
		return INSTANCE;
	}
}
