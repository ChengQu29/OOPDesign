import LiskovAfter.DebitPaymentProcessor;
import LiskovAfter.Order;
import LiskovAfter.PaypalPaymentProcessor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class OrderTest_LiskovAfter {

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
			PaypalPaymentProcessor processor = new PaypalPaymentProcessor("cq@gmail.com");
			processor.pay(order);

			/*
			DebitPaymentProcessor processorDebit = new DebitPaymentProcessor(43920);
			processorDebit.pay(order);
			 */
			var utcNow = OffsetDateTime.now(ZoneOffset.UTC);
			OffsetDateTime thirtyMinutesEarlier = utcNow.minusMinutes(30);
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS+00");
			String formattedOffsetDateTime = thirtyMinutesEarlier.format(formatter);

			System.out.println(formattedOffsetDateTime);


			System.out.println(order.getTotalPrice());
			assertEquals("paid", order.getStatus());
		} catch (Exception e) {
			fail("No exception should be thrown for valid payment types");
		}
	}

}
