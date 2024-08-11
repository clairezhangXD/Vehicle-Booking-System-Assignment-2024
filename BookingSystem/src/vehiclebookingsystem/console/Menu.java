package vehiclebookingsystem.console;

import vehiclebookingsystem.actions.Action;

import java.util.*;

/**
 * maps a letter of the alphabet to a particular action that the user can select
 */
public class Menu {

    /**
     * creates an array list of the alphabet. Each letter is then allocated to an action in actions in a hash map,
     * with each allocated letter and action being printed to the console. The user is repeatedly prompted to input
     * a letter until an allocated letter is entered
     * @param actions the options the user is capable of doing in the booking system
     * @return the action corresponding to the user's letter input
     */
    public static Action showMenu(List<Action> actions) {
        Scanner scanner = new Scanner(System.in);
        List<Character> freeChars = new ArrayList<Character>();
        Map<Character, Action> keyToActionMap = new HashMap<>();


        for (char j = 'a'; j <= 'z'; j++) {
            freeChars.add(j);
        }


        for (Action action : actions) {
            char c = freeChars.get(0);
            freeChars.remove(Character.valueOf(c));
            keyToActionMap.put(c, action);
            System.out.println(c + ": " + action.menuDescription());
        }


        char key;
        do {
            key = scanner.next().charAt(0);
        } while (!keyToActionMap.containsKey(key));


        return keyToActionMap.get(key);
    }
}

