public class ProcessingOrderState implements OrderState {
    private ProcessingOrderState() {}
    private static ProcessingOrderState instace = new ProcessingOrderState();
    public static ProcessingOrderState getInstance() {
        return instace;
    }

    public String getName() {
        return "Em processamento";
    }
}
