
package Question1;

public class BulkDiscount extends DiscountPolicy {
    
    private int minimum;
    private double discountRate;
    
    public BulkDiscount(int minimum,double discountRate) {
        this.minimum = minimum;
        this.discountRate = discountRate;
    }

    @Override
    public double computeDiscount(int count, double itemCost) {
        if (count > minimum) {
            return itemCost * discountRate;
        } else {
            return 0;
        }
    }
}
