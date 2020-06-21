package annotations.and.enums;

public enum Planets {
	Mercury(3.35E12, 2.6e6),
	Venus(4.25E10, 3.5e6),
	Earth(5.25E13, 6.1e6),
	Mars(6.15E12, 3.6e6),
	Jupiter(1.15E14, 3.6e6),
	Saturn(7.15E13, 9.76e6),
	Uranus(9.15E12, 5.16e6),
	Neptune(8.15E12, 4.16e6);
	
	private final double mass;
	private final double radius;
	private final double surfaceGravity;
	
	public double getMass() {
		return mass;
	}

	public double getRadius() {
		return radius;
	}

	public double getSurfaceGravity() {
		return surfaceGravity;
	}

	public static double getG() {
		return G;
	}

	private static final double G = 1.345E10;
	
	Planets (double mass, double radius) {
		this.mass = mass;
		this.radius = radius;
		this.surfaceGravity = G * mass / Math.pow(this.radius, 2);
	}
	
	public double calculateWeight() {
		return mass * surfaceGravity;
	}
}
