
package Question2;

public class FixedAccount implements Interest {

    private double balance;

    public FixedAccount(double balance) {
        this.balance = balance;
    }
    
    @Override
    public double computeInterest(double balance) {
        return balance * 0.03;
    }
    
}
