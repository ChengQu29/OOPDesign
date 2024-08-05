package OpenCloseAfter;

public class DebitPaymentProcessor implements PaymentProcessor {
	@Override public void pay(Order order, String securityCode) {
		System.out.println("Processing debit payment type");
		System.out.println("Verifying security code: " + securityCode);

		order.status = "paid";
	}
}
