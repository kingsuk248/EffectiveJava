package creating.destroying.objects.copying.defensive;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

import javax.naming.OperationNotSupportedException;

public class Basket {
	private String shoppingMall;
	private List<String> items;
	private List<Integer> prices;
	
	public Basket() {
		items = new ArrayList<>();
		prices = new ArrayList<>();
	}
	
	public String getShoppingMall() {
		return shoppingMall;
	}
	
	public void setShoppingMall(String shoppingMall) {
		this.shoppingMall = shoppingMall;
	}
	
	public List<String> getItems() {
		List<String> copyitems = new ArrayList<String>(items);
		Collections.copy(copyitems, items);
		return copyitems;
	}
	
	public void setItems(List<String> items) {
		this.items = items;
	}
	
	public List<Integer> getPrices() {
		return prices;
	}
	
	public void setPrices(List<Integer> prices) {
		this.prices = prices;
	}
	
	public void addItem(String item) {
		items.add(Objects.requireNonNull(item));
	}
	
	public void addPrice(int price) throws OperationNotSupportedException {
		if (price < 0) {
			throw new OperationNotSupportedException();
		}
		prices.add(price);
	}
}
