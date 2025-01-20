package Solid.Example6.ProblematicCode;

public class RupayCreditCard extends CreditCard {
    private String cardNumber;
    private String cardHolder;
    private String expiryDate;
    private int cvv;

    public void swipeAndPay() {
        System.out.println("Payment done by swiping Rupay card");
    }

    public void doRefund() {
        System.out.println("Refund done for Rupay card");
    }

    public void tapAndPay() {
        System.out.println("Payment done by tapping Rupay card");
    }

    public void upiPayment() {
        System.out.println("Payment done by UPI for Rupay card");
    }
    public void intlPayment() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
