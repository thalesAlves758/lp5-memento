public class DeliveredOrderState implements OrderState {
    private DeliveredOrderState() {}
    private static DeliveredOrderState instace = new DeliveredOrderState();
    public static DeliveredOrderState getInstance() {
        return instace;
    }

    public String getName() {
        return "Entregue";
    }
}
