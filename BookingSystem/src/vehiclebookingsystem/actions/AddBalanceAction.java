package vehiclebookingsystem.actions;

import vehiclebookingsystem.payment.Payment;
import vehiclebookingsystem.user.User;

import java.util.*;

/**
 * Adding to the balance in the booking system
 */
public class AddBalanceAction implements Action {

    private Payment myPayment;


    /**
     * constructor
     * @param paymentType the payment method selected by the user
     */
    public AddBalanceAction(Payment paymentType){
        this.myPayment = paymentType;
   }


    /**
     * attempts to add the double input from the user to the balance
     * @param user the person interacting with the booking system
     * @return a string that tells the user if the payment is successfully added to the balance or not
     */
    @Override
    public String execute(User user) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to add to your current balance: ");
        float balance = Float.parseFloat(scanner.nextLine());

        //user balance is updated if payment type gives the go (returns "true")
        boolean isProcessed = this.myPayment.processPayment(balance);
        if (isProcessed){
            user.addBalance(balance);
            return String.format("$%.2f is added to the user balance!", balance);
        }
        else {
            return ("Failed to add to the user balance.");
        }

    }

    /**
     *
     * @return string that displays to the user that adding to the balance is an action
     */
    @Override
    public String menuDescription() {
        return "Add balance with " + this.myPayment.getName();
    }

}
