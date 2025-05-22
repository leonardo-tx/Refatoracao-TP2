package parrot;

public class Parrot {
    private final ParrotTypeEnum type;
    private final ParrotDetails parrotDetails;

    public Parrot(ParrotTypeEnum type, ParrotDetails parrotDetails) {
        this.type = type;
        this.parrotDetails = parrotDetails;
    }

    public double getSpeed() {
        return switch (type) {
            case EUROPEAN -> getBaseSpeed();
            case AFRICAN -> Math.max(0, getBaseSpeed() - getLoadFactor() * parrotDetails.getNumberOfCoconuts());
            case NORWEGIAN_BLUE -> (parrotDetails.isNailed()) ? 0 : getBaseSpeed(parrotDetails.getVoltage());
        };
    }

    private double getBaseSpeed(double voltage) {
        return Math.min(24.0, voltage * getBaseSpeed());
    }

    private double getLoadFactor() {
        return 9.0;
    }

    private double getBaseSpeed() {
        return 12.0;
    }

    public String getCry() {
        return switch (type) {
            case EUROPEAN -> "Sqoork!";
            case AFRICAN -> "Sqaark!";
            case NORWEGIAN_BLUE -> parrotDetails.getVoltage() > 0 ? "Bzzzzzz" : "...";
        };
    }
}
