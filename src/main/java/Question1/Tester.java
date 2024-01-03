
package Question1;

public class Tester {
    public static void main(String[] args) {
        // Example usage
        DiscountPolicy bulkDiscount = new BulkDiscount(5, 0.15);
        DiscountPolicy otherDiscount = new OtherDiscount();
        DiscountPolicy combineDiscount = new CombineDiscount(bulkDiscount, otherDiscount);

        int itemCount = 7;
        double itemCost = 50.0;

        double bulkDiscountAmount = bulkDiscount.computeDiscount(itemCount, itemCost);
        double otherDiscountAmount = otherDiscount.computeDiscount(itemCount, itemCost);
        double combineDiscountAmount = combineDiscount.computeDiscount(itemCount, itemCost);

        System.out.println("Bulk Discount Amount: " + bulkDiscountAmount);
        System.out.println("Other Discount Amount: " + otherDiscountAmount);
        System.out.println("Combined Discount Amount: " + combineDiscountAmount);
    }
}
