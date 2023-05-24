import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class OrderTest {
    @Test
    void shouldStoreStates() {
        Order order = new Order();
        order.setState(WaitingPaymentOrderState.getInstance());
        order.setState(ProcessingOrderState.getInstance());
        assertEquals(2, order.getStates().size());
    }

    @Test
    void shouldReturnInitialState() {
        Order order = new Order();
        order.setState(WaitingPaymentOrderState.getInstance());
        order.setState(ProcessingOrderState.getInstance());
        order.restoreState(0);
        assertEquals(WaitingPaymentOrderState.getInstance(), order.getState());
    }

    @Test
    void shouldReturnPreviousState() {
        Order order = new Order();
        order.setState(WaitingPaymentOrderState.getInstance());
        order.setState(ProcessingOrderState.getInstance());
        order.setState(SentOrderState.getInstance());
        order.setState(DeliveredOrderState.getInstance());
        order.restoreState(2);
        assertEquals(SentOrderState.getInstance(), order.getState());
    }

    @Test
    void shouldThrowInvalidIndexException() {
        try {
            Order order = new Order();
            order.restoreState(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Invalid index", e.getMessage());
        }
    }
}
