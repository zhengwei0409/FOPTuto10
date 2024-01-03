
package Question2;


public class SavingsAccount implements Interest {

    private double balance;
    
    public SavingsAccount(double balance) {
        this.balance = balance;
    }
    
    @Override
    public double computeInterest(double balance) {
        return balance * 0.005;
    }
    
}
