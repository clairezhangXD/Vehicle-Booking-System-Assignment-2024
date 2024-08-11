package vehiclebookingsystem.vehicles;

import vehiclebookingsystem.Utility;

/**
 * Type of Vehicle with a maximum loading
 */
public class Truck extends Vehicle {
    //attributes
    private double loading;

    final int LOWER_ID = 100;
    final int UPPER_ID = 999;


    /**
     * constructor
     * @param inputBrand Truck brand name
     * @param inputYear Truck year made
     * @param inputPrice Truck price
     * @param inputLoading max tonnes the Truck can carry
     */
    public Truck(String inputBrand, int inputYear, double inputPrice, double inputLoading) {
        super(inputBrand, inputYear, inputPrice);
        this.loading = inputLoading;
        this.setID("Truck" + Utility.generateRandomInt(LOWER_ID, UPPER_ID));
    }

    //methods

    /**
     * @return get the loading amount
     */
    public double getLoading() {
        return loading;
    }

    /**
     * turn the Truck information into one string
     * @return the truck information
     */
    @Override
    public String toString() {
        return super.toString() + " | Loading " + this.getLoading();
    }
}