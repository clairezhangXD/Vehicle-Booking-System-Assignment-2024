package vehiclebookingsystem.actions;

import vehiclebookingsystem.user.User;

/**
 * view the user's balance
 */
public class ViewBalanceAction implements Action {

    /**
     * displays the balance
     * @param user the person interacting with the booking system
     * @return the balance
     */
    @Override
    public String execute(User user) {
        return String.format("You have a balance of $%.2f", user.viewBalance());
    }

    /**
     *
     * @return tells the user they can view their balance
     */
    public String menuDescription(){
        return "View Balance.";
    }
}
