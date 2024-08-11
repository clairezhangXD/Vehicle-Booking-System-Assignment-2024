package vehiclebookingsystem.actions;

import vehiclebookingsystem.user.User;

/**
 * shut down the booking system
 */
public class ExitAction implements Action {
    /**
     * setting the user to done, which ends the booking system while loop
     * @param user the person interacting with the booking system
     * @return string that thanks the user
     */
    @Override
    public String execute(User user) {
        user.setUserDone();
        return "Thank you for visiting FIT2099 Booking System!";
    }

    /**
     *
     * @return string that tells the user they can exit the system
     */
    @Override
    public String menuDescription() {
        return "Exit the system.";
    }
}
