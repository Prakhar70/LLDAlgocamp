package Solid.StrategyPattern;

public class BankAccountRefundStrategy implements RefundStrategy {
    @Override
    public void doRefund() {
        System.out.println("Refund initiated for the bank account");
    }
    
}
