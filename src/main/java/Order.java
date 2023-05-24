import java.util.ArrayList;
import java.util.List;

public class Order {
    private OrderState currentState;
    private List<OrderState> memento = new ArrayList<>();

    public OrderState getState() {
        return this.currentState;
    }

    public void setState(OrderState state) {
        this.currentState = state;
        this.memento.add(state);
    }

    public void restoreState(int index) {
        if (index < 0 || index > this.memento.size() - 1) {
            throw new IllegalArgumentException("Invalid index");
        }

        this.currentState = this.memento.get(index);
    }

    public List<OrderState> getStates() {
        return this.memento;
    }
}
