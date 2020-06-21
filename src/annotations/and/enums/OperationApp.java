package annotations.and.enums;

public class OperationApp {
	public static void main(String[] args) {
		double x = 456.235;
		double y = 124.135;

		for (BasicOperation o : BasicOperation.values()) {
			System.out.println(x + " " + o.toString() + " : " + o.apply(x, y));
		}

	}

	public <T extends Enum<T> & Operation> void operate(Class<T> operationEnum, double x, double y) {
		for (Operation o : operationEnum.getEnumConstants()) {
			System.out.println(x + " " + o.toString() + " : " + o.apply(x, y));
		}
	}
}
