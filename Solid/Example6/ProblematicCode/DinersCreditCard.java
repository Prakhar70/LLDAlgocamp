package Solid.Example6.ProblematicCode;

public class DinersCreditCard extends CreditCard{
    private String cardNumber;
    private String cardHolder;
    private String expiryDate;
    private int cvv;

    public void swipeAndPay() {
        System.out.println("Payment done by swiping Diners card");
    }

    public void doRefund() {
        System.out.println("Refund done for Diners card");
    }

    public void tapAndPay() {
        System.out.println("Payment done by tapping Diners card");
    }

    public void upiPayment() {
        System.out.println("Payment done by UPI for Diners card");
    }
    public void intlPayment() {
        System.out.println("Payment done by International for Diners card");
    }
}
