package Solid.StrategyPattern;

public class SameInstrumentRefundStrategy implements RefundStrategy {
    @Override
    public void doRefund() {
        System.out.println("Refund initiated for the same instrument");
    }
    
}
