public class WaitingPaymentOrderState implements OrderState {
    private WaitingPaymentOrderState() {}
    private static WaitingPaymentOrderState instace = new WaitingPaymentOrderState();
    public static WaitingPaymentOrderState getInstance() {
        return instace;
    }

    public String getName() {
        return "Esperando pagamento";
    }
}
