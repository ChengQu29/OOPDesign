package OpenCloseAfter;

public class CryptoPaymentProcessor implements PaymentProcessor {
	@Override public void pay(Order order, String securityCode) {
		System.out.println("Processing credit payment type");
		System.out.println("Verifying security code: " + securityCode);
		order.status = "paid";
	}
}
