package parrot.actions;

import parrot.ParrotDetails;

public abstract class ParrotActions {
    protected static final double DEFAULT_BASE_SPEED = 12.0;
    protected static final double LOAD_FACTOR = 9.0;

    protected final ParrotDetails parrotDetails;

    public ParrotActions(ParrotDetails parrotDetails) {
        this.parrotDetails = parrotDetails;
    }

    public abstract double getSpeed();

    public abstract String getCry();
}
