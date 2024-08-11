package vehiclebookingsystem.actions;

import vehiclebookingsystem.booking.Booking;
import vehiclebookingsystem.user.User;

/**
 * Confirm the user's bookings and removes the bookings, ready for the next booking
 */
public class ConfirmAction implements Action {

    /**
     * sum the prices of all the selected vehicles and deduct this from the user's balance, then clear the bookings
     * @param user the person interacting with the booking system
     * @return string that tells the user their bookings have been confirmed
     */
    @Override
    public String execute(User user) {
        double totalPrice = 0;
        for (Booking bookedVehicle : user.getBookedVehicles()){
            //deduct price from balance
            double price = bookedVehicle.getPrice();
            totalPrice += price;
            price *= -1;
            user.addBalance(price);

        }
        //clear all bookings
        user.clearBookings();
        return String.format("Bookings confirmed. A total price of $%.2f has been deducted from your balance. " +
                "You have $%.2f remaining. Thank you for using FIT2099 Booking System", totalPrice, user.viewBalance());
    }

    /**
     *
     * @return string that displays to the user they can confirm their bookings
     */
    @Override
    public String menuDescription() {
        return "Confirm bookings.";
    }
}
