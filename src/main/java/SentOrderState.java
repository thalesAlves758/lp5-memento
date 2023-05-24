public class SentOrderState implements OrderState {
    private SentOrderState() {}
    private static SentOrderState instace = new SentOrderState();
    public static SentOrderState getInstance() {
        return instace;
    }

    public String getName() {
        return "Enviado";
    }
}
