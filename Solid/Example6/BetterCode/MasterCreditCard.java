package Solid.Example6.BetterCode;

public class MasterCreditCard extends CreditCard implements RefundCompatibleCreditCard{
    
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
    @Override
    public void doRefund() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'doRefund'");
    }
    
}
