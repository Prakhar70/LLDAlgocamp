package Solid.Example6.ProblematicCode;

public class VisaCreditCard extends CreditCard {
    private String cardNumber;
    private String cardHolder;
    private String expiryDate;
    private int cvv;

    public void swipeAndPay() {
        System.out.println("Payment done by swiping Visa card");
    }

    public void doRefund() {
        System.out.println("Refund done for Visa card");
    }

    public void tapAndPay() {
        System.out.println("Payment done by tapping Visa card");
    }

    public void upiPayment() {
        System.out.println("Payment done by UPI for Visa card");
    }
    public void intlPayment() {
        System.out.println("Payment done by International for Visa card");
    }
    
}
