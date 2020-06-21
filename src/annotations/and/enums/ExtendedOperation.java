package annotations.and.enums;

public enum ExtendedOperation implements Operation {
	EXPONENT("e") {
		@Override
		public double apply(double x, double y) {
			return Math.pow(x, y);
		}
	},
	
	REMINDER("%") {
		@Override
		public double apply(double x, double y) {
			return x % y;
		}
	};
	
	private final String symbol;
	
	private ExtendedOperation(String symbol) {
		this.symbol = symbol;
	}
	
	@Override
	public String toString() {
		return this.symbol;
	}
}
