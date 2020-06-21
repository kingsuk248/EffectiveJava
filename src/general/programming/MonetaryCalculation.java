package general.programming;

import java.math.BigDecimal;

public class MonetaryCalculation {
	public static void main(String[] args) {
		MonetaryCalculation mc = new MonetaryCalculation();
		mc.elementaryCalc1();
		mc.elementaryCalc2();
		mc.elementaryCalc3();
		mc.elementaryCalc4();
	}
	
	private void elementaryCalc1() {
		System.out.println(5.07 - 4.12);
	}
	
	private void elementaryCalc2() {
		float coi = 0.1f;
		int noOfI = 9;
		System.out.println("Change: " + (1 - noOfI * coi));
	}
	
	private void elementaryCalc3() {
		double funds = 1;
		int noOfItems = 0;
		for (double cost = 0.1; funds >= cost; cost += 0.1) {
			noOfItems++;
			funds -= cost;
		}
		System.out.println("No of items " + noOfItems);
		System.out.println("Change " + funds);
	}
	
	private void elementaryCalc4() {
		BigDecimal tc = new BigDecimal("0.10");
		BigDecimal funds = new BigDecimal("1.00");
		int noi = 0;
		for (BigDecimal price = tc; funds.compareTo(price) >= 0; price = price.add(tc)) {
			noi++;
			funds = funds.subtract(price);
		}
		
		System.out.println("No of items BD: " +  noi);
		System.out.println("Change " + funds);
	}
}
