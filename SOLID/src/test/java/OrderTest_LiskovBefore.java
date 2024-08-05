import ListkovBefore.Order;
import ListkovBefore.PaypalPaymentProcessor;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class OrderTest_LiskovBefore {

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
			PaypalPaymentProcessor processor = new PaypalPaymentProcessor();
			processor.pay(order, 74839201);

			//think about future : if paypal payment needs to accept email instead of security code
			//processor.pay(order, "cq@gmail.com")

			System.out.println(order.getTotalPrice());
			assertEquals("paid", order.getStatus());
		} catch (Exception e) {
			fail("No exception should be thrown for valid payment types");
		}
	}
}
