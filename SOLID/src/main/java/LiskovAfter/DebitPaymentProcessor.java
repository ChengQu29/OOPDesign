package LiskovAfter;

public class DebitPaymentProcessor implements PaymentProcessor {
	private int securityCode;

	public DebitPaymentProcessor(int securityCode) {
		this.securityCode = securityCode;
	}

	@Override
	public void pay(Order order) {
		System.out.println("Processing debit payment type");
		System.out.println("Verifying security code: " + securityCode);

		order.status = "paid";
	}
}
