package Solid.Example6.ProblematicCode;

public class MasterCard extends CreditCard {
    private String cardNumber;
    private String cardHolder;
    private String expiryDate;
    private int cvv;

    public void swipeAndPay() {
        System.out.println("Payment done by swiping Master card");
    }

    public void doRefund() {
        System.out.println("Refund done for Master card");
    }

    public void tapAndPay() {
        System.out.println("Payment done by tapping Master card");
    }

    public void upiPayment() {
        System.out.println("Payment done by UPI for Master card");
    }
    public void intlPayment() {
        System.out.println("Payment done by International for Masters card");
    }
    
}
