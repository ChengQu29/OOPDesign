import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import singleResponsibilityAfter.Order;
import singleResponsibilityAfter.PaymentProcessor;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class OrderTest_SingleResponsibilityAfter {
	private Order order;
	private PaymentProcessor processor;

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
			processor = new PaymentProcessor();
			processor.payDebit(order, "0372846");
			System.out.println(order.getTotalPrice());
			assertEquals("paid", order.getStatus());
		} catch (Exception e) {
			fail("No exception should be thrown for valid payment types");
		}
	}
}
