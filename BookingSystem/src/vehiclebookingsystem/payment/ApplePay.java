package vehiclebookingsystem.payment;

/**
 * A payment method that has a limitation of $1000
 */
public class ApplePay extends Payment {

    private final String name;

    /**
     * constructor
     */
    public ApplePay(){
        this.name = "Apple Pay";
    }

    /**
     * @return get the name of the payment method
     */
    public String getName() {
        return name;
    }

    /**
     * checks if the amount is within the limit
     * @param amount the amount the user wants to pay
     * @return returns true if amount is within the limit, and false otherwise
     */
    @Override
    public boolean processPayment(double amount) {
        double LIMIT = 1000;
        if (amount > LIMIT) {
            System.out.printf("Limit exceeded for payment of $%.2f%n", amount);
            return false;
        }
        else {
            System.out.printf("Payment processed by Apple Pay: $%.2f%n", amount);
            return true;
        }
    }
}
