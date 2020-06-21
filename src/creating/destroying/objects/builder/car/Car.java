package creating.destroying.objects.builder.car;

public class Car {
	private final double price;
	private final String color;
	private final CarFunctions functions;
	private final String brand;
	private final int bhp;
	private final int accelaration;
	private final int brakes;
	private final String[] safetyFeatures;
	
	public static class Builder {
		private final double price;
		private final String color;
		private final CarFunctions functions;
		
		public Builder(double price, String color, CarFunctions functions) {
			this.price = price;
			this.color = color;
			this.functions = functions;
		}
		
		private String brand = "";
		private int bhp = 0;
		private int accelaration = 0;
		private int brakes = 0;
		private String[] safetyFeatures = new String[10];
		
		public Builder brand(String brand) {
			this.brand = brand;
			return this;
		}
		
		public Builder bhp(int bhp) {
			this.bhp = bhp;
			return this;
		}
		
		public Builder accelaration(int accelaration) {
			this.accelaration = accelaration;
			return this;
		}
		
		public Builder brakes(int brakes) {
			this.brakes = brakes;
			return this;
		}
		
		public Builder safetyFeatures(String[] safetyFeatures) {
			this.safetyFeatures = safetyFeatures;
			return this;
		}
		
		public Car build() {
			return new Car(this);
		}
	}
	
	
	private Car(Builder builder) {
		this.accelaration = builder.accelaration;
		this.bhp = builder.bhp;
		this.brakes = builder.brakes;
		this.brand = builder.brand;
		this.color = builder.color;
		this.functions = builder.functions;
		this.safetyFeatures = builder.safetyFeatures;
		this.price = builder.price;
	}

	public double getPrice() {
		return price;
	}
	public String getColor() {
		return color;
	}
	public CarFunctions getFunctions() {
		return functions;
	}
	public String getBrand() {
		return brand;
	}
	public int getBhp() {
		return bhp;
	}
	public int getAccelaration() {
		return accelaration;
	}
	public int getBrakes() {
		return brakes;
	}
	public String[] getSafetyFeatures() {
		return safetyFeatures;
	}
}
