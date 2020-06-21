package creating.destroying.objects.builder.car;

public class CarApp {
	public static void main(String[] args) {
		Car.Builder carBuilder = new Car.Builder(123, "blue", CarFunctions.BACKWARD);
		carBuilder.accelaration(10);
		carBuilder.brakes(20);
		carBuilder.bhp(100);
		Car car = carBuilder.build();
		car.toString();
	}
}
