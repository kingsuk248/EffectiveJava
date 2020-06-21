package methods.common.objects;

public class ColorPoint extends Point {
	String color;
	
	public ColorPoint(int x, int y, String c) {
		super(x,y);
		this.color = c;
	}
	
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof Point)) {
			return false;
		}
		if (!(o instanceof ColorPoint)) {
			return o.equals(this);
		}
		ColorPoint cp = (ColorPoint) o;
		return this.color == cp.color && super.equals(cp);
	}
}
