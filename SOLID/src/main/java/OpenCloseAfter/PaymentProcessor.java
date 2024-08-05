package OpenCloseAfter;


public interface PaymentProcessor {

	public void pay(Order order, String securityCode);
}
