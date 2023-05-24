public class ReturnedOrderState implements OrderState {
    private ReturnedOrderState() {}
    private static ReturnedOrderState instace = new ReturnedOrderState();
    public static ReturnedOrderState getInstance() {
        return instace;
    }

    public String getName() {
        return "Devolvido";
    }
}
