package vehiclebookingsystem.vehicles;

import vehiclebookingsystem.Utility;

/**
 * Type of Vehicle with maximum range and has a engine type
 */
public class Sedan extends Vehicle{

    //attributes
    private int range;
    private EngineType engineType;

    final int LOWER_ID = 10000;
    final int UPPER_ID = 99999;


    /**
     * constructor
     * @param inputBrand sedan brand name
     * @param inputYear sedan year made
     * @param inputPrice sedan price
     * @param inputRange maximum range in kms the sedan can be driven
     * @param inputEngineType engine fuel
     */
    public Sedan(String inputBrand, int inputYear, double inputPrice, int inputRange, EngineType inputEngineType) {
        super(inputBrand, inputYear, inputPrice);
        this.range = inputRange;
        this.engineType = inputEngineType;
        this.setID("Sedan" + Utility.generateRandomInt(LOWER_ID, UPPER_ID));
    }

    //methods

    /**
     * @return get the range
     */
    public int getRange() {
        return range;
    }

    /**
     * @return get the engine type
     */
    public EngineType getEngineType() {
        return engineType;
    }

    /**
     * turn the sedan information into one string
     * @return the sedan information
     */
    @Override
    public String toString() {
        return super.toString() + " | Range: " + this.getRange() + " km | Fuel Type: " + this.getEngineType();
    }
}
