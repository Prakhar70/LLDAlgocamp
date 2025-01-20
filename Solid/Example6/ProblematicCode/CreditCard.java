package Solid.Example6.ProblematicCode;

public abstract class CreditCard {
    private String cardNumber;
    private String cardHolder;
    private String expiryDate;
    private int cvv;

    // Getters and Setters

    public abstract void swipeAndPay();
    public abstract void doRefund();
    public abstract void tapAndPay();
    public abstract void upiPayment();
    public abstract void intlPayment();
}
