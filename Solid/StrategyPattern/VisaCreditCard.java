package Solid.StrategyPattern;

public class VisaCreditCard extends CreditCard implements RefundCompatibleCreditCard{
    
    private String cardNumber;
    private String cardHolder;
    private String expiryDate;
    private int cvv;
    private RefundStrategy refundStrategy;

    public VisaCreditCard() {
        this.refundStrategy = new BankAccountRefundStrategy();
    }
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
         this.refundStrategy.doRefund();
    }
    
}
