package parrot;

import parrot.actions.ParrotActions;
import parrot.actions.ParrotActionsFactory;

public class Parrot {
    private final ParrotActions parrotActions;

    public Parrot(ParrotTypeEnum type, ParrotDetails parrotDetails) {
        ParrotActionsFactory factory = new ParrotActionsFactory(parrotDetails);
        this.parrotActions = factory.createParrotActions(type);
    }

    public double getSpeed() {
        return parrotActions.getSpeed();
    }

    public String getCry() {
        return parrotActions.getCry();
    }
}
