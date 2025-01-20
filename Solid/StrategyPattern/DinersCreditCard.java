package Solid.StrategyPattern;

public class DinersCreditCard extends CreditCard{
    
    private String cardNumber;
    private String cardHolder;
    private String expiryDate;
    private int cvv;
    @Override
    public void swipeAndPay() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'swipeAndPay'");
    }
    @Override
    public void onlinePayment() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'onlinePayment'");
    }
    @Override
    public void tapAndPay() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'tapAndPay'");
    }
   
    
}
