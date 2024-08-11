package vehiclebookingsystem.actions;

import java.util.List;

/**
 * all available actions
 */
public interface ActionCapable {
    /**
     *
     * @return the actions
     */
    public List<Action> allowableActions();

}
