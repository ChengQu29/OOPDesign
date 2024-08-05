package ListkovBefore;

public class PaypalPaymentProcessor implements PaymentProcessor {


	@Override
	public void pay(Order order, int securityCode) {
		System.out.println("Processing credit payment type");
		System.out.println("Verifying security code: " + securityCode);
		order.status = "paid";
	}
}
