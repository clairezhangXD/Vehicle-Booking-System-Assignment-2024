package vehiclebookingsystem.console;

import vehiclebookingsystem.actions.Action;
import vehiclebookingsystem.actions.ActionCapable;
import vehiclebookingsystem.user.User;
import vehiclebookingsystem.vehicles.*;

import java.util.List;
import java.util.ArrayList;

/**
 * Base class that creates the vehicles that are available for booking, as well as displays the console the user can
 * interact with
 */
public class BookingSystem {

    //attributes
    private final Vehicle[] availableVehicles;
    private User user;

    /**
     * constructor
     */
    public BookingSystem() {

        this.availableVehicles = new Vehicle[6];
        this.user = new User();
    }


    /**
     * gets the booking system console up and running
     */
    public void printStatus() {
        System.out.println("Welcome to FIT2099 Booking System");
        this.createVehicles();
        this.consoleMenu(user);
    }


    private void createVehicles() {
        Sedan sedan1 = new Sedan("Lexus", 2023, 200.00, 500, EngineType.ELECTRIC);
        Sedan sedan2 = new Sedan("BMW", 2022, 150.00, 600, EngineType.PETROL);
        SUV suv1 = new SUV("Tesla", 2023, 300.00, 5, EngineType.ELECTRIC);
        SUV suv2 = new SUV("Mercedes", 2020, 500.00, 7, EngineType.DIESEL);
        Truck truck1 = new Truck("Ford", 2019, 400.00, 1.0);
        Truck truck2 = new Truck("Volkswagen", 2020, 450.00, 1.2);

        // store vehicles in array
        this.availableVehicles[0] = sedan1;
        this.availableVehicles[1] = sedan2;
        this.availableVehicles[2] = suv1;
        this.availableVehicles[3] = suv2;
        this.availableVehicles[4] = truck1;
        this.availableVehicles[5] = truck2;
    }


    private void consoleMenu(User user) {
        while (!user.getIsUserDone()) {
            List<Action> actions = new ArrayList<>();
            List<ActionCapable> actionCapables = new ArrayList<>();
            actionCapables.add(user);
            actionCapables.addAll(List.of(availableVehicles));
            for (ActionCapable actionCapable : actionCapables) {
                actions.addAll(actionCapable.allowableActions());
            }

            System.out.println("#########################################");
            Action action = Menu.showMenu(actions);
            System.out.println(action.execute(user));

        }
    }
}



