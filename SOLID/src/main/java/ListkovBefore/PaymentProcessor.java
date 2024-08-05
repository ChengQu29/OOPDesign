package ListkovBefore;

public interface PaymentProcessor {

	public void pay(Order order, int securityCode);
}
