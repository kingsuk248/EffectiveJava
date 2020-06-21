package methods.common.objects;

public class SmellPoint extends Point {
	String smell;

	public SmellPoint(int x, int y, String s) {
		super(x,y);
		this.smell = s;
	}

	@Override
	public boolean equals(Object o) {
		if (!(o instanceof Point)) {
			return false;
		}
		if (!(o instanceof SmellPoint)) {
			return o.equals(this);
		}
		SmellPoint sp = (SmellPoint) o;
		return this.smell == sp.smell && super.equals(sp);
	}
}
