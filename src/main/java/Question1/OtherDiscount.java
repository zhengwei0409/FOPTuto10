
package Question1;

public class OtherDiscount extends DiscountPolicy {

    @Override
    public double computeDiscount(int count, double itemCost) {
        if (count >= 1 && count <= 2) {
            return 0;
        } else if (count >= 3 && count <= 5) {
            return itemCost * 0.1;
        } else if (count >= 6 && count <= 8) {
            return itemCost * 0.2;
        } else {
            return itemCost * 0.3;
        }
    }
    
}
