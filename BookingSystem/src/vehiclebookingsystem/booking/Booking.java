package vehiclebookingsystem.booking;

import vehiclebookingsystem.vehicles.Vehicle;

/**
 * object that contains the vehicle being booked
 */
public class Booking {
    //attributes
    private final Vehicle vehicle;

    /**
     * constructor
     * @param vehicle the vehicle the user would like to book
     */
    public Booking(Vehicle vehicle){
        this.vehicle = vehicle;
    }

    /**
     * @return get the price of the vehicle being booked
     */
    public double getPrice(){
        return vehicle.getPrice();
    }

    /**
     * @return the details of the vehicle being booked
     */
    public String toString() {
        return vehicle.toString();
    }



}
