package creating.destroying.objects;

public class Utility {
	private Utility() {
		
	}
	
	public static void main(String[] args) {
		Long l = 0L;
		for (int i = 0; i < Integer.MAX_VALUE; i++) {
			l += i;
		}
		System.out.println(l);
	}
}
