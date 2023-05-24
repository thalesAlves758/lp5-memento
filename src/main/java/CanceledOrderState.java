public class CanceledOrderState implements OrderState {
    private CanceledOrderState() {}
    private static CanceledOrderState instace = new CanceledOrderState();
    public static CanceledOrderState getInstance() {
        return instace;
    }

    public String getName() {
        return "Cancelado";
    }
}
