package vehiclebookingsystem.actions;

import vehiclebookingsystem.booking.Booking;
import vehiclebookingsystem.user.User;

/**
 * removes a selected vehicle
 */
public class RemoveBookingAction implements Action {

    private Booking myBooking;

    /**
     * constructor
     * @param myBooking booking that is to be removed from the user
     */
    public RemoveBookingAction(Booking myBooking){
        this.myBooking = myBooking;
    }

    /**
     * Performs the booking removal
     * @param user the person interacting with the booking system
     * @return string that tells the user the booking has been removed
     */
    @Override
    public String execute(User user) {
        user.removeBooking(myBooking);
        return myBooking + " is successfully removed from the Booking System!";
    }

    /**
     *
     * @return string that tells the user they can remove the respective selected vehicle
     */
    @Override
    public String menuDescription() {
        return "Remove the following vehicle from the Booking System:\n" + myBooking;
    }
    }


