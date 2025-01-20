package Solid.Example6.ProblematicCode;

public class AmexCreditCard extends CreditCard{
    private String cardNumber;
    private String cardHolder;
    private String expiryDate;
    private int cvv;

    public void swipeAndPay() {
        System.out.println("Payment done by swiping Amex card");
    }

    public void doRefund() {
        System.out.println("Refund done for Amex card");
    }

    public void tapAndPay() {
        System.out.println("Payment done by tapping Amex card");
    }

    public void upiPayment() {
        System.out.println("Payment done by UPI for Amex card");
    } 
    public void intlPayment() {
        System.out.println("Payment done by International for Amex card");
    }
}
