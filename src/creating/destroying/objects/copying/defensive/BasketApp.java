package creating.destroying.objects.copying.defensive;

import java.util.List;

public class BasketApp {
	public static void main(String[] args) {
		Basket b = new Basket();
		b.addItem("Toy");
		b.addItem("Milk");
		b.addItem("Fish");
		System.out.println(b.getItems());
		List<String> items = b.getItems();
		items.set(0, null);
		System.out.println(b.getItems());
	}
}
