package vehiclebookingsystem.vehicles;

import vehiclebookingsystem.actions.Action;
import vehiclebookingsystem.actions.ActionCapable;
import vehiclebookingsystem.actions.AddBookingAction;
import vehiclebookingsystem.booking.Booking;

import java.util.ArrayList;
import java.util.List;

/**
 * base class for all vehicle types
 */
public class Vehicle implements ActionCapable {

    //attributes
    private String brand;
    private int year;
    private double price;

    private String ID;


    /**
     * constructor
     * @param inputBrand brand name
     * @param inputYear year the vehicle was made
     * @param inputPrice purchase price
     */
    public Vehicle(String inputBrand, int inputYear, double inputPrice) {
        this.brand = inputBrand;
        this.year = inputYear;
        this.price = inputPrice;
        this.ID = "0";
    }

    //methods

    /**
     * @return get the brand name
     */
    public String getBrand() {
        return brand;
    }

    /**
     * @return get the year the vehicle was made
     */
    public int getYear() {
        return year;
    }

    /**
     * @return get the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @return get the vehicle ID
     */
    public String getID() { return ID; }

    /**
     * Change the ID
     * @param newID what the ID will be changed to
     */
    public void setID(String newID) {
        this.ID = newID;
    }

    /**
     * combine the information about the vehicle into one string
     * @return the information about the vehicle
     */
    public String toString() {return String.format("Booking detail: " + this.getID() + " | Brand: " + this.getBrand() +
            " | Year: " + this.getYear() + " | Price: $%.2f", this.getPrice());
    }

    /**
     * create add booking action for the vehicle so that user can book this vehicle
     * @return the actions list that contains the booking that the vehicle is contained in
     */
    @Override
    public List<Action> allowableActions() {
        List<Action> actions = new ArrayList<>();
        Booking booking = new Booking(this);
        actions.add(new AddBookingAction(booking));
        return actions;
    }
}





