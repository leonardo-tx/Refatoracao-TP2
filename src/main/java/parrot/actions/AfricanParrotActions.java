package parrot.actions;

import parrot.ParrotDetails;

public class AfricanParrotActions extends ParrotActions {
    public AfricanParrotActions(ParrotDetails parrotDetails) {
        super(parrotDetails);
    }

    @Override
    public double getSpeed() {
        return Math.max(0, DEFAULT_BASE_SPEED - LOAD_FACTOR * parrotDetails.getNumberOfCoconuts());
    }

    @Override
    public String getCry() {
        return "Sqaark!";
    }
}
