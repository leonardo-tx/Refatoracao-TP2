package parrot.actions;

import parrot.ParrotDetails;

public class NorwegianBlueParrotActions extends ParrotActions {
    public NorwegianBlueParrotActions(ParrotDetails parrotDetails) {
        super(parrotDetails);
    }

    @Override
    public double getSpeed() {
        if (parrotDetails.isNailed()) {
            return 0;
        }
        return Math.min(24.0, parrotDetails.getVoltage() * DEFAULT_BASE_SPEED);
    }

    @Override
    public String getCry() {
        return parrotDetails.getVoltage() > 0 ? "Bzzzzzz" : "...";
    }
}
