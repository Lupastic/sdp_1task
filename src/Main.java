public class Main {
    public static void main(String[] args) {
        PaymentMethod creditCard = new CreditCardPayment();
        PaymentMethod paypal = new PayPalPayment();
        PaymentMethod bankTransfer = new BankTransferPayment();

        PaymentProcessor processor1 = new PaymentProcessor(creditCard);
        processor1.process(100.0);

        PaymentProcessor processor2 = new PaymentProcessor(paypal);
        processor2.process(200.0);

        PaymentProcessor processor3 = new PaymentProcessor(bankTransfer);
        processor3.process(300.0);
    }
}