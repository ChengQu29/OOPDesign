import OpenCloseAfter.CryptoPaymentProcessor;
import OpenCloseAfter.DebitPaymentProcessor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import OpenCloseAfter.Order;
import OpenCloseAfter.PaymentProcessor;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class OrderTest_OpenCloseAfter {

	private Order order;

	@BeforeEach
	void setup() {
		order = new Order();

	}
	@Test
	void testOrder() {

		order.addItem("Keyboard", 1, 50);
		assertEquals(1, order.getItems().size());
		assertEquals("Keyboard", "Keyboard", order.getItems().get(0));

	}

	@Test
	public void testPayValidPaymentType() {
		order.addItem("SSD", 1, 50);
		order.addItem("SSD", 1, 150);
		order.addItem("USB cable", 2, 5);
		try {
			DebitPaymentProcessor processor = new DebitPaymentProcessor();
			processor.pay(order, "0372846");

			//If I were to add a new kind of payment method, the PaymentProcessor class is open for extension, but close to modificiation
			/*
			CryptoPaymentProcessor cryptoPaymentProcessor = new CryptoPaymentProcessor();
			cryptoPaymentProcessor.pay(order, "4574389");
			*/

			System.out.println(order.getTotalPrice());
			assertEquals("paid", order.getStatus());
		} catch (Exception e) {
			fail("No exception should be thrown for valid payment types");
		}
	}
}
