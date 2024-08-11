package vehiclebookingsystem.actions;

import vehiclebookingsystem.booking.Booking;
import vehiclebookingsystem.user.User;

/**
 * Adding a booking to the booking system
 */
public class AddBookingAction implements Action {
    private Booking myBooking;

    /**
     * constructor
     * @param myBooking booking that is to be added to the user
     */
    public AddBookingAction(Booking myBooking){
        this.myBooking = myBooking;
    }

    /**
     * add the booking to the user
     * @param user the person interacting with the booking system
     * @return string that tells the user the booking was successful
     */
    @Override
    public String execute(User user) {
        user.addBooking(myBooking);
        return "Booking detail: " + myBooking + " is successfully added to the Booking System!";
    }

    /**
     *
     * @return string that displays to the user what vehicle they can book
     */
    @Override
    public String menuDescription() {
        return "Add the following vehicle to the Booking System:\n" + myBooking;
    }


}
