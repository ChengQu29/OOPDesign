package LiskovAfter;

public class CreditPaymentProcessor implements PaymentProcessor {
	private int securityCode;

	public CreditPaymentProcessor(int securityCode) {
		this.securityCode = securityCode;
	}

	@Override public void pay(Order order) {
		System.out.println("Processing credit payment type");
		System.out.println("Verifying security code: " + securityCode);
		order.status = "paid";
	}
}
