package vehiclebookingsystem.user;

import vehiclebookingsystem.actions.*;
import vehiclebookingsystem.booking.Booking;
import vehiclebookingsystem.payment.*;
import java.util.ArrayList;
import java.util.List;

/**
 * object that stores the user's status and vehicle selections
 */
public class User implements ActionCapable {
    //attributes
    private double balance;
    private boolean isUserDone;
    private List<Booking> bookings;


    /**
     * constructor
     */
    public User() {
        this.balance = 0;
        this.isUserDone = false;
        this.bookings = new ArrayList<Booking>();
    }


    //methods
    //for balance

    /**
     * view the balance
     * @return the balance
     */
    public double viewBalance() {
        return this.balance;
    }

    /**
     * add an amount to the balance
     * @param additionalBalance the amount to add
     */
    public void addBalance(double additionalBalance) {
        this.balance += additionalBalance;
    }

    /**
     * Clear the list of bookings
     */
    public void clearBookings(){
        this.bookings.clear();
    }

    //for done

    /**
     * check the status of the user
     * @return the status of the user
     */
    public boolean getIsUserDone() {
        return this.isUserDone;
    }

    /**
     * set the status of the user to done
     */
    public void setUserDone() {
        this.isUserDone = true;
    }

    /**
     * add the vehicle selected by the user as a booking
     * @param booking the selected vehicle
     */
    //for bookings
    public void addBooking(Booking booking) {
        this.bookings.add(booking);
    }

    /**
     * remove booking of the vehicle previously selected by the user
     * @param booking the previously selected vehicle
     */
    public void removeBooking(Booking booking) {this.bookings.remove(booking);}

    /**
     * displays the selected vehicles and their details
     */
    public void displayBookedVehicles() {
        for (Booking bookedVehicles : this.bookings)
            System.out.println("Booking detail: "+ bookedVehicles.toString());
    }

    /**
     * @return get the details of the vehicles that have been selected by the user
     */
    public List <Booking> getBookedVehicles(){
        return this.bookings;
    }

    /**
     * creates all the actions that the user is capable of doing in the booking system
     * @return the list of actions
     */
    @Override
    public List<Action> allowableActions() {
        List<Action> actions = new ArrayList<>();
        actions.add(new AddBalanceAction(new ApplePay()));
        actions.add(new AddBalanceAction(new GooglePay()));
        actions.add(new ViewBalanceAction());
        actions.add(new DisplayBookingAction());
        actions.add(new ConfirmAction());
        actions.add(new ExitAction());
        for (Booking booking : bookings) {
            actions.add(new RemoveBookingAction(booking));
        }
        return actions;
    }
}

