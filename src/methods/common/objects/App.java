package methods.common.objects;

import java.util.HashMap;
import java.util.Map;

public class App {
	public static void main(String[] args) {
		App app = new App();
		app.symmetryTest();
		System.out.println();
		app.transitivityTest();
		System.out.println();
		app.overrideEqualsHashcodeTest();
		app.cloneTest();
	}
	
	private void cloneTest() {
		PhoneNumber pn = new PhoneNumber(192, 168, 234);
		PhoneNumber pn2 = pn.clone();
		System.out.println(pn);
		System.out.println(pn2);
	}

	private void overrideEqualsHashcodeTest() {
		Map<PhoneNumber, String> phoneMap = new HashMap<>();
		phoneMap.put(new PhoneNumber(348, 286, 180), "Mark");
		System.out.println(phoneMap.get(new PhoneNumber(348, 286, 180)));
	}

	public void symmetryTest() {
		System.out.println("Symmetry Test");
		CaseInsensitiveString cis = new CaseInsensitiveString("Hello");
		String hello = "hello";
		System.out.println(cis.equals(hello));
		System.out.println(hello.equals(cis));
	}
	
	private void transitivityTest() {
		System.out.println("Transitivity Test");
		ColorPoint cp = new ColorPoint(1, 2, "RED");
		Point p = new Point(1, 2);
		System.out.println(p.equals(cp));
		System.out.println(cp.equals(p));
		SmellPoint sp = new SmellPoint(1,2, "LAVENDER");
		System.out.println(p.equals(sp));
		System.out.println(sp.equals(p));
		//System.out.println(sp.equals(cp)); // Stackoverflow error
	}
}
