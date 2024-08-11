package vehiclebookingsystem.payment;

/**
 * a base class for different payment options
 */
public abstract class Payment {

    /**
     * name of the payment method
     */
    public String name;

    /**
     * @return get the name of the payment method
     */
    public abstract String getName();

    /**
     *
     * @param amount the amount the user wants to pay
     * @return true if the payment can be processed, false otherwise
     */
    public abstract boolean processPayment(double amount);

}
