package vehiclebookingsystem.vehicles;

import vehiclebookingsystem.Utility;

/**
 * type of vehicle with a number of seats and engine type
 */
public class SUV extends Vehicle{
    //attributes
    private int seats;
    private EngineType engineType;

    final int LOWER_ID = 1000;
    final int UPPER_ID = 9999;

    //constructor

    /**
     * constructor
     * @param inputBrand SUV brand name
     * @param inputYear SUV year made
     * @param inputPrice SUV price
     * @param inputSeats number of seats
     * @param inputEngineType engine fuel type
     */
    public SUV(String inputBrand, int inputYear, double inputPrice, int inputSeats, EngineType inputEngineType) {
        super(inputBrand, inputYear, inputPrice);
        this.seats = inputSeats;
        this.engineType = inputEngineType;
        this.setID("SUV" + Utility.generateRandomInt(LOWER_ID, UPPER_ID));
    }

    //methods

    /**
     * @return get the number of seats
     */
    public int getSeats() {
        return seats;
    }

    /**
     * @return the engine type
     */
    public EngineType getEngineType() {
        return engineType;
    }

    /**
     * turn the SUV information into one string
     * @return the SUV information
     */
    @Override
    public String toString() {
        return super.toString() + " | Number of Seats: " + this.getSeats() + " | Fuel Type: " + this.getEngineType();
    }
}
