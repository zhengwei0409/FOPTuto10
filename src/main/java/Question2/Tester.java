
package Question2;

public class Tester {
    public static void main(String[] args) {
        
        double savingsBalance = 5000.0;
        double fixedBalance = 10000.0;

        SavingsAccount savingsAccount = new SavingsAccount(savingsBalance);
        FixedAccount fixedAccount = new FixedAccount(fixedBalance);

        double savingsInterest = savingsAccount.computeInterest(savingsBalance);
        double fixedInterest = fixedAccount.computeInterest(fixedBalance);

        System.out.println("Savings Account Annual Interest: " + savingsInterest);
        System.out.println("Fixed Account Annual Interest: " + fixedInterest);
    }
}
   
