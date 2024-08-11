package vehiclebookingsystem.actions;

import vehiclebookingsystem.user.User;

/**
 * Displays the vehicle bookings yet to be confirmed
 */
public class DisplayBookingAction implements Action {

    /**
     * displays the vehicles selected
     * @param user the person interacting with the booking system
     * @return string that tells the user they have come to the end of their bookings
     */
    @Override
    public String execute(User user) {
        user.displayBookedVehicles();
        return "---END---";
    }

    /**
     *
     * @return string that displays to the user they can look at their currently selected vehicles
     */
    @Override
    public String menuDescription() {
        return "View bookings.";
    }
}
