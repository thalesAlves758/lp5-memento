public class FinishedOrderState implements OrderState {
    private FinishedOrderState() {}
    private static FinishedOrderState instace = new FinishedOrderState();
    public static FinishedOrderState getInstance() {
        return instace;
    }

    public String getName() {
        return "Finalizado";
    }
}
