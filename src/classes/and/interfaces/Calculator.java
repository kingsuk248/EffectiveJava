package classes.and.interfaces;

class Calculator {
	public static final int initDigit;
	
	static {
		initDigit = 0;
	}
	
	static enum Operation {
		ADD, SUBSTRACT, MULTIPLE, DIVIDE;
	}
	
	static class State {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	
	public void calculate() {
		Model m = new Model();
		String brand = m.getBrand();
		System.out.println("Calculating...");
		System.out.println("Brand..." + brand);
	}
	
	class Model {
		private String brand;
		private String type;
		public String getBrand() {
			return brand;
		}
		public void setBrand(String brand) {
			this.brand = brand;
		}
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		
		public void demo() {
			Calculator c = Calculator.this;
			c.calculate();
		}
	}
}

class Test {}