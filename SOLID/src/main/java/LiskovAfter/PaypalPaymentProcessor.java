package LiskovAfter;

public class PaypalPaymentProcessor implements PaymentProcessor {
	private String email;

	public PaypalPaymentProcessor(String email) {
		this.email = email;
	}

	@Override
	public void pay(Order order) {
		System.out.println("Processing credit payment type");
		System.out.println("Verifying security code: " + email);
		order.status = "paid";
	}
}
