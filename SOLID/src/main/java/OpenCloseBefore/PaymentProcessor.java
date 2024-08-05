package OpenCloseBefore;


public class PaymentProcessor {

	public void payDebit(Order order, String securityCode) {
		System.out.println("Processing debit payment type");
		System.out.println("Verifying security code: " + securityCode);

		order.status = "paid";
	}

	public void payCredit(Order order, String securityCode) {
		System.out.println("Processing credit payment type");
		System.out.println("Verifying security code: " + securityCode);
		order.status = "paid";
	}

}
