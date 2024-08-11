package vehiclebookingsystem.payment;

/**
 * A payment method
 */
public class GooglePay extends Payment{

    private final String name;

    /**
     * constructor
     */
    public GooglePay(){
        this.name = "Google Pay";
    }

    /**
     * @return get the name of the payment method
     */
    public String getName() {
        return name;
    }

    /**
     * prints the amount being paid
     * @param amount the amount the user wants to pay
     * @return true, since there is no payment limit
     */
    @Override
    public boolean processPayment(double amount) {
        System.out.printf("Payment processed by Google Pay: $%.2f%n", amount);
        return true;
    }
}
