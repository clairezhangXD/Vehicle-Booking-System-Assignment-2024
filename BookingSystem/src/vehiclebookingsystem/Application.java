package vehiclebookingsystem;

import vehiclebookingsystem.console.BookingSystem;

/**
 * Running this application starts the vehicle booking system
 */
public class Application {

    /**
     * begin booking system
     * @param args
     */
    public static void main(String[] args) {
        BookingSystem bookingSystem = new BookingSystem();
        bookingSystem.printStatus();



    }
}
