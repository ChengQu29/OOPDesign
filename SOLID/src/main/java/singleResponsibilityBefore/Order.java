package singleResponsibilityBefore;

import java.util.ArrayList;
import java.util.List;

public class Order {
//class has multiple responsibilities
	List<String> items;
	List<Integer> quantities;
	List<Double> prices;
	String status;

	public Order() {
		items = new ArrayList<>();
		quantities = new ArrayList<>();
		prices = new ArrayList<>();
		status = "open";
	}

	public void addItem(String name, int quantity, double price) {

		items.add(name);
		quantities.add(quantity);
		prices.add(price);

	}

	public double getTotalPrice() {
		double total = 0;

		for (int i=0; i<prices.size(); i++) {
			total += quantities.get(i) * prices.get(i);
		}
		return total;
	}

	public void pay(String paymentType, String securityCode) throws Exception {
		if (paymentType.equals("debit")) {
			System.out.println("Processing debit payment type");
			System.out.println("Verifying security code: " + securityCode);
			status = "paid";
		} else if (paymentType.equals("credit")) {
			System.out.println("Processing credit payment type");
			System.out.println("Verifying security code: " + securityCode);
			status = "paid";
		} else {
			throw new Exception("Unknown payment type: " + paymentType);
		}
	}

	// Getters and setters
	public List<String> getItems() {
		return items;
	}

	public List<Integer> getQuantities() {
		return quantities;
	}

	public List<Double> getPrices() {
		return prices;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
