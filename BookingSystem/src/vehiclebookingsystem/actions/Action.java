package vehiclebookingsystem.actions;

import vehiclebookingsystem.user.User;

/**
 * What the booking system is capable of doing
 */
public interface Action {


    /**
     *
     * @param user the person interacting with the booking system
     * @return strings that tell the user if the action is successful or not
     */
    public String execute(User user);
        //performs the action

    /**
     *
     * @return string that displays to the user what the action is
     */
    public String menuDescription();

}
