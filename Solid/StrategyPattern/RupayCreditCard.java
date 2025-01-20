package Solid.StrategyPattern;

public class RupayCreditCard extends CreditCard implements UpiCompatibleCreditCard, RefundCompatibleCreditCard{
    
    private String cardNumber;
    private String cardHolder;
    private String expiryDate;
    private int cvv;

    private RefundStrategy refundStrategy;

    RupayCreditCard() {
        this.refundStrategy = new SameInstrumentRefundStrategy();
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
    public void upiPayment() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'payUsingUpi'");
    }
    @Override
    public void doRefund() {
       this.refundStrategy.doRefund();
    }
}
