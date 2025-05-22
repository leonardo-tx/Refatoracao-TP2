package parrot.actions;

import parrot.ParrotDetails;

public class EuropeanParrotActions extends ParrotActions {
    public EuropeanParrotActions(ParrotDetails parrotDetails) {
        super(parrotDetails);
    }

    @Override
    public double getSpeed() {
        return DEFAULT_BASE_SPEED;
    }

    @Override
    public String getCry() {
        return "Sqoork!";
    }
}
